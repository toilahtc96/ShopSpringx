package vn.com.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

//1
//Class ApplicationContextConfig được sử dụng để khai báo các Spring BEAN. Nó được chú thích bởi @Configuration. 
//@ComponentScan("vn.com.shop.*") - Nói với Spring tìm kiếm các Spring BEAN khác, và các Controller trong các package "con trực tiếp" của package vn.com.shop


@Configuration
@ComponentScan("vn.com.shop.*")
public class ApplicationContextConfig {

	@Bean(name = "viewResolver")
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[] { "classpath:tiles.xml" });
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
	}

	/**
	 * Configure ViewResolvers to deliver preferred views.
	 */
	
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}

}