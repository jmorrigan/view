/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.interfaces;

import com.javaweb.entity.Estudiante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juan
 */
@Local
public interface EstudianteFacadeLocal {

    /**
     *
     * @param estudiante
     */
    void create(Estudiante estudiante);

    /**
     *
     * @param estudiante
     */
    void edit(Estudiante estudiante);

    /**
     *
     * @param estudiante
     */
    void remove(Estudiante estudiante);

    /**
     *
     * @param id
     * @return
     */
    Estudiante find(Object id);

    /**
     *
     * @return
     */
    List<Estudiante> findAll();

    /**
     *
     * @param range
     * @return
     */
    List<Estudiante> findRange(int[] range);

    /**
     *
     * @return
     */
    int count();
    
}
