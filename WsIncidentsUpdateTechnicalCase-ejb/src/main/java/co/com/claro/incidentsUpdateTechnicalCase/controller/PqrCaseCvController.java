package co.com.claro.incidentsUpdateTechnicalCase.controller;

import co.com.claro.incidentsUpdateTechnicalCase.dao.PqrCaseCvDao;
import co.com.claro.incidentsUpdateTechnicalCase.entity.PqrCaseCv;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;


@Stateless
public class PqrCaseCvController {

    @PersistenceContext(unitName = "Bridge360")
    private EntityManager entityManager;

    @EJB
    PqrCaseCvDao pqrCaseCvDao;

    public void edit(PqrCaseCv pqrCaseCv) {
        try {
            this.pqrCaseCvDao.setEntityManager(this.entityManager);
            this.pqrCaseCvDao.edit(pqrCaseCv);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public List<PqrCaseCv> allBridgeConf(){
        List<PqrCaseCv> pqrCaseCvs = new ArrayList<>();
        try {
            pqrCaseCvs =  this.entityManager
                    .createNamedQuery("PqrCaseCv.findAll")
                    .getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return pqrCaseCvs;
    }

}
