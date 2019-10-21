/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author juan
 */
@Entity
@Table(name = "reporte_views")
@NamedQueries({
        @NamedQuery(name = "filtro", query = "SELECT u.id, u.nombre, u.ubicacion,l.nombred ,l.fecha_inicio, l.fecha_fin, e.nombree, l.id FROM Universidad u JOIN U.listaDiplomados AS l JOIN l.listaEstudiantes AS e ")
})
public class Vista implements Serializable {
    
    @Id
    @Column
    private String ide;
    
    @Column
    private String universidad;
    
    @Column
    private String sede;
            
    @Column
    private String diplomado;
    
    @Column
    private String inicio;
    
    @Column
    private String fin;
    
    @Column
    private String estudiante;
    
    @Column
    private String foto;

    public Vista() {
    }

    public Vista(String ide, String universidad, String sede, String diplomado, String inicio, String fin, String estudiante, String foto) {
        this.ide = ide;
        this.universidad = universidad;
        this.sede = sede;
        this.diplomado = diplomado;
        this.inicio = inicio;
        this.fin = fin;
        this.estudiante = estudiante;
        this.foto = foto;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getDiplomado() {
        return diplomado;
    }

    public void setDiplomado(String diplomado) {
        this.diplomado = diplomado;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    

    
   
}
