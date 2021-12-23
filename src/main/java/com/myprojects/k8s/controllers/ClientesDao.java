
package com.myprojects.k8s.controllers;


import com.myprojects.k8s.entites.Clientes;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface ClientesDao extends JpaRepository<Clientes, Long>{
    
    @Query(value = "SELECT * FROM inv_clientes WHERE lugar = 'OCOTLAN'", nativeQuery = true)
    //List<Clientes> getClientesByPlace(@Param("lugar") String lugar);
    List<Clientes> getClientesByPlace();
    
}
