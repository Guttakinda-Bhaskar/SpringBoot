package com.spring.jpa.customGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "Gofounders";
		String suffix = "";
		try {
			Connection connection = session.connection();
			Statement statement = connection.createStatement();
			String SQL_QUERY = "select emp_id from onpassive_emp order by emp_id desc limit 1";
			ResultSet rs = statement.executeQuery(SQL_QUERY);
			if (rs.next()) {
				String int1 = rs.getString(1);
				//System.err.println(int1);
				String substring = int1.substring(10);
				//System.err.println("------substring"+substring);
				int parseInt = Integer.parseInt(substring);
				//System.err.println("---parseInt"+parseInt);
				int i = parseInt+1;
				//System.err.println("---i-- : "+i);
				 suffix = String.valueOf(i);
				//System.err.println(suffix);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println(prefix + suffix);
		return prefix + suffix;
	}

}
