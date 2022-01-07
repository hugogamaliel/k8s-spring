
package com.myprojects.k8s.controllers;

import com.myprojects.k8s.dao.ClientesDao;
import com.myprojects.k8s.entities.Clientes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
//import javax.validation.Valid;
//import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/greeting")
     public String greeting(){
        return "hello";
    }
        
    @GetMapping("/clientes_by_place")
    //@GetMapping(value = "/clientes_by_place", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getClientesByPlace(@RequestParam("lugar") String lugar){
        
        Map<String, Object> response = new HashMap<>();
        
        try {
            LOGGER.info("-- TRy -Getting Clientes By Place--", lugar);
            List<Clientes> clientesList = clientesDao.getClientesByPlace(lugar);
            if (clientesList.isEmpty()) {
                LOGGER.info("..no record found..");
                String msgFound = "Not record found in ";
                response.put(MESSAGE, msgFound);
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(clientesList, HttpStatus.OK);
        }
        catch (Exception e){
            LOGGER.error(e.getMessage());
            response.put(MESSAGE, e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        
    }
 
}
