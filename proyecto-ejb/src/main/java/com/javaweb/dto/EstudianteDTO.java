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

    public EstudianteDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public UploadedFile getFotos() {
        return fotos;
    }

    public void setFotos(UploadedFile fotos) {
        this.fotos = fotos;
    }
    
    
    
    
}
