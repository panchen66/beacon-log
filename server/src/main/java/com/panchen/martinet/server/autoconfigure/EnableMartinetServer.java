package com.panchen.martinet.server.autoconfigure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootApplication
@ComponentScan(basePackages = {"com.panchen.martinet.server.rest"})
@Import(EnableMartinetServerImportSelector.class)
public @interface EnableMartinetServer {

    int port() default 1901;

    int acceptorCount() default 2;

}
