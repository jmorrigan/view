/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.ejb;

import com.javaweb.interfaces.AbstractFacade;
import com.javaweb.interfaces.UniversidadFacadeLocal;
import com.javaweb.entity.Universidad;
import com.javaweb.entity.Vista;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import org.eclipse.persistence.sessions.Session;

/**
 *
 * @author juan
 */
@Stateless
public class UniversidadFacade extends AbstractFacade<Universidad> implements UniversidadFacadeLocal {
    @PersistenceContext(unitName = "universidadPU")
    private EntityManager em;

    /**
     *
     * @return
     */
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     *
     */
    public UniversidadFacade() {
        super(Universidad.class);
    }

}
