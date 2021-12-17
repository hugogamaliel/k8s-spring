
package com.myprojects.k8s.controllers;

import com.myprojects.k8s.dao.ClientesDao;
import com.myprojects.k8s.entites.Clientes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientesController.class);
    private static final String MESSAGE = "message";
            
    @Autowired
    private ClientesDao clientesDao;
    
    @GetMapping(value = "/clientes_by_place", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getClientesByPlace(@RequestParam("lugar") String lugar){
        
        Map<String, Object> response = new HashMap<>();
        
        LOGGER.info("--Getting Clientes By Place--", lugar);
        
        try {
            List<Clientes> clientesList = clientesDao.getClientesByPlace(lugar);
            return new ResponseEntity<>(clientesList, HttpStatus.OK);
        }
        catch (DataAccessException e){
            LOGGER.error(e.getMessage());
            response.put(MESSAGE, e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }
    
}
