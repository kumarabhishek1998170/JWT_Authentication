package com.jwt.jwt_securty.config;


import com.jwt.jwt_securty.security.JWTAthenticationEntryPoint;
import com.jwt.jwt_securty.security.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Autowired
    private JWTAthenticationEntryPoint point;
    @Autowired
    private JwtAuthenticationFilter filter;

   @Bean
   public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       http.csrf(csrf -> csrf.disable())
               .authorizeHttpRequests(authorize -> authorize
                       .requestMatchers("/Oauth/login").permitAll()
                       .anyRequest().authenticated()
               )
               .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
               .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

       http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}
