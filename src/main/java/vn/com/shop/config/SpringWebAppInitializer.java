package vn.com.shop.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.apache.tiles.request.velocity.render.ApplicationContextJeeConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

//2
//SpringWebAppInitializer là class thi hành (implements) interface WebApplicationInitializer. Spring sẽ đọc các thông tin cấu hình trong class này để bắt đầu (initial) ứng dụng Web của bạn. 
//Thông thường trong lớp này bạn có thể đăng ký các Servlet, các Servlet Filter, và Servlet Listener thay cho việc đăng ký chúng trong web.xml. 
//Một servlet quan trọng là org.springframework.web.servlet.DispatcherServlet

public class SpringWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(ApplicationContextConfig.class);

		// Dispatcher Servlet
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher",
				new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");

		dispatcher.setInitParameter("contextClass", appContext.getClass().getName());

		servletContext.addListener(new ContextLoaderListener(appContext));

		// UTF8 Charactor Filter.
		FilterRegistration.Dynamic fr = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);

		fr.setInitParameter("encoding", "UTF-8");
		fr.setInitParameter("forceEncoding", "true");
		fr.addMappingForUrlPatterns(null, true, "/*");
	}

}