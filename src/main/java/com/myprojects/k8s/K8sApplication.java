
package com.myprojects.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.myprojects.k8s"})
public class K8sApplication {
    
    public static void main (String[] args){
        SpringApplication.run(K8sApplication.class, args);
    }
    
}
