package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class Config {
    

    @Bean(name = "emp1")
    public Employee getEmployee() {
        return new Employee("John Doe", 123);
    }
}
