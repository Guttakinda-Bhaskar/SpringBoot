package com.java.banners.runners;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource(value = { "classpath:student.properties" })
public class Student {
	@Value("${hid}")
	private int hid;
	@Value("${hname}")
	private String hname;
	@Value("${hloc}")
	private String hloc;
}