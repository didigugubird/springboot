package com.how2java.tmall.config;


import com.how2java.tmall.interceptor.LoginInterceptor;
import com.how2java.tmall.interceptor.OtherInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfigurers implements WebMvcConfigurer{
    @Bean
    public OtherInterceptor getOtherIntercepter() {
        return new OtherInterceptor();
    }
    @Bean
    public LoginInterceptor getLoginIntercepter() {
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        String[] exclude = new String[] {"/src/main/webapp/js/**","/src/main/webapp/img/**","/src/main/webapp/css/**","/src/main/webapp/**"};
        registry.addInterceptor(getOtherIntercepter()).excludePathPatterns(exclude);
        registry.addInterceptor(getLoginIntercepter()).excludePathPatterns(exclude);
    }

}
