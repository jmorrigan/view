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

    /**
     *
     */
    public Vista() {
    }

    /**
     *
     * @param ide
     * @param universidad
     * @param sede
     * @param diplomado
     * @param inicio
     * @param fin
     * @param estudiante
     * @param foto
     */
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

    /**
     *
     * @return
     */
    public String getIde() {
        return ide;
    }

    /**
     *
     * @param ide
     */
    public void setIde(String ide) {
        this.ide = ide;
    }

    /**
     *
     * @return
     */
    public String getUniversidad() {
        return universidad;
    }

    /**
     *
     * @param universidad
     */
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    /**
     *
     * @return
     */
    public String getSede() {
        return sede;
    }

    /**
     *
     * @param sede
     */
    public void setSede(String sede) {
        this.sede = sede;
    }

    /**
     *
     * @return
     */
    public String getDiplomado() {
        return diplomado;
    }

    /**
     *
     * @param diplomado
     */
    public void setDiplomado(String diplomado) {
        this.diplomado = diplomado;
    }

    /**
     *
     * @return
     */
    public String getInicio() {
        return inicio;
    }

    /**
     *
     * @param inicio
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     *
     * @return
     */
    public String getFin() {
        return fin;
    }

    /**
     *
     * @param fin
     */
    public void setFin(String fin) {
        this.fin = fin;
    }

    /**
     *
     * @return
     */
    public String getEstudiante() {
        return estudiante;
    }

    /**
     *
     * @param estudiante
     */
    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    /**
     *
     * @return
     */
    public String getFoto() {
        return foto;
    }

    /**
     *
     * @param foto
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    

    
   
}
