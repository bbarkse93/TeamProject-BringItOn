package com.example.teamprojectbringiton.config;

import com.example.teamprojectbringiton.handler.AuthIntetcepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Ioc 등록 --> 2개 이상 Ioc 등록 처리
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private AuthIntetcepter authIntetcepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(authIntetcepter)
                .addPathPatterns("/account/**")
                .addPathPatterns("/auth/**"); // 추가하는 방밥

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/uploads/**")
                .addResourceLocations("file:///C:\\spring_upload\\bring\\upload/");
    }

    @Bean // Ioc 관리 대상 처리 - 싱글톤
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}

