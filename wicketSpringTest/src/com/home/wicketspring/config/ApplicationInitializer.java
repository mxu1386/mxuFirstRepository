package com.home.wicketspring.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.wicket.protocol.http.WicketFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.home.wicketspring.application.WicketSpringApplication;

public class ApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        container.addListener(new ContextLoaderListener(context));
        context.register(WicketSpringAppConfig.class);
        FilterRegistration filter = container.addFilter("wicket.myproject", WicketFilter.class);
        filter.setInitParameter("applicationClassName", WicketSpringApplication.class.getName());
        filter.setInitParameter(WicketFilter.FILTER_MAPPING_PARAM, "/*");
        filter.addMappingForUrlPatterns(null, false, "/*");
	}
}
