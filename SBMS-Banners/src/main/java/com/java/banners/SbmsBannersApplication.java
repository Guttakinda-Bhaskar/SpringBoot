package com.java.banners;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbmsBannersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsBannersApplication.class, args);

		// This is one way of the turn-off banner
		//SpringApplication application=new SpringApplication(SbmsBannersApplication.class);
		//application.setBannerMode(Banner.Mode.OFF).run(args);;

		// This is Another way is spring.main.banner-mode=off in props file
		//spring.main.banner-mode=off
		
		// This is Another way write you are own banner 
		//Write banner.txt file in resources
		System.out.println("SbmsBannersApplication.main()");
	}

}
