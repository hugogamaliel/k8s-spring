
package com.myprojects.k8s.dao;

import com.myprojects.k8s.entites.Clientes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface ClientesDao extends JpaRepository<Clientes, Long>{
    
    @Query("SELECT * FROM inv_clientes WHERE lugar = :lugar")
    List<Clientes> getClientesByPlace(@Param("lugar") String lugar);
    
}
