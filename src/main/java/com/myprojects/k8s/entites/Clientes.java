
package com.myprojects.k8s.entites;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inv_clientes")
public class Clientes implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id_cliente;
    
    @Column(name = "id_nombre")
    private String nombre;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "colonia")
    private String colonia;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "lugar")
    private String lugar;
    
    @Column(name = "id_ruta")
    private Long id_ruta;
     
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "fecha_alta_ant")
    private String fecha_alta_ant;
    
    @Column(name = "estado")
    private String estado;
    
    @Column(name = "fecha_alta")
    private Date fecha_alta;
    
    public Long getIdCliente(){
        return id_cliente;
    }
   
     public Long getId_cliente() {
        return id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getColonia() {
        return colonia;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getLugar() {
        return lugar;
    }

    public Long getId_ruta() {
        return id_ruta;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFecha_alta_ant() {
        return fecha_alta_ant;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }
    
    public void setIdCliente(Long id_cliente){
        this.id_cliente = id_cliente;
    }
    
     public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setId_ruta(Long id_ruta) {
        this.id_ruta = id_ruta;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha_alta_ant(String fecha_alta_ant) {
        this.fecha_alta_ant = fecha_alta_ant;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
    
}
