package com.myprojects.k8s.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class K8sSpringApplication {
    
    public static void main (String[] args){
        SpringApplication.run(K8sSpringApplication.class, args);
    }
    
}
