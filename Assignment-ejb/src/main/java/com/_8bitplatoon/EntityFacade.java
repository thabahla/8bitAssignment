/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com._8bitplatoon;

import entities.Entity;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author thabs
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN) 
public class EntityFacade extends AbstractFacade<Entity> {
    @Override
    protected EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        return factory.createEntityManager();
    }

    public EntityFacade() {
        super(Entity.class);
    }
    
}
