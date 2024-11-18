package com.example.couriersystem.security;

import com.example.couriersystem.CourierSystemApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{
    private CourierSystemApplication application;
    public SecurityConfig(CourierSystemApplication application) {this.application = application;}

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //Essentially disable security to allow for any requests
        http
                .csrf().disable()
                .authorizeRequests(authorize -> authorize
                        .requestMatchers("/**").permitAll())
                .headers(headers -> headers.frameOptions().sameOrigin());
        return http.build();
    }
}
