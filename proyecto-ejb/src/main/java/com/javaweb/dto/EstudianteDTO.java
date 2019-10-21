/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.dto;

import org.primefaces.model.UploadedFile;

/**
 *
 * @author juan
 */
public class EstudianteDTO {
    private int id;
    
    private String nombre;
    
    private String cedula;
    
    private byte[] foto;
    
    private UploadedFile fotos;

    /**
     *
     */
    public EstudianteDTO() {
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
    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @return
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     *
     * @param foto
     */
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    /**
     *
     * @return
     */
    public UploadedFile getFotos() {
        return fotos;
    }

    /**
     *
     * @param fotos
     */
    public void setFotos(UploadedFile fotos) {
        this.fotos = fotos;
    }
    
    
    
    
}
