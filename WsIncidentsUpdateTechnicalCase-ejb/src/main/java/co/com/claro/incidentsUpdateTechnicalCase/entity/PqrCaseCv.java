package co.com.claro.incidentsUpdateTechnicalCase.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "PQR_CASE_CV")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQueries({
        @NamedQuery(name = "PqrCaseCv.findAll", query = "SELECT q FROM PqrCaseCv q")
})
public class PqrCaseCv implements Serializable {

    @Id
    @Column(name = "ID")
    @Getter @Setter
    private String id;

    @Column(name = "REQUEST")
    @Getter @Setter
    private String request;

    @Column(name = "REASON")
    @Getter @Setter
    private String reason;

    @Column(name = "PHONE_NUMBER")
    @Getter @Setter
    private String phoneNumber;

    @Column(name = "ADDRESSED_TO")
    @Getter @Setter
    private String addressedTo;

    @Column(name = "APPLICANT_NAME")
    @Getter @Setter
    private String applicantName;

    @Column(name = "APPLICANT_SURNAME")
    @Getter @Setter
    private String applicantSurname;

    @Column(name = "EMAIL")
    @Getter @Setter
    private String email;

    @Column(name = "CONTACT_NUMBER")
    @Getter @Setter
    private String contactNumber;

    @Column(name = "REQUEST_OBJECT")
    @Getter @Setter
    private String requestObject;

    @Column(name = "FACTS_REQUEST")
    @Getter @Setter
    private String factsRequest;

    @Column(name = "ACCOUNT_NUMBER")
    @Getter @Setter
    private String accountNumber;

    @Column(name = "TRANSACTION")
    @Getter @Setter
    private String transaction;

    @Column(name = "ID_STATE")
    @Getter @Setter
    private String idState;

    @Column(name = "DATE_CASE")
    @Getter @Setter
    private Date dateCase;

    @Column(name = "ID_CATEGORY")
    @Getter @Setter
    private String idCategory;

    @Column(name = "ID_SUB_CATEGORY")
    @Getter @Setter
    private String idSubcategory;

    @Column(name = "ID_CUSTOMER_VOICE")
    @Getter @Setter
    private String idCustomerVoice;

    @Column(name = "ID_CLOSE_CODE")
    @Getter @Setter
    private String idCloseCode;

    @Column(name = "ORIGIN_CASE")
    @Getter @Setter
    private String originCase;

    @Column(name = "CASE_DATE_END")
    @Getter @Setter
    private Date caseDateEnd;

    @Column(name = "CASE_HOUR")
    @Getter @Setter
    private Date caseHour;

    @Column(name = "CASE_HOUR_END")
    @Getter @Setter
    private Date caseHourEnd;

    @Column(name = "CHANNEL")
    @Getter @Setter
    private String channel;

    @Column(name = "ADVISER")
    @Getter @Setter
    private String adviser;

    @Column(name = "COMMENTS")
    @Getter @Setter
    private String comments;

    @Column(name = "CUSTOMER_IDENTIFICARION")
    @Getter @Setter
    private String customerIdentification;

    @Column(name = "PERSON_REPORT")
    @Getter @Setter
    private String personReport;

    @Column(name = "NAME_PERSON_REPORT")
    @Getter @Setter
    private String namePersonReport;

    @Column(name = "NODE")
    @Getter @Setter
    private String node;

    @Column(name = "CCMN")
    @Getter @Setter
    private String ccmm;

    @Column(name = "PRODUCT")
    @Getter @Setter
    private String product;

    @Column(name = "SERVICE")
    @Getter @Setter
    private String service;

    @Column(name = "SUBSERVICE")
    @Getter @Setter
    private String subservice;

    @Column(name = "FUNCTIONALITY")
    @Getter @Setter
    private String functionality;

    @Column(name = "STATUS_REASON")
    @Getter @Setter
    private String statusReason;

    @Column(name = "TIME_BY_STATE")
    @Getter @Setter
    private String timeByState;

    @Column(name = "SLA")
    @Getter @Setter
    private String sla;

    @Column(name = "ADDRESS_FAILS")
    @Getter @Setter
    private String addressFails;

    @Column(name = "CITY")
    @Getter @Setter
    private String city;

    @Column(name = "DEPARTAMENT")
    @Getter @Setter
    private String department;

    @Column(name = "LATITUDE")
    @Getter @Setter
    private String latitude;

    @Column(name = "LONGITUDE")
    @Getter @Setter
    private String longitude;

    @Column(name = "SECTOR")
    @Getter @Setter
    private String sector;

    @Column(name = "ZONE")
    @Getter @Setter
    private String zone;

    @Column(name = "ZONE_TYPE")
    @Getter @Setter
    private String zoneType;

    @Column(name = "DIAGNOSIS_LEVEL")
    @Getter @Setter
    private String diagnosisLevel;

    @Column(name = "TYPIFICATION_CLOSE_CASE")
    @Getter @Setter
    private String typificationCloseCase;

    @Column(name = "DIAGNOSTIC_GUIDE")
    @Getter @Setter
    private String diagnosticGuide;

    @Column(name = "CAUSE")
    @Getter @Setter
    private String cause;

    @Column(name = "ACTION")
    @Getter @Setter
    private String action;

    @Column(name = "CASE_ASSIGNMENT_GROUP")
    @Getter @Setter
    private String caseAssignmentGroup;

    @Column(name = "INCIDENT_ASSIGNMENT_GROUP")
    @Getter @Setter
    private String incidentAssignmentGroup;

    @Column(name = "NOTES")
    @Getter @Setter
    private String notes;

    @Column(name = "IMPACT")
    @Getter @Setter
    private String impact;

    @Column(name = "URGENCY")
    @Getter @Setter
    private String urgency;

    @Column(name = "PRIORITY")
    @Getter @Setter
    private String priority;

    @Column(name = "RELATED_INCIDENT")
    @Getter @Setter
    private String relatedIncident;

    @Column(name = "RELATED_CHANGE")
    @Getter @Setter
    private String relatedChange;

    @Column(name = "ID_PUBLICATION")
    @Getter @Setter
    private String idPublication;

    @Column(name = "FAILURE_DATE")
    @Getter @Setter
    private Date failureDate;

    @Column(name = "FAILURE_DATE_SOLUTION")
    @Getter @Setter
    private Date failureDateSolution;

    @Column(name = "INCIDENT_MANAGEMENT_SYSTEM")
    @Getter @Setter
    private String incidentManagementSystem;

    @Column(name = "BASE_STATIONS")
    @Getter @Setter
    private String baseStations;

    @Column(name = "MSISDN_FAILURE")
    @Getter @Setter
    private String msisdnFailure;

    @Column(name = "TECHNOLOGY")
    @Getter @Setter
    private String technology;

    @Column(name = "LINE_TYPE")
    @Getter @Setter
    private String lineType;

    @Column(name = "PLAN_TYPE")
    @Getter @Setter
    private String planType;

    @Column(name = "EQUIPMENT_MODEL")
    @Getter @Setter
    private String equipmentModel;
}
