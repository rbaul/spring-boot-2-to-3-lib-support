package com.example.demo;

import com.lib.LibConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = LibConfig.class)
//@Import(LibConfig.class)
//@Import({
//		LibComponent.class,
//		JakartaRequestResponseLoggingFilter.class,
//		JavaxRequestResponseLoggingFilter.class
//})
public class ExternalLibConfig {
}
