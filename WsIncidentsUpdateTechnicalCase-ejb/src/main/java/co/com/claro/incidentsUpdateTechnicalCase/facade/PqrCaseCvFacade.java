package co.com.claro.incidentsUpdateTechnicalCase.facade;

import co.com.claro.incidentsUpdateTechnicalCase.controller.PqrCaseCvController;
import co.com.claro.incidentsUpdateTechnicalCase.entity.PqrCaseCv;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.Serializable;

@Stateless
public class PqrCaseCvFacade implements PqrCaseCviFacade, Serializable {
    private static final long serialVersionUID = 1L;

    @EJB
    PqrCaseCvController pqrCaseCvController;

    @Override
    public void edit(PqrCaseCv pqrCaseCv) {
        try{
            this.pqrCaseCvController.edit(pqrCaseCv);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
