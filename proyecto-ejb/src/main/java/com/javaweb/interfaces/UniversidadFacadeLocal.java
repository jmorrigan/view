/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.interfaces;

import com.javaweb.entity.Universidad;
import com.javaweb.entity.Vista;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juan
 */
@Local
public interface UniversidadFacadeLocal {

    /**
     *
     * @param universidad
     */
    void create(Universidad universidad);

    /**
     *
     * @param universidad
     */
    void edit(Universidad universidad);

    /**
     *
     * @param universidad
     */
    void remove(Universidad universidad);

    /**
     *
     * @param id
     * @return
     */
    Universidad find(Object id);

    /**
     *
     * @return
     */
    List<Universidad> findAll();

    /**
     *
     * @param range
     * @return
     */
    List<Universidad> findRange(int[] range);

    /**
     *
     * @return
     */
    int count();
    
}
