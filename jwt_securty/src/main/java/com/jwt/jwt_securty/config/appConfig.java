package com.jwt.jwt_securty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class appConfig {

   @Bean
   public UserDetailsService userDetailsService() {
       // Abhi in memory use kra hai db ke lye UserDetailsService ko override krege and then db ke apne credentials dege
        UserDetails user = User.builder().username("abhi").password(passwordEncoder().encode("abhi")).roles("ADMIN").build();
        return new InMemoryUserDetailsManager(user);
    }

   @Bean
   public PasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
