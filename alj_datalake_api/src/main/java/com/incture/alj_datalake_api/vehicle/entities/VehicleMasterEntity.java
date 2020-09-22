package com.incture.alj_datalake_api.vehicle.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TARGET_ZRVH_DEX_ZCRM_VEH_MASTER", schema = "ALJ_DEV_POC_HDI_DATALAKE_DB_1")
public class VehicleMasterEntity {

	@Id
	@Column(name = "PRODUCT_ID", length = 10)
	private String productId;
	
	@Column(name = "DESCRIPTION", length = 40)
	private String description;
	
	@Column(name = "DESCRIPTION_AR", length = 40)
	private String descriptionAr;
	
	@Column(name = "REGDATE", length = 8)
	private String regDate;
	
	@Column(name = "COMMENT1", length = 50)
	private String comment1;
	
	@Column(name = "ODOMETER")
	private double odometer;
	
	@Column(name = "PCOUNT_U", length = 3)
	private String pCount;
	
	@Column(name = "OWNER", length = 50)
	private String owner;
	
	@Column(name = "OWNER_ID", length = 60)
	private String ownerId;
	
	@Column(name = "DRIVER", length = 50)
	private String driver;
	
	@Column(name = "DRIVER_ID", length = 60)
	private String driverId;
	
	@Column(name = "VIN", length = 35)
	private String vin;
	
	@Column(name = "LPNO", length = 15)
	private String lpno;
	
	@Column(name = "LPCOUNTR", length = 50)
	private String lpCounter;
	
	@Column(name = "LPREGION", length = 50)
	private String lpRegion;
	
	@Column(name = "REF_PRODUCT", length = 40)
	private String refProduct;
	
	@Column(name = "VEH_USAGE", length = 2)
	private String vehUsage;

	@Column(name = "EXT_NO", length = 35)
	private String extNo;

	@Column(name = "CHASSIS_NO", length = 50)
	private String chassisNo;

	@Column(name = "ENGINE_NO", length = 50)
	private String engineNo;

	@Column(name = "WAX_DATE", length = 50)
	private String waxDate;

	@Column(name = "WAR_CAT", length = 2)
	private String warCat;

	@Column(name = "WAR_START", length = 8)
	private String warStart;

	@Column(name = "WAR_PERIOD")
	private double warPeriod;

	@Column(name = "WAR_PERIOD_U", length = 3)
	private String warPeriodU;

	@Column(name = "WAR_ENT", length = 50)
	private String warEnt;

	@Column(name = "INS_START", length = 50)
	private String insStart;

	@Column(name = "ACCE_DATE", length = 50)
	private String acceDate;

	@Column(name = "ACCE_VALUE", length = 50)
	private String acceValue;

	@Column(name = "PRICE", length = 50)
	private String price;

	@Column(name = "PRICE_C", length = 50)
	private String priceC;

	@Column(name = "USED", length = 1)
	private String used;

	@Column(name = "BRAND", length = 10)
	private String brand;

	@Column(name = "TYPE", length = 4)
	private String type;
	
	@Column(name = "BODY", length = 5)
	private String body;

	@Column(name = "DOORS", length = 1)
	private String doors;

	@Column(name = "PASSENGERS", length = 2)
	private String passengers;

	@Column(name = "FUEL_TYPE", length = 2)
	private String fuelType;

	@Column(name = "CUBIC_CAP")
	private double cubicCap;

	@Column(name = "CUBIC_CAP_U", length = 3)
	private String cubicCapU;

	@Column(name = "PERFORM")
	private double perform;

	@Column(name = "PERFORM_U", length = 3)
	private String performU;

	@Column(name = "EMMISSION")
	private double emmission;

	@Column(name = "EMMISSION_U", length = 3)
	private String emmissionU;

	@Column(name = "CYLINDERS", length = 2)
	private String cylinders;

	@Column(name = "MODEL_LINE", length = 20)
	private String modelLine;

	@Column(name = "MODEL_YEAR", length = 4)
	private String modelYear;

	@Column(name = "FC_COMB")
	private double fcComb;

	@Column(name = "FC_COMB_U", length = 3)
	private String fcCombU;

	@Column(name = "FC_CITY")
	private double fcCity;

	@Column(name = "FC_CITY_U", length = 3)
	private String fcCityU;
	
	@Column(name = "FC_ROAD")
	private double fcRoad;

	@Column(name = "FC_ROAD_U", length = 3)
	private String fcRoadU;

	@Column(name = "TANK")
	private double tank;

	@Column(name = "TANK_U", length = 3)
	private String tankU;

	@Column(name = "WEIGHT")
	private double weight;

	@Column(name = "WEIGHT_U", length = 3)
	private String weightU;

	@Column(name = "WEIGHT_MAX")
	private double weightMax;

	@Column(name = "WEIGHT_MAX_U", length = 3)
	private String weightMaxU;

	@Column(name = "TRANS", length = 2)
	private String trans;

	@Column(name = "POWERTRAIN", length = 2)
	private String powerTrain;

	@Column(name = "EXT_COLOUR", length = 50)
	private String extColour;
	
	@Column(name = "EXT_COLOUR_CODE", length = 50)
	private String extColorCode;

	@Column(name = "INT_COLOUR", length = 50)
	private String intColour;
	
	@Column(name = "INT_COLOUR_CODE", length = 50)
	private String intColorCode;
	
	@Column(name = "LPCOLOUR", length = 50)
	private String lpColour;

	@Column(name = "PRICE_WHOLESALE", length = 50)
	private String priceWholesale;

	@Column(name = "PRICE_RETAIL", length = 50)
	private String priceRetail;

	@Column(name = "LANDED_COST", length = 50)
	private String landedCost;

	@Column(name = "NDCINVOICEDATE", length = 50)
	private String ndcInvoiceDate;
	
	@Column(name = "NDCDISPATCHDATE", length = 50)
	private String ndcDispatchDate;
	
	@Column(name = "EUINVOICEDATE", length = 50)
	private String euInvoiceDate;
	
	@Column(name = "ARRIVEDATNDCDATE", length = 50)
	private String arrivedatndcDate;
	
	@Column(name = "NDC_INV_NO", length = 50)
	private String ndcInvNo;
	
	@Column(name = "EU_INV_NO", length = 50)
	private String EuInvNo;
	
	@Column(name = "ISAVAILABLEFORSALE", length = 2)
	private String isAvailableForSale;
	
	@Column(name = "ISDAMAGED", length = 1)
	private String isDamaged;
	
	@Column(name = "ISINVOICED", length = 50)
	private String isInvoiced;
	
	@Column(name = "GTLOCATION", length = 50)
	private String gtLocation;
	
	@Column(name = "GTNUMBER", length = 50)
	private String gtNumber;
	
	@Column(name = "GTP", length = 50)
	private String gtp;
	
	@Column(name = "REG_TYPE", length = 50)
	private String regType;

	@Column(name = "STATUS", length = 50)
	private String status;
	
	@Column(name = "LOCATION", length = 50)
	private String location;
	
	@Column(name = "COMPANY_ID", length = 50)
	private String companyId;
	
	@Column(name = "REGION_ID", length = 50)
	private String regionId;
	
	@Column(name = "OWNER_LOC", length = 50)
	private String ownerLoc;
	
	@Column(name = "CASE_NO", length = 50)
	private String caseNo;
	
	@Column(name = "CHANGED_AT", length = 15)
	private String changedAt;
	
	@Column(name = "CENTRE", length = 10)
	private String centre;
	
	@Column(name = "GRADE", length = 20)
	private String grade;
		
	@Column(name = "CHANGED_DATE", length = 8)
	private String changedDate;
	
	@Column(name = "REC_STATUS", length = 1)
	private String recStatus;
	
	@Column(name = "MMSTA", length = 4)
	private String mmsta;
	
	@Column(name = "SDSTA", length = 4)
	private String sdsta;
	
	@Column(name = "CMPRE")
	private double cmpre;
	
	@Column(name = "ZZVC_TRIM", length = 30)
	private String zzvcTrim;
	
	@Column(name = "WAERS", length = 5)
	private String waers;
	
//	@Column(name = "/DBM/SPART", length = 2)
//	private String dbmSpart;
	
	@Column(name = "MODEL_CODE", length = 30)
	private String modelCode;
	
	@Column(name = "WTY_STATUS", length = 10)
	private String wtyStatus;
	
	@Column(name = "CREATED_AT", length = 15)
	private String createdAt;
	
	@Column(name = "ERDAT", length = 8)
	private String erdat;
	
	@Column(name = "MODIFIED_AT", length = 15)
	private String modifiedAt;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionAr() {
		return descriptionAr;
	}

	public void setDescriptionAr(String descriptionAr) {
		this.descriptionAr = descriptionAr;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	public double getOdometer() {
		return odometer;
	}

	public void setOdometer(double odometer) {
		this.odometer = odometer;
	}

	public String getpCount() {
		return pCount;
	}

	public void setpCount(String pCount) {
		this.pCount = pCount;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getLpno() {
		return lpno;
	}

	public void setLpno(String lpno) {
		this.lpno = lpno;
	}

	public String getLpCounter() {
		return lpCounter;
	}

	public void setLpCounter(String lpCounter) {
		this.lpCounter = lpCounter;
	}

	public String getLpRegion() {
		return lpRegion;
	}

	public void setLpRegion(String lpRegion) {
		this.lpRegion = lpRegion;
	}

	public String getRefProduct() {
		return refProduct;
	}

	public void setRefProduct(String refProduct) {
		this.refProduct = refProduct;
	}

	public String getVehUsage() {
		return vehUsage;
	}

	public void setVehUsage(String vehUsage) {
		this.vehUsage = vehUsage;
	}

	public String getExtNo() {
		return extNo;
	}

	public void setExtNo(String extNo) {
		this.extNo = extNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getWaxDate() {
		return waxDate;
	}

	public void setWaxDate(String waxDate) {
		this.waxDate = waxDate;
	}

	public String getWarCat() {
		return warCat;
	}

	public void setWarCat(String warCat) {
		this.warCat = warCat;
	}

	public String getWarStart() {
		return warStart;
	}

	public void setWarStart(String warStart) {
		this.warStart = warStart;
	}

	public double getWarPeriod() {
		return warPeriod;
	}

	public void setWarPeriod(double warPeriod) {
		this.warPeriod = warPeriod;
	}

	public String getWarPeriodU() {
		return warPeriodU;
	}

	public void setWarPeriodU(String warPeriodU) {
		this.warPeriodU = warPeriodU;
	}

	public String getWarEnt() {
		return warEnt;
	}

	public void setWarEnt(String warEnt) {
		this.warEnt = warEnt;
	}

	public String getInsStart() {
		return insStart;
	}

	public void setInsStart(String insStart) {
		this.insStart = insStart;
	}

	public String getAcceDate() {
		return acceDate;
	}

	public void setAcceDate(String acceDate) {
		this.acceDate = acceDate;
	}

	public String getAcceValue() {
		return acceValue;
	}

	public void setAcceValue(String acceValue) {
		this.acceValue = acceValue;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceC() {
		return priceC;
	}

	public void setPriceC(String priceC) {
		this.priceC = priceC;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getCubicCap() {
		return cubicCap;
	}

	public void setCubicCap(double cubicCap) {
		this.cubicCap = cubicCap;
	}

	public String getCubicCapU() {
		return cubicCapU;
	}

	public void setCubicCapU(String cubicCapU) {
		this.cubicCapU = cubicCapU;
	}

	public double getPerform() {
		return perform;
	}

	public void setPerform(double perform) {
		this.perform = perform;
	}

	public String getPerformU() {
		return performU;
	}

	public void setPerformU(String performU) {
		this.performU = performU;
	}

	public double getEmmission() {
		return emmission;
	}

	public void setEmmission(double emmission) {
		this.emmission = emmission;
	}

	public String getEmmissionU() {
		return emmissionU;
	}

	public void setEmmissionU(String emmissionU) {
		this.emmissionU = emmissionU;
	}

	public String getCylinders() {
		return cylinders;
	}

	public void setCylinders(String cylinders) {
		this.cylinders = cylinders;
	}

	public String getModelLine() {
		return modelLine;
	}

	public void setModelLine(String modelLine) {
		this.modelLine = modelLine;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public double getFcComb() {
		return fcComb;
	}

	public void setFcComb(double fcComb) {
		this.fcComb = fcComb;
	}

	public String getFcCombU() {
		return fcCombU;
	}

	public void setFcCombU(String fcCombU) {
		this.fcCombU = fcCombU;
	}

	public double getFcCity() {
		return fcCity;
	}

	public void setFcCity(double fcCity) {
		this.fcCity = fcCity;
	}

	public String getFcCityU() {
		return fcCityU;
	}

	public void setFcCityU(String fcCityU) {
		this.fcCityU = fcCityU;
	}

	public double getFcRoad() {
		return fcRoad;
	}

	public void setFcRoad(double fcRoad) {
		this.fcRoad = fcRoad;
	}

	public String getFcRoadU() {
		return fcRoadU;
	}

	public void setFcRoadU(String fcRoadU) {
		this.fcRoadU = fcRoadU;
	}

	public double getTank() {
		return tank;
	}

	public void setTank(double tank) {
		this.tank = tank;
	}

	public String getTankU() {
		return tankU;
	}

	public void setTankU(String tankU) {
		this.tankU = tankU;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getWeightU() {
		return weightU;
	}

	public void setWeightU(String weightU) {
		this.weightU = weightU;
	}

	public double getWeightMax() {
		return weightMax;
	}

	public void setWeightMax(double weightMax) {
		this.weightMax = weightMax;
	}

	public String getWeightMaxU() {
		return weightMaxU;
	}

	public void setWeightMaxU(String weightMaxU) {
		this.weightMaxU = weightMaxU;
	}

	public String getTrans() {
		return trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public String getPowerTrain() {
		return powerTrain;
	}

	public void setPowerTrain(String powerTrain) {
		this.powerTrain = powerTrain;
	}

	public String getExtColour() {
		return extColour;
	}

	public void setExtColour(String extColour) {
		this.extColour = extColour;
	}

	public String getExtColorCode() {
		return extColorCode;
	}

	public void setExtColorCode(String extColorCode) {
		this.extColorCode = extColorCode;
	}

	public String getIntColour() {
		return intColour;
	}

	public void setIntColour(String intColour) {
		this.intColour = intColour;
	}

	public String getIntColorCode() {
		return intColorCode;
	}

	public void setIntColorCode(String intColorCode) {
		this.intColorCode = intColorCode;
	}

	public String getLpColour() {
		return lpColour;
	}

	public void setLpColour(String lpColour) {
		this.lpColour = lpColour;
	}

	public String getPriceWholesale() {
		return priceWholesale;
	}

	public void setPriceWholesale(String priceWholesale) {
		this.priceWholesale = priceWholesale;
	}

	public String getPriceRetail() {
		return priceRetail;
	}

	public void setPriceRetail(String priceRetail) {
		this.priceRetail = priceRetail;
	}

	public String getLandedCost() {
		return landedCost;
	}

	public void setLandedCost(String landedCost) {
		this.landedCost = landedCost;
	}

	public String getNdcInvoiceDate() {
		return ndcInvoiceDate;
	}

	public void setNdcInvoiceDate(String ndcInvoiceDate) {
		this.ndcInvoiceDate = ndcInvoiceDate;
	}

	public String getNdcDispatchDate() {
		return ndcDispatchDate;
	}

	public void setNdcDispatchDate(String ndcDispatchDate) {
		this.ndcDispatchDate = ndcDispatchDate;
	}

	public String getEuInvoiceDate() {
		return euInvoiceDate;
	}

	public void setEuInvoiceDate(String euInvoiceDate) {
		this.euInvoiceDate = euInvoiceDate;
	}

	public String getArrivedatndcDate() {
		return arrivedatndcDate;
	}

	public void setArrivedatndcDate(String arrivedatndcDate) {
		this.arrivedatndcDate = arrivedatndcDate;
	}

	public String getNdcInvNo() {
		return ndcInvNo;
	}

	public void setNdcInvNo(String ndcInvNo) {
		this.ndcInvNo = ndcInvNo;
	}

	public String getEuInvNo() {
		return EuInvNo;
	}

	public void setEuInvNo(String euInvNo) {
		EuInvNo = euInvNo;
	}

	public String getIsAvailableForSale() {
		return isAvailableForSale;
	}

	public void setIsAvailableForSale(String isAvailableForSale) {
		this.isAvailableForSale = isAvailableForSale;
	}

	public String getIsDamaged() {
		return isDamaged;
	}

	public void setIsDamaged(String isDamaged) {
		this.isDamaged = isDamaged;
	}

	public String getIsInvoiced() {
		return isInvoiced;
	}

	public void setIsInvoiced(String isInvoiced) {
		this.isInvoiced = isInvoiced;
	}

	public String getGtLocation() {
		return gtLocation;
	}

	public void setGtLocation(String gtLocation) {
		this.gtLocation = gtLocation;
	}

	public String getGtNumber() {
		return gtNumber;
	}

	public void setGtNumber(String gtNumber) {
		this.gtNumber = gtNumber;
	}

	public String getGtp() {
		return gtp;
	}

	public void setGtp(String gtp) {
		this.gtp = gtp;
	}

	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getOwnerLoc() {
		return ownerLoc;
	}

	public void setOwnerLoc(String ownerLoc) {
		this.ownerLoc = ownerLoc;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getChangedAt() {
		return changedAt;
	}

	public void setChangedAt(String changedAt) {
		this.changedAt = changedAt;
	}

	public String getCentre() {
		return centre;
	}

	public void setCentre(String centre) {
		this.centre = centre;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getChangedDate() {
		return changedDate;
	}

	public void setChangedDate(String changedDate) {
		this.changedDate = changedDate;
	}

	public String getRecStatus() {
		return recStatus;
	}

	public void setRecStatus(String recStatus) {
		this.recStatus = recStatus;
	}

	public String getMmsta() {
		return mmsta;
	}

	public void setMmsta(String mmsta) {
		this.mmsta = mmsta;
	}

	public String getSdsta() {
		return sdsta;
	}

	public void setSdsta(String sdsta) {
		this.sdsta = sdsta;
	}

	public double getCmpre() {
		return cmpre;
	}

	public void setCmpre(double cmpre) {
		this.cmpre = cmpre;
	}

	public String getZzvcTrim() {
		return zzvcTrim;
	}

	public void setZzvcTrim(String zzvcTrim) {
		this.zzvcTrim = zzvcTrim;
	}

	public String getWaers() {
		return waers;
	}

	public void setWaers(String waers) {
		this.waers = waers;
	}

	/*public String getDbmSpart() {
		return dbmSpart;
	}

	public void setDbmSpart(String dbmSpart) {
		this.dbmSpart = dbmSpart;
	}*/

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getWtyStatus() {
		return wtyStatus;
	}

	public void setWtyStatus(String wtyStatus) {
		this.wtyStatus = wtyStatus;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getErdat() {
		return erdat;
	}

	public void setErdat(String erdat) {
		this.erdat = erdat;
	}

	public String getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	@Override
	public String toString() {
		return "VehicleMasterEntity [productId=" + productId + ", description=" + description + ", descriptionAr="
				+ descriptionAr + ", regDate=" + regDate + ", comment1=" + comment1 + ", odometer=" + odometer
				+ ", pCount=" + pCount + ", owner=" + owner + ", ownerId=" + ownerId + ", driver=" + driver
				+ ", driverId=" + driverId + ", vin=" + vin + ", lpno=" + lpno + ", lpCounter=" + lpCounter
				+ ", lpRegion=" + lpRegion + ", refProduct=" + refProduct + ", vehUsage=" + vehUsage + ", extNo="
				+ extNo + ", chassisNo=" + chassisNo + ", engineNo=" + engineNo + ", waxDate=" + waxDate + ", warCat="
				+ warCat + ", warStart=" + warStart + ", warPeriod=" + warPeriod + ", warPeriodU=" + warPeriodU
				+ ", warEnt=" + warEnt + ", insStart=" + insStart + ", acceDate=" + acceDate + ", acceValue="
				+ acceValue + ", price=" + price + ", priceC=" + priceC + ", used=" + used + ", brand=" + brand
				+ ", type=" + type + ", body=" + body + ", doors=" + doors + ", passengers=" + passengers
				+ ", fuelType=" + fuelType + ", cubicCap=" + cubicCap + ", cubicCapU=" + cubicCapU + ", perform="
				+ perform + ", performU=" + performU + ", emmission=" + emmission + ", emmissionU=" + emmissionU
				+ ", cylinders=" + cylinders + ", modelLine=" + modelLine + ", modelYear=" + modelYear + ", fcComb="
				+ fcComb + ", fcCombU=" + fcCombU + ", fcCity=" + fcCity + ", fcCityU=" + fcCityU + ", fcRoad=" + fcRoad
				+ ", fcRoadU=" + fcRoadU + ", tank=" + tank + ", tankU=" + tankU + ", weight=" + weight + ", weightU="
				+ weightU + ", weightMax=" + weightMax + ", weightMaxU=" + weightMaxU + ", trans=" + trans
				+ ", powerTrain=" + powerTrain + ", extColour=" + extColour + ", extColorCode=" + extColorCode
				+ ", intColour=" + intColour + ", intColorCode=" + intColorCode + ", lpColour=" + lpColour
				+ ", priceWholesale=" + priceWholesale + ", priceRetail=" + priceRetail + ", landedCost=" + landedCost
				+ ", ndcInvoiceDate=" + ndcInvoiceDate + ", ndcDispatchDate=" + ndcDispatchDate + ", euInvoiceDate="
				+ euInvoiceDate + ", arrivedatndcDate=" + arrivedatndcDate + ", ndcInvNo=" + ndcInvNo + ", EuInvNo="
				+ EuInvNo + ", isAvailableForSale=" + isAvailableForSale + ", isDamaged=" + isDamaged + ", isInvoiced="
				+ isInvoiced + ", gtLocation=" + gtLocation + ", gtNumber=" + gtNumber + ", gtp=" + gtp + ", regType="
				+ regType + ", status=" + status + ", location=" + location + ", companyId=" + companyId + ", regionId="
				+ regionId + ", ownerLoc=" + ownerLoc + ", caseNo=" + caseNo + ", changedAt=" + changedAt + ", centre="
				+ centre + ", grade=" + grade + ", changedDate=" + changedDate + ", recStatus=" + recStatus + ", mmsta="
				+ mmsta + ", sdsta=" + sdsta + ", cmpre=" + cmpre + ", zzvcTrim=" + zzvcTrim + ", waers=" + waers
				+ ", modelCode=" + modelCode + ", wtyStatus=" + wtyStatus + ", createdAt="
				+ createdAt + ", erdat=" + erdat + ", modifiedAt=" + modifiedAt + "]";
	}
	
	
}

		 