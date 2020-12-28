package com.java.banners.Runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.app")
public class MyRunners implements CommandLineRunner {

	private Integer id;
	private String name;
	
	@Override
	public String toString() {
		return "MyRunners [id=" + id + ", name=" + name + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyRunners.run()"+this);

	}

}
