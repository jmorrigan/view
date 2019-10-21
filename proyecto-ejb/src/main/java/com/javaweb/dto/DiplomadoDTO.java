/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.dto;

import java.util.Date;

/**
 *
 * @author juan
 */
public class DiplomadoDTO {
    
    private int id;
    
    private String nombre;
    
    private String duracion;
    
    private Date inicio;
    
    private Date fin;

    /**
     *
     */
    public DiplomadoDTO() {
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     *
     * @param duracion
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     *
     * @return
     */
    public Date getInicio() {
        return inicio;
    }

    /**
     *
     * @param inicio
     */
    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    /**
     *
     * @return
     */
    public Date getFin() {
        return fin;
    }

    /**
     *
     * @param fin
     */
    public void setFin(Date fin) {
        this.fin = fin;
    }
 
    
    
}
