package com.incture.alj_datalake_api.sales_n_service.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "TARGET_ZDBM_ORD_CRM", schema = "ALJ_DEV_POC_HDI_DATALAKE_DB_1")
@IdClass(ServiceRefId.class)
public class ServiceHistoryEntity {
	
	@Id
	@Column(name = "LOGSYS", length = 10)
	private String logSys;
	
	@Id
	@Column(name = "AUFART", length = 4)
	private String orderTypeForSplit;
	
	@Id
	@Column(name = "VBELN", length = 10)
	private String dbmOrderNo;
	
	@Column(name = "BEZEI", length = 30)
	private String orderStatusDesc;
	
	@Column(name = "AUGRU", length = 3)
	private String orderReason;
	
	@Column(name = "HSTAT", length = 4)
	private String orderStatus;
	
	@Column(name = "VHVIN", length = 35)
	private String vin;
	
	@Column(name = "LICPL", length = 15)
	private String licensePlate;
	
	@Column(name = "MILEAGE")
	private Double mileage;
		
	@Column(name = "MILEAGE_UOM", length = 3)
	private String mileageUom;
	
	@Column(name = "WERKS", length = 4)
	private String plant;
	
	@Column(name = "VKORG", length = 4)
	private String salesOrg;
	
	@Column(name = "NAME1", length = 35)
	private String customerName;
	
	@Column(name = "KUNNR", length = 10)
	private String soldToParty;
	
	@Column(name = "CHECKINID", length = 35)
	private String checkIn;
	
	@Column(name = "CHECKINIDNO", length = 8)
	private String checkInId;
	
	@Column(name = "CONTPERS", length = 80)
	private String contactPerson;
	
	@Column(name = "CONTPERSIDNO", length = 10)
	private String contactPersonId;
	
	@Column(name = "SHIPTOID", length = 35)
	private String shipToId;
	
	@Column(name = "KUNWE", length = 10)
	private String kunwe;
	
	@Column(name = "SERVADV", length = 30)
	private String servadv;
	
	@Column(name = "SERVADVIDNO", length = 8)
	private String serveAdvId;
	
	@Column(name = "CHIEFTECH", length = 30)
	private String chiefTech;
	
	@Column(name = "CHIEFTECHIDNO", length = 8)
	private String chiefTechId;
	
	@Column(name = "TECH", length = 30)
	private String tech;
	
	@Column(name = "TECHIDNO", length = 8)
	private String techId;
	
	@Column(name = "APPDTE", length = 8)
	private String appDate;
	
	@Column(name = "AUDAT", length = 8)
	private String docDate;
	
	@Column(name = "DISPATCHDTE", length = 8)
	private String dispatchDate;
	
	@Column(name = "INVDTE", length = 8)
	private String invoiceDate;
	
	@Column(name = "CNTARVDTE", length = 8)
	private String cntarvDate;
	
	@Column(name = "CSTDELDTE", length = 8)
	private String cstDelDate;
	
	@Column(name = "PLCOMPLDTE", length = 8)
	private String plCompleteDate;
	
	@Column(name = "WAERK", length = 5)
	private String waerk;
	
	@Column(name = "ZTERM", length = 4)
	private String zterm;
	
	@Column(name = "INVOICENO", length = 10)
	private String invoiceNo;
	
	@Column(name = "WARRANTY", length = 12)
	private String warranty;
	
	@Column(name = "JOBCARDNO", length = 10)
	private String jobCardNo;
	
	@Column(name = "PRETPR", precision = 15, scale = 2)
	private Double pretpr;
	
	@Column(name = "PDISC", precision = 15, scale = 2)
	private Double pDesc;
	
	@Column(name = "PCDISC", precision = 15, scale = 2)
	private Double pcDisc;
	
	@Column(name = "PWTYCLM", precision = 15, scale = 2)
	private Double pwtyclm;
	
	@Column(name = "LRETPR", precision = 15, scale = 2)
	private Double lretpr;
	
	@Column(name = "LDISC", precision = 15, scale = 2)
	private Double ldisc;
	
	@Column(name = "LCDISC", precision = 15, scale = 2)
	private Double lcDisc;
	
	@Column(name = "LWTYCLM", precision = 17, scale = 2)
	private Double lwtyclm;
	
	@Column(name = "OLRETPR", precision = 15, scale = 2)
	private Double olretpr;
	
	@Column(name = "OLDISC", precision = 15, scale = 2)
	private Double olDisc;
	
	@Column(name = "OLCDISC", precision = 15, scale = 2)
	private Double olcDisc;
	
	@Column(name = "OLWTYCLM", precision = 17, scale = 2)
	private Double olwtyclm;
	
	@Column(name = "ORETPR", precision = 15, scale = 2)
	private Double oretpr;
	
	@Column(name = "ODISC", precision = 15, scale = 2)
	private Double odisc;
	
	@Column(name = "OCDISC", precision = 15, scale = 2)
	private Double ocDisc;
	
	@Column(name = "OWTYCLM", precision = 17, scale = 2)
	private Double owtyclm;
	
	@Column(name = "LABCOST", precision = 13, scale = 2)
	private Double labourCost;
	
	@Column(name = "PARTSCOST", precision = 13, scale = 2)
	private Double partsCost;
	
	@Column(name = "MOBILENO", length = 16)
	private String mobileNo; 
	
	@Column(name = "VEHLOC", length = 10)
	private String vehicleLocation; 
	
	@Column(name = "JOB", length = 100)
	private String job;
	
	@Column(name = "CONTRNO", length = 10)
	private String contrNo;
	
	@Column(name = "CONTRITM", length = 6)
	private String contritm;
	
	@Column(name = "WSHOPTEXT", length = 132)
	private String workshopText;
	
	@Column(name = "CARWSHSTAT", length = 1)
	private String carWashStatus;
	
	@Column(name = "SCHWIN", length = 40)
	private String schwin;
	
	@Column(name = "UNDERWTY", length = 1)
	private String underWarranty;
	
	@Column(name = "ACTION", length = 16)
	private String action;
	
	@Column(name = "AUGRU_SHD", length = 3)
	private String augruShd;
	
	@Column(name = "CREATED_AT", length = 8)
	private String createdAt;
	
	@Column(name = "CHANGED_AT", length = 8)
	private String changedAt;
	
	@Column(name = "FKDAT", length = 8)
	private String date;
	
	@Column(name = "BRTWR", precision = 13, scale = 2)
	private Double invoiceAmtInDocCurrency;
	
	@Column(name = "ZZ_HJOBTY", length = 2)
	private String zzJobType;
	
	@Column(name = "CREATED_AT_DL", length = 14)
	private String createdAtDl;

	@Column(name = "CHANGED_AT_DL", length = 14)
	private String changedAtDl;
	
}
