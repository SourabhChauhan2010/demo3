package com.incture.alj_datalake_api.user.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TARGET_ZALJ_UCM_BP", schema = "ALJ_DEV_POC_HDI_DATALAKE_DB_1")
public class BpEntity {

	@Id
	@Column(name = "BP_NUMBER", length = 10)
	private String bpNo;
	
	@Column(name = "BP_ROLE", length = 40)
	private String bpRole;
	
	@Column(name = "EMPLOYEE", length = 1)
	private String employee;
	
	@Column(name = "TITLE_MEDI", length = 4)
	private String titleMedi;
	
	@Column(name = "STATUS", length = 1)
	private String status;
	
	@Column(name = "NAME_FIRST", length = 40)
	private String firstName;
	
	@Column(name = "NAME_MIDDLE", length = 40)
	private String middleName;
	
	@Column(name = "NAME_LAST", length = 40)
	private String lastName;
	
	@Column(name = "NICK_NAME", length = 40)
	private String nickName;
	
	@Column(name = "GENDER", length = 1)
	private String gender;
	
	@Column(name = "NATIO", length = 3)
	private String natio;
	
	@Column(name = "LANGUCORR", length = 1)
	private String langucorr;
	
	@Column(name = "MARST", length = 1)
	private String marst;
	
	@Column(name = "BIRTHPL", length = 40)
	private String birthPl;
	
	@Column(name = "BIRTHDT", length = 8)
	private String birthDt;
	
	@Column(name = "EMPLO", length = 35)
	private String emplo;
	
	@Column(name = "JOBGR", length = 4)
	private String jobGr;
	
	@Column(name = "NATPERS", length = 1)
	private String natpers;
	
	@Column(name = "BPEXT ", length = 20)
	private String bpext;
	
	@Column(name = "AR_NAME_FIRST", length = 40)
	private String firstNameAr;
	
	@Column(name = "AR_NAME_LAST", length = 40)
	private String lastNameAr;
	
	@Column(name = "AR_NICK_NAME", length = 40)
	private String nickNameAr;
	
	@Column(name = "AR_NAME_MIDDLE", length = 40)
	private String middleNameAr;
	
	@Column(name = "MOBILE1", length = 30)
	private String mobile1;
	
	@Column(name = "MOBILE2", length = 30)
	private String mobile2;
	
	@Column(name = "HOME_PHONE", length = 30)
	private String homePhone;
	
	@Column(name = "WORK_PHONE", length = 30)
	private String workPhone;
	
	@Column(name = "TEL_EXTENS", length = 10)
	private String telExtension;
	
	@Column(name = "EMAIL1")
	private String email1;
	
	@Column(name = "EMAIL2")
	private String email2;
	
	@Column(name = "PO_BOX", length = 10)
	private String poBox;
	
	@Column(name = "POST_CODE2", length = 10)
	private String postCode2;
	
	@Column(name = "PROVINCE", length = 40)
	private String province;
	
	@Column(name = "REGION", length = 4)
	private String region;
	
	@Column(name = "LOCATION", length = 40)
	private String location;
	
	@Column(name = "CITY1", length = 40)
	private String city1;
	
	@Column(name = "CITY2", length = 40)
	private String city2;
	
	@Column(name = "POST_CODE1", length = 10)
	private String postCode1;
	
	@Column(name = "STREET", length = 60)
	private String street;
	
	@Column(name = "ROOMNUMBER", length = 10)
	private String roomNo;
	
	@Column(name = "COUNTRY", length = 3)
	private String country;
	
	@Column(name = "BUILDING", length = 20)
	private String building;
	
	@Column(name = "DEFLT_COMM", length = 3)
	private String defaultComm;
	
	@Column(name = "CUSTOMER_GROUP1", length = 3)
	private String custGr1;
	
	@Column(name = "CUSTOMER_GROUP2", length = 3)
	private String custGr2;
	
	@Column(name = "CUSTOMER_GROUP3", length = 3)
	private String custGr3;
	
	@Column(name = "CUSTOMER_GROUP4", length = 3)
	private String custGr4;
	
	@Column(name = "CUSTOMER_GROUP5", length = 3)
	private String custGr5;
	
	@Column(name = "SHIPPING_COND", length = 2)
	private String shippingCondition;
	
	@Column(name = "INCOTERMS1", length = 3)
	private String incoTerm1;
	
	@Column(name = "CUSTOMER_GROUP", length = 2)
	private String custGr;
	
	@Column(name = "CURRENCY", length = 5)
	private String currency;
	
	@Column(name = "CUST_PRIC_PROC", length = 1)
	private String custPriceProc;
	
	@Column(name = "PAYMENT_TERMS", length = 4)
	private String paymentTerms;
	
	@Column(name = "ACCOUNT_ASGNGRP", length = 2)
	private String accountAsgnGrp;
	
	@Column(name = "REBATE_RELEVANT", length = 1)
	private String rebate_relevant;
	
	@Column(name = "SALES_OFFICE", length = 12)
	private String salesOffice;
	
	@Column(name = "SALES_ORG", length = 14)
	private String salesOrg;
	
	@Column(name = "CHANNEL", length = 2)
	private String channel;
	
	@Column(name = "DIVISION", length = 2)
	private String division;
	
	@Column(name = "MO_NET_INC")
	private Double moNetInc;
	
	@Column(name = "NET_INCOME")
	private Double netIncome;
	
	@Column(name = "VIP", length = 1)
	private String vip;
	
	@Column(name = "TYPE", length = 6)
	private String type;
	
	@Column(name = "IDNUMBER", length = 60)
	private String idNo;
	
	@Column(name = "VALID_DATE_FROM", length = 8)
	private String validFrom;
	
	@Column(name = "VALID_DATE_TO", length = 8)
	private String validTo;
	
	@Column(name = "TAXTYPE", length = 4)
	private String taxType;
	
	@Column(name = "TAXNUM", length = 20)
	private String taxNum;
	
	@Column(name = "TAX_CTY", length = 3)
	private String taxCity;
	
	@Column(name = "TAX_REG", length = 3)
	private String taxReg;
	
	@Column(name = "TAX_TYPE", length = 4)
	private String tax_type;
	
	@Column(name = "TAX_GROUP", length = 20)
	private String taxGroup;
	
	@Column(name = "NUMBER_OF_DEPENDENTS", length = 2)
	private String dependentsNo;
	
	@Column(name = "CREATED_AT", length = 15)
	private String createdAt;
	
	@Column(name = "CREATED_BY", length = 12)
	private String createdBy;
	
	@Column(name = "CHANGED_AT", length = 15)
	private String changedAt;
	
	@Column(name = "CHANGED_BY", length = 12)
	private String changedBy;
	
	@Column(name = "LAT_HOME", length = 20)
	private String homeLat;
	
	@Column(name = "LONG_HOME", length = 20)
	private String homeLong;
	
	@Column(name = "LAT_WORK", length = 20)
	private String workLat;
	
	@Column(name = "LONG_WORK", length = 20)
	private String workLong;
	
	@Column(name = "WASEL", length = 20)
	private String wasel;

	public String getBpNo() {
		return bpNo;
	}

	public void setBpNo(String bpNo) {
		this.bpNo = bpNo;
	}

	public String getBpRole() {
		return bpRole;
	}

	public void setBpRole(String bpRole) {
		this.bpRole = bpRole;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getTitleMedi() {
		return titleMedi;
	}

	public void setTitleMedi(String titleMedi) {
		this.titleMedi = titleMedi;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNatio() {
		return natio;
	}

	public void setNatio(String natio) {
		this.natio = natio;
	}

	public String getLangucorr() {
		return langucorr;
	}

	public void setLangucorr(String langucorr) {
		this.langucorr = langucorr;
	}

	public String getMarst() {
		return marst;
	}

	public void setMarst(String marst) {
		this.marst = marst;
	}

	public String getBirthPl() {
		return birthPl;
	}

	public void setBirthPl(String birthPl) {
		this.birthPl = birthPl;
	}

	public String getBirthDt() {
		return birthDt;
	}

	public void setBirthDt(String birthDt) {
		this.birthDt = birthDt;
	}

	public String getEmplo() {
		return emplo;
	}

	public void setEmplo(String emplo) {
		this.emplo = emplo;
	}

	public String getJobGr() {
		return jobGr;
	}

	public void setJobGr(String jobGr) {
		this.jobGr = jobGr;
	}

	public String getNatpers() {
		return natpers;
	}

	public void setNatpers(String natpers) {
		this.natpers = natpers;
	}

	public String getBpext() {
		return bpext;
	}

	public void setBpext(String bpext) {
		this.bpext = bpext;
	}

	public String getFirstNameAr() {
		return firstNameAr;
	}

	public void setFirstNameAr(String firstNameAr) {
		this.firstNameAr = firstNameAr;
	}

	public String getLastNameAr() {
		return lastNameAr;
	}

	public void setLastNameAr(String lastNameAr) {
		this.lastNameAr = lastNameAr;
	}

	public String getNickNameAr() {
		return nickNameAr;
	}

	public void setNickNameAr(String nickNameAr) {
		this.nickNameAr = nickNameAr;
	}

	public String getMiddleNameAr() {
		return middleNameAr;
	}

	public void setMiddleNameAr(String middleNameAr) {
		this.middleNameAr = middleNameAr;
	}

	public String getMobile1() {
		return mobile1;
	}

	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}

	public String getMobile2() {
		return mobile2;
	}

	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getTelExtension() {
		return telExtension;
	}

	public void setTelExtension(String telExtension) {
		this.telExtension = telExtension;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getPostCode2() {
		return postCode2;
	}

	public void setPostCode2(String postCode2) {
		this.postCode2 = postCode2;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getCity2() {
		return city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public String getPostCode1() {
		return postCode1;
	}

	public void setPostCode1(String postCode1) {
		this.postCode1 = postCode1;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getDefaultComm() {
		return defaultComm;
	}

	public void setDefaultComm(String defaultComm) {
		this.defaultComm = defaultComm;
	}

	public String getCustGr1() {
		return custGr1;
	}

	public void setCustGr1(String custGr1) {
		this.custGr1 = custGr1;
	}

	public String getCustGr2() {
		return custGr2;
	}

	public void setCustGr2(String custGr2) {
		this.custGr2 = custGr2;
	}

	public String getCustGr3() {
		return custGr3;
	}

	public void setCustGr3(String custGr3) {
		this.custGr3 = custGr3;
	}

	public String getCustGr4() {
		return custGr4;
	}

	public void setCustGr4(String custGr4) {
		this.custGr4 = custGr4;
	}

	public String getCustGr5() {
		return custGr5;
	}

	public void setCustGr5(String custGr5) {
		this.custGr5 = custGr5;
	}

	public String getShippingCondition() {
		return shippingCondition;
	}

	public void setShippingCondition(String shippingCondition) {
		this.shippingCondition = shippingCondition;
	}

	public String getIncoTerm1() {
		return incoTerm1;
	}

	public void setIncoTerm1(String incoTerm1) {
		this.incoTerm1 = incoTerm1;
	}

	public String getCustGr() {
		return custGr;
	}

	public void setCustGr(String custGr) {
		this.custGr = custGr;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustPriceProc() {
		return custPriceProc;
	}

	public void setCustPriceProc(String custPriceProc) {
		this.custPriceProc = custPriceProc;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getAccountAsgnGrp() {
		return accountAsgnGrp;
	}

	public void setAccountAsgnGrp(String accountAsgnGrp) {
		this.accountAsgnGrp = accountAsgnGrp;
	}

	public String getRebate_relevant() {
		return rebate_relevant;
	}

	public void setRebate_relevant(String rebate_relevant) {
		this.rebate_relevant = rebate_relevant;
	}

	public String getSalesOffice() {
		return salesOffice;
	}

	public void setSalesOffice(String salesOffice) {
		this.salesOffice = salesOffice;
	}

	public String getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(String salesOrg) {
		this.salesOrg = salesOrg;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Double getMoNetInc() {
		return moNetInc;
	}

	public void setMoNetInc(Double moNetInc) {
		this.moNetInc = moNetInc;
	}

	public Double getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(Double netIncome) {
		this.netIncome = netIncome;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getTaxNum() {
		return taxNum;
	}

	public void setTaxNum(String taxNum) {
		this.taxNum = taxNum;
	}

	public String getTaxCity() {
		return taxCity;
	}

	public void setTaxCity(String taxCity) {
		this.taxCity = taxCity;
	}

	public String getTaxReg() {
		return taxReg;
	}

	public void setTaxReg(String taxReg) {
		this.taxReg = taxReg;
	}

	public String getTax_type() {
		return tax_type;
	}

	public void setTax_type(String tax_type) {
		this.tax_type = tax_type;
	}

	public String getTaxGroup() {
		return taxGroup;
	}

	public void setTaxGroup(String taxGroup) {
		this.taxGroup = taxGroup;
	}

	public String getDependentsNo() {
		return dependentsNo;
	}

	public void setDependentsNo(String dependentsNo) {
		this.dependentsNo = dependentsNo;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getChangedAt() {
		return changedAt;
	}

	public void setChangedAt(String changedAt) {
		this.changedAt = changedAt;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public String getHomeLat() {
		return homeLat;
	}

	public void setHomeLat(String homeLat) {
		this.homeLat = homeLat;
	}

	public String getHomeLong() {
		return homeLong;
	}

	public void setHomeLong(String homeLong) {
		this.homeLong = homeLong;
	}

	public String getWorkLat() {
		return workLat;
	}

	public void setWorkLat(String workLat) {
		this.workLat = workLat;
	}

	public String getWorkLong() {
		return workLong;
	}

	public void setWorkLong(String workLong) {
		this.workLong = workLong;
	}

	public String getWasel() {
		return wasel;
	}

	public void setWasel(String wasel) {
		this.wasel = wasel;
	}

	@Override
	public String toString() {
		return "BpEntity [bpNo=" + bpNo + ", bpRole=" + bpRole + ", employee=" + employee + ", titleMedi=" + titleMedi
				+ ", status=" + status + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", nickName=" + nickName + ", gender=" + gender + ", natio=" + natio + ", langucorr="
				+ langucorr + ", marst=" + marst + ", birthPl=" + birthPl + ", birthDt=" + birthDt + ", emplo=" + emplo
				+ ", jobGr=" + jobGr + ", natpers=" + natpers + ", bpext=" + bpext + ", firstNameAr=" + firstNameAr
				+ ", lastNameAr=" + lastNameAr + ", nickNameAr=" + nickNameAr + ", middleNameAr=" + middleNameAr
				+ ", mobile1=" + mobile1 + ", mobile2=" + mobile2 + ", homePhone=" + homePhone + ", workPhone="
				+ workPhone + ", telExtension=" + telExtension + ", email1=" + email1 + ", email2=" + email2
				+ ", poBox=" + poBox + ", postCode2=" + postCode2 + ", province=" + province + ", region=" + region
				+ ", location=" + location + ", city1=" + city1 + ", city2=" + city2 + ", postCode1=" + postCode1
				+ ", street=" + street + ", roomNo=" + roomNo + ", country=" + country + ", building=" + building
				+ ", defaultComm=" + defaultComm + ", custGr1=" + custGr1 + ", custGr2=" + custGr2 + ", custGr3="
				+ custGr3 + ", custGr4=" + custGr4 + ", custGr5=" + custGr5 + ", shippingCondition=" + shippingCondition
				+ ", incoTerm1=" + incoTerm1 + ", custGr=" + custGr + ", currency=" + currency + ", custPriceProc="
				+ custPriceProc + ", paymentTerms=" + paymentTerms + ", accountAsgnGrp=" + accountAsgnGrp
				+ ", rebate_relevant=" + rebate_relevant + ", salesOffice=" + salesOffice + ", salesOrg=" + salesOrg
				+ ", channel=" + channel + ", division=" + division + ", moNetInc=" + moNetInc + ", netIncome="
				+ netIncome + ", vip=" + vip + ", type=" + type + ", idNo=" + idNo + ", validFrom=" + validFrom
				+ ", validTo=" + validTo + ", taxType=" + taxType + ", taxNum=" + taxNum + ", taxCity=" + taxCity
				+ ", taxReg=" + taxReg + ", tax_type=" + tax_type + ", taxGroup=" + taxGroup + ", dependentsNo="
				+ dependentsNo + ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", changedAt=" + changedAt
				+ ", changedBy=" + changedBy + ", homeLat=" + homeLat + ", homeLong=" + homeLong + ", workLat="
				+ workLat + ", workLong=" + workLong + ", wasel=" + wasel + "]";
	}
	
	
	
}