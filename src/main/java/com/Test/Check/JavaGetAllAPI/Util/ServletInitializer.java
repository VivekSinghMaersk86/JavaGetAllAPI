package com.Test.Check.JavaGetAllAPI.Util;

import com.Test.Check.JavaGetAllAPI.JavaGetAllApiApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JavaGetAllApiApplication.class);
	}

}
