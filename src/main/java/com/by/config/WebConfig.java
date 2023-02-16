package com.by.config;


import com.by.Interceptor.Token1Interceptor;
import com.by.Interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

   // @Override
   // public void addInterceptors(InterceptorRegistry registry) {
     //   registry.addInterceptor(new TokenInterceptor())
    //            .addPathPatterns("/**")
     //           .order(2)
      //          .excludePathPatterns("/login","/register");
//
     //   registry.addInterceptor(new Token1Interceptor())
       //         .addPathPatterns("/**")
       //         .order(1)
         //       .excludePathPatterns("/login","/register");
   // }


}
