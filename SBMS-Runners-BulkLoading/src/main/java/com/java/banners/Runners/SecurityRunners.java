package com.java.banners.Runners;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.app")
@Order(1)
public class SecurityRunners implements CommandLineRunner {
	/*private Integer id;
	private List<String> name;

	@Override
	public String toString() {
		return "CLRRunner [id=" + id + ", name=" + name + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}*/
	private Integer id;
	private Set<String> name;

	@Override
	public String toString() {
		return "CLRRunner [id=" + id + ", name=" + name + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<String> getName() {
		return name;
	}

	public void setName(Set<String> name) {
		this.name = name;
	}

	@Override
	public void run(String... args) throws Exception {
System.out.println("SECURTY.run()"+this);
	}

}
