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

    public Diplomado() {
    }

    public Diplomado(String nombred, String duracion, Universidad university, Date fecha_inicio, Date fecha_fin) {
        this.nombred = nombred;
        this.duracion = duracion;
        this.university = university;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    

    public Diplomado(String nombred, String duracion) {
        this.nombred = nombred;
        this.duracion = duracion;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombred;
    }

    public void setNombre(String nombred) {
        this.nombred = nombred;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Universidad getUniversity() {
        return university;
    }

    public void setUniversity(Universidad university) {
        this.university = university;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
    
    
   
}
