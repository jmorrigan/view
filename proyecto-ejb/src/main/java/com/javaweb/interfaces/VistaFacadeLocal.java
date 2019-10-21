/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.interfaces;

import com.javaweb.entity.Vista;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juan
 */
@Local
public interface VistaFacadeLocal {

    /**
     *
     * @param vista
     */
    void create(Vista vista);

    /**
     *
     * @param vista
     */
    void edit(Vista vista);

    /**
     *
     * @param vista
     */
    void remove(Vista vista);

    /**
     *
     * @param id
     * @return
     */
    Vista find(Object id);

    /**
     *
     * @return
     */
    List<Vista> findAll();

    /**
     *
     * @param range
     * @return
     */
    List<Vista> findRange(int[] range);

    /**
     *
     * @return
     */
    List<Vista> obtenerRegistro();
    
    /**
     *
     * @return
     */
    int count();
    
}
