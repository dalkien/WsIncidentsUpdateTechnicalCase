package co.com.claro.incidentsUpdateTechnicalCase.facade;

import co.com.claro.incidentsUpdateTechnicalCase.entity.PqrCaseCv;

import javax.ejb.Local;

@Local
public interface PqrCaseCviFacade {

    public void edit(PqrCaseCv pqrCaseCv);
}
