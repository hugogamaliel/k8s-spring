
package com.myprojects.k8s.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientesController.class);
    
    @GetMapping("/lista")
    public String nombres(){
        return "hello";
    }
    
}
