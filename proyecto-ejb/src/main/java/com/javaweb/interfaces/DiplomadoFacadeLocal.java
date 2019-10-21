/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.interfaces;

import com.javaweb.entity.Diplomado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author juan
 */
@Local
public interface DiplomadoFacadeLocal {

    /**
     *
     * @param diplomado
     */
    void create(Diplomado diplomado);

    /**
     *
     * @param diplomado
     */
    void edit(Diplomado diplomado);

    /**
     *
     * @param diplomado
     */
    void remove(Diplomado diplomado);

    /**
     *
     * @param id
     * @return
     */
    Diplomado find(Object id);

    /**
     *
     * @return
     */
    List<Diplomado> findAll();

    /**
     *
     * @param range
     * @return
     */
    List<Diplomado> findRange(int[] range);

    /**
     *
     * @return
     */
    int count();
    
}
