package com.myprojects.controllers;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientesController.class);
    
    @GetMapping(value = "/nombres")
    public String nombres(){
        return "hello";
    }
            
    
    
}
