package com.lib;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
@ConditionalOnClass(javax.servlet.ServletRequest.class)
public class JavaxRequestResponseLoggingFilter implements Filter {

    public JavaxRequestResponseLoggingFilter() {
        log.info("JavaxRequestResponseLoggingFilter loaded");
    }

    @Override
    public void doFilter(
      ServletRequest request,
      ServletResponse response,
      FilterChain chain) throws IOException, ServletException {
 
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        log.info(
          "Logging Request  {} : {}", req.getMethod(), 
          req.getRequestURI());
        chain.doFilter(request, response);
        log.info(
          "Logging Response :{}", 
          res.getContentType());
    }

}