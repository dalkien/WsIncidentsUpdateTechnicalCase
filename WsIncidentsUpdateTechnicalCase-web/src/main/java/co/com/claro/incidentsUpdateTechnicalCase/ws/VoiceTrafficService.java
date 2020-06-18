/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.incidentsUpdateTechnicalCase.ws;


import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.com.claro.incidentsUpdateTechnicalCase.entity.PqrCaseCv;
import co.com.claro.incidentsUpdateTechnicalCase.facade.PqrCaseCviFacade;
import co.com.claro.incidentsUpdateTechnicalCase.models.GenericResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;

/**
 *
 * @author omarMad
 */
@Path("IncidentsUpdateTechnicalCase")
@Stateless
@TransactionManagement
public class IncidentsUpdateTechnicalCaseService {

    @EJB
    PqrCaseCviFacade pqrCaseCviFacade;

    public IncidentsUpdateTechnicalCaseService() {
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    @Path("update")
    public GenericResponse editar(PqrCaseCv pqrCaseCv) throws JsonProcessingException {
        GenericResponse response =  new GenericResponse("00","OK","OK");
        try {
            this.pqrCaseCviFacade.edit(pqrCaseCv);
        }catch (Exception e){
            e.printStackTrace();
            response.setReturnCode("99");
            response.setDescripcionCode(e.getMessage());
            response.setMenssageCode("error en actualizacion de datos");
        }
        return response;
    }

}
