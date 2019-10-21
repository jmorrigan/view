/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author juan
 */
@Entity
@Table(name = "estudiante")
public class Estudiante implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    private String nombree;
    
    private String cedula;
    
    @ManyToOne
    @JoinColumn(name = "id_diplomado")
    private Diplomado diplomados;
    
    @Column
    private byte[] foto;

    /**
     *
     */
    public Estudiante() {
    }

    /**
     *
     * @param id
     * @param nombree
     * @param cedula
     * @param diplomados
     * @param foto
     */
    public Estudiante(int id, String nombree, String cedula, Diplomado diplomados, byte[] foto) {
        this.id = id;
        this.nombree = nombree;
        this.cedula = cedula;
        this.diplomados = diplomados;
        this.foto = foto;
    }

    /**
     *
     * @param nombree
     * @param cedula
     * @param diplomados
     */
    public Estudiante(String nombree, String cedula, Diplomado diplomados){
        this.nombree = nombree;
        this.cedula = cedula;
        this.diplomados = diplomados;
    }

    /**
     *
     * @param nombree
     * @param cedula
     */
    public Estudiante(String nombree, String cedula){
        this.nombree = nombree;
        this.cedula = cedula;
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
        return nombree;
    }

    /**
     *
     * @param nombree
     */
    public void setNombre(String nombree) {
        this.nombree = nombree;
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
    public Diplomado getDiplomados() {
        return diplomados;
    }

    /**
     *
     * @param diplomados
     */
    public void setDiplomados(Diplomado diplomados) {
        this.diplomados = diplomados;
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
     
}
