package co.com.claro.incidentsUpdateTechnicalCase.dao;

import co.com.claro.incidentsUpdateTechnicalCase.entity.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Stateless
@NoArgsConstructor
public class PqrCaseCvDao extends AbstractDao<PqrCaseCv>  implements Serializable {

    @PersistenceContext
    private EntityManager entityManager;

    @Getter @Setter
    private String id;

    @Getter @Setter
    private String request;

    @Getter @Setter
    private String reason;

    @Getter @Setter
    private String phoneNumber;

    @Getter @Setter
    private String addressedTo;

    @Getter @Setter
    private String applicantName;

    @Getter @Setter
    private String applicantSurname;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String contactNumber;

    @Getter @Setter
    private String requestObject;

    @Getter @Setter
    private String factsRequest;

    @Getter @Setter
    private String accountNumber;

    @Getter @Setter
    private String transaction;

    @Getter @Setter
    private String idState;

    @Getter @Setter
    private java.sql.Date dateCase;

    @Getter @Setter
    private String idCategory;

    @Getter @Setter
    private String idSubcategory;

    @Getter @Setter
    private String idCustomerVoice;

    @Getter @Setter
    private String idCloseCode;

    @Getter @Setter
    private String originCase;

    @Getter @Setter
    private Date caseDateEnd;

    @Getter @Setter
    private Date caseHour;

    @Getter @Setter
    private Date caseHourEnd;

    @Getter @Setter
    private String channel;

    @Getter @Setter
    private String adviser;

    @Getter @Setter
    private String comments;

    @Getter @Setter
    private String customerIdentification;

    @Getter @Setter
    private String personReport;

    @Getter @Setter
    private String namePersonReport;

    @Getter @Setter
    private String node;

    @Getter @Setter
    private String ccmm;

    @Getter @Setter
    private String product;

    @Getter @Setter
    private String service;

    @Getter @Setter
    private String subservice;

    @Getter @Setter
    private String functionality;

    @Getter @Setter
    private String statusReason;

    @Getter @Setter
    private String timeByState;

    @Getter @Setter
    private String sla;

    @Getter @Setter
    private String addressFails;

    @Getter @Setter
    private String city;

    @Getter @Setter
    private String department;

    @Getter @Setter
    private String latitude;

    @Getter @Setter
    private String longitude;

    @Getter @Setter
    private String sector;

    @Getter @Setter
    private String zone;

    @Getter @Setter
    private String zoneType;

    @Getter @Setter
    private String diagnosisLevel;

    @Getter @Setter
    private String typificationCloseCase;

    @Getter @Setter
    private String diagnosticGuide;

    @Getter @Setter
    private String cause;

    @Getter @Setter
    private String action;

    @Getter @Setter
    private String caseAssignmentGroup;

    @Getter @Setter
    private String incidentAssignmentGroup;

    @Getter @Setter
    private String notes;

    @Getter @Setter
    private String impact;

    @Getter @Setter
    private String urgency;

    @Getter @Setter
    private String priority;

    @Getter @Setter
    private String relatedIncident;

    @Getter @Setter
    private String relatedChange;

    @Getter @Setter
    private String idPublication;

    @Getter @Setter
    private Date failureDate;

    @Getter @Setter
    private Date failureDateSolution;

    @Getter @Setter
    private String incidentManagementSystem;

    @Getter @Setter
    private String baseStations;

    @Getter @Setter
    private String msisdnFailure;

    @Getter @Setter
    private String technology;

    @Getter @Setter
    private String lineType;

    @Getter @Setter
    private String planType;

    @Getter @Setter
    private String equipmentModel;

    public PqrCaseCvDao(EntityManager entityManager){
        super(PqrCaseCv.class);
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
