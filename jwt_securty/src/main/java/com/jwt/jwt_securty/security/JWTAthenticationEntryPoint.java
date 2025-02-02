package com.jwt.jwt_securty.security;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;


@Component
public class JWTAthenticationEntryPoint implements AuthenticationEntryPoint {


    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
//        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//        PrintWriter writer = response.getWriter();
//        writer.println("Access Denied !! " + authException.getMessage());
    }
}
