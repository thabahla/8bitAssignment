/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com._8bitplatoon;

import entities.Cic;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author thabs
 */
@WebService(serviceName = "CicRegistrationEngine")
public class CicRegistrationEngine {
    @EJB
    private CiCFacade ciCFacade;
    @EJB
    private EntityFacade entityFacade;
            
    @WebMethod(operationName = "registerEntity")
    public String registerEntity(entities.Entity entity) {
        try {
            entityFacade.create(entity);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "registerEntity successful.";
    }
    
    @WebMethod(operationName = "registerCic")
    public String registerCic(Cic cic) {
        try {
            ciCFacade.create(cic);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "registerCic successful.";
    }
    
    @WebMethod(operationName = "getCiCs")
    public List<Cic> getCiCs(){
        return  ciCFacade.findAll();
    }
    
}
