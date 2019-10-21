/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author juan
 */
@Entity
@Table(name = "diplomados")
public class Diplomado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String nombred;
    
    @Column
    private String duracion;
    
    @ManyToOne
    @JoinColumn(name = "id_universidad")
    private Universidad university;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diplomados")
    private List<Estudiante> listaEstudiantes;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date fecha_fin;

    /**
     *
     */
    public Diplomado() {
    }

    /**
     *
     * @param nombred
     * @param duracion
     * @param university
     * @param fecha_inicio
     * @param fecha_fin
     */
    public Diplomado(String nombred, String duracion, Universidad university, Date fecha_inicio, Date fecha_fin) {
        this.nombred = nombred;
        this.duracion = duracion;
        this.university = university;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    /**
     *
     * @param nombred
     * @param duracion
     */
    public Diplomado(String nombred, String duracion) {
        this.nombred = nombred;
        this.duracion = duracion;
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
        return nombred;
    }

    /**
     *
     * @param nombred
     */
    public void setNombre(String nombred) {
        this.nombred = nombred;
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
    public Universidad getUniversity() {
        return university;
    }

    /**
     *
     * @param university
     */
    public void setUniversity(Universidad university) {
        this.university = university;
    }

    /**
     *
     * @return
     */
    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    /**
     *
     * @param listaEstudiantes
     */
    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    /**
     *
     * @return
     */
    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     *
     * @param fecha_inicio
     */
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     *
     * @return
     */
    public Date getFecha_fin() {
        return fecha_fin;
    }

    /**
     *
     * @param fecha_fin
     */
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
    
    
   
}
