/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.ejb;

import com.javaweb.interfaces.VistaFacadeLocal;
import com.javaweb.entity.Vista;
import com.javaweb.interfaces.AbstractFacade;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author juan
 */
@Stateless
public class VistaFacade extends AbstractFacade<Vista> implements VistaFacadeLocal {
    @PersistenceContext(unitName = "universidadPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VistaFacade() {
        super(Vista.class);
    }

    @Override
    public List<Vista> obtenerRegistro() {
        TypedQuery<Vista> consulta = em.createNamedQuery("filtro", Vista.class);
        List<Vista> listaRegistro = consulta.getResultList();
        
        List<Vista> listaResult = new ArrayList();
        Iterator it = listaRegistro.iterator();
        
        while(it.hasNext()){
            Object[] obj = (Object[]) it.next();
            Vista v = new Vista(String.valueOf(obj[0]), String.valueOf(obj[1]), String.valueOf(obj[2]), String.valueOf(obj[3]), String.valueOf(obj[4]), String.valueOf(obj[5]), String.valueOf(obj[6]), String.valueOf(obj[7]));        
            listaResult.add(v);
        }
        
        return listaResult;
    }
    
}
