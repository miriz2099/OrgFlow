package com.orgflow.orgflow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // ביטול הגנת CSRF (חובה כדי שנוכל לשלוח POST/PUT/DELETE)
            .csrf(csrf -> csrf.disable())
            
            // אישור לכל הבקשות להיכנס בלי התחברות
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()
            )
            
            // ביטול ה-Frame options (יעזור לנו בהמשך אם נרצה להשתמש ב-H2 console)
            .headers(headers -> headers.frameOptions(frame -> frame.disable()));

        return http.build();
    }
}