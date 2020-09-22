package com.incture.alj_datalake_api.vehicle.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "TARGET_ZRVH_DEX_ZCRM_VEH_MODEL", schema = "ALJ_DEV_POC_HDI_DATALAKE_DB_1")
@IdClass(VehicleModelId.class)
public class VehicleModelEntity {

	@Id
	@Column(name = "PRODUCT_ID", length = 40)
	private String productId;
	
	@Id
	@Column(name = "EXT_COLOUR", length = 40)
	private String extColor;
	
	@Id
	@Column(name = "INT_COLOUR", length = 40)
	private String intColor;
	
	@Column(name = "DESCRIPTION", length = 60)
	private String Desc;
	
	@Column(name = "EXT_COL_DESC", length = 40)
	private String extColDesc;
	
	@Column(name = "INT_COL_DESC", length = 40)
	private String  intColDesc;
	
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
	private Double cubicCap;
	
	@Column(name = "CUBIC_CAP_U", length = 3)
	private String cubicCapU;
	
	@Column(name = "PERFORM")
	private boolean perform;
	
	@Column(name = "PERFORM_U", length = 3)
	private String performU;
	
	@Column(name = "EMMISSION")
	private Double emmission;
	
	@Column(name = "EMMISSION_U", length = 3)
	private String emmissionU;
	
	@Column(name = "CYLINDERS", length = 2)
	private String cylinders;
	
	@Column(name = "MODEL_LINE", length = 20)
	private String modelLine;
	
	@Column(name = "MODEL_YEAR", length = 4)
	private String modelYear;
	
	@Column(name = "FC_COMB")
	private Double fcComb;
	
	@Column(name = "FC_COMB_U", length = 3)
	private String fcCombU;
	
	@Column(name = "FC_CITY")
	private Double fcCity;

	@Column(name = "FC_CITY_U", length = 3)
	private String fcCityU;
	
	@Column(name = "FC_ROAD")
	private Double fcRoad;
	
	@Column(name = "FC_ROAD_U", length = 3)
	private String fcRoadU;
	
	@Column(name = "TANK")
	private Double tank;
	
	@Column(name = "TANK_U", length = 3)
	private String tankU;
	
	@Column(name = "WEIGHT")
	private Double weight;
	
	@Column(name = "WEIGHT_U", length = 3)
	private String weightU;
	
	@Column(name = "WEIGHT_MAX")
	private Double weightMax;
	
	@Column(name = "WEIGHT_MAX_U", length = 3)
	private String weightMaxU;
	
	@Column(name = "TRANS", length = 2)
	private String trans;
	
	@Column(name = "POWERTRAIN", length = 2)
	private String powerTrain;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "PRICE_C", length = 5)
	private String priceC;
	
	@Column(name = "USED", length = 1)
	private String used;
	
	@Column(name = "DESCRIPTION_AR", length = 40)
	private String descAr;
	
	@Column(name = "PURCHASE_PRICE")
	private Double purchasePrice;
	
	@Column(name = "CHANGED_AT", length = 15)
	private String changedAt;
	
	@Column(name = "CHANGED_DATE", length = 8)
	private String changedDate;
	
	@Column(name = "REC_STATUS", length = 1)
	private String recStatus;
	
	@Column(name = "CREATED_AT", length = 8)
	private String createdAt;
	
	@Column(name = "CREATED_AT_TMTSP", length = 15)
	private String createdAtTimestamp;

	@Column(name = "ZZVC_MODEL_CODE", length = 30)
	private String zzvcModelCode;
	
	@Column(name = "ZZVC_BRAND", length = 30)
	private String zzvcBrand;
	
	@Column(name = "ZZVC_BRAND_AR", length = 30)
	private String zzvcBrandAr;
	
	@Column(name = "ZZVC_PRODUCT", length = 30)
	private String zzvcProduct;
	
	@Column(name = "ZZVC_PRODUCT_AR", length = 30)
	private String zzvcProductAr;
	
	@Column(name = "ZZVC_BRANDSTYLE", length = 30)
	private String zzvcBrandStyle;
	
	@Column(name = "ZZVC_BRANDSTYLE_AR", length = 30)
	private String zzvcBrandStyleAr;
	
	@Column(name = "ZZVC_FUELTYPE", length = 30)
	private String zzvcFuelType;
	
	@Column(name = "ZZVC_FUELTYPE_AR", length = 30)
	private String zzvcFuelTypeAr;
	
	@Column(name = "ZZVC_POWERTRAIN", length = 30)
	private String zzvcPowerTrain;
	
	@Column(name = "ZZVC_POWERTRAIN_AR", length = 30)
	private String zzvcPowerTrainAr;
	
	@Column(name = "ZZVC_GRADE", length = 30)
	private String zzvcGrade;
	
	@Column(name = "ZZVC_GRADE_AR", length = 30)
	private String zzvcGradeAr;
	
	@Column(name = "ZZVC_TRANSMISSION", length = 30)
	private String zzcvTransmission;
	
	@Column(name = "ZZVC_ENGINE_SIZE", length = 30)
	private String zzvcEngineSize;
	
	@Column(name = "SUBPRODUCT", length = 10)
	private String subProduct;
	
	@Column(name = "LABVAL_TY", length = 15)
	private String labvalTy;
	
	@Column(name = "ALJ_SUFFIX", length = 4)
	private String aljSuffix;
	
	@Column(name = "MAKTX", length = 40)
	private String maktx;
	
	@Column(name = "ZMODEL_HYBRIS_ID", length = 40)
	private String zModelHybrisId;
	
	@Column(name = "ZZCV_SEGMENET", length = 18)
	private String zzvcSegment;
	
	@Column(name = "ZZCV_SEGMENET_AR", length = 18)
	private String zzvcSegmentAr;
	
	@Column(name = "EXT_COLOUR_AR", length = 40)
	private String extColorAr;
	
	@Column(name = "INT_COLOUR_AR", length = 40)
	private String intColorAr;
	
	@Column(name = "ZZVC_TRANSMISSION_AR", length = 30)
	private String zzvcTransmissionAr;
	
	@Column(name = "ZZCV_COUNTRY_OF_ORIGIN", length = 30)
	private String zzvcCountryOfOrigin;
	
	@Column(name = "ZZCV_COUNTRY_OF_ORIGIN_EN", length = 30)
	private String zzvcCountryOfOriginEn;
	
	@Column(name = "ZZCV_COUNTRY_OF_ORIGIN_AR", length = 30)
	private String zzvcCountryOfOriginAr;
	
	@Column(name = "ZZENGINE_TECH", length = 15)
	private String zzEngineTech;
	
	@Column(name = "MODIFIED_AT", length = 15)
	private String modifiedAt;
	
	@Column(name = "REF_WAERK", length = 5)
	private String refWaerk;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getExtColor() {
		return extColor;
	}

	public void setExtColor(String extColor) {
		this.extColor = extColor;
	}

	public String getIntColor() {
		return intColor;
	}

	public void setIntColor(String intColor) {
		this.intColor = intColor;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	public String getExtColDesc() {
		return extColDesc;
	}

	public void setExtColDesc(String extColDesc) {
		this.extColDesc = extColDesc;
	}

	public String getIntColDesc() {
		return intColDesc;
	}

	public void setIntColDesc(String intColDesc) {
		this.intColDesc = intColDesc;
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

	public Double getCubicCap() {
		return cubicCap;
	}

	public void setCubicCap(Double cubicCap) {
		this.cubicCap = cubicCap;
	}

	public String getCubicCapU() {
		return cubicCapU;
	}

	public void setCubicCapU(String cubicCapU) {
		this.cubicCapU = cubicCapU;
	}

	public boolean isPerform() {
		return perform;
	}

	public void setPerform(boolean perform) {
		this.perform = perform;
	}

	public String getPerformU() {
		return performU;
	}

	public void setPerformU(String performU) {
		this.performU = performU;
	}

	public Double getEmmission() {
		return emmission;
	}

	public void setEmmission(Double emmission) {
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

	public Double getFcComb() {
		return fcComb;
	}

	public void setFcComb(Double fcComb) {
		this.fcComb = fcComb;
	}

	public String getFcCombU() {
		return fcCombU;
	}

	public void setFcCombU(String fcCombU) {
		this.fcCombU = fcCombU;
	}

	public Double getFcCity() {
		return fcCity;
	}

	public void setFcCity(Double fcCity) {
		this.fcCity = fcCity;
	}

	public String getFcCityU() {
		return fcCityU;
	}

	public void setFcCityU(String fcCityU) {
		this.fcCityU = fcCityU;
	}

	public Double getFcRoad() {
		return fcRoad;
	}

	public void setFcRoad(Double fcRoad) {
		this.fcRoad = fcRoad;
	}

	public String getFcRoadU() {
		return fcRoadU;
	}

	public void setFcRoadU(String fcRoadU) {
		this.fcRoadU = fcRoadU;
	}

	public Double getTank() {
		return tank;
	}

	public void setTank(Double tank) {
		this.tank = tank;
	}

	public String getTankU() {
		return tankU;
	}

	public void setTankU(String tankU) {
		this.tankU = tankU;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getWeightU() {
		return weightU;
	}

	public void setWeightU(String weightU) {
		this.weightU = weightU;
	}

	public Double getWeightMax() {
		return weightMax;
	}

	public void setWeightMax(Double weightMax) {
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
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

	public String getDescAr() {
		return descAr;
	}

	public void setDescAr(String descAr) {
		this.descAr = descAr;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getChangedAt() {
		return changedAt;
	}

	public void setChangedAt(String changedAt) {
		this.changedAt = changedAt;
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

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedAtTimestamp() {
		return createdAtTimestamp;
	}

	public void setCreatedAtTimestamp(String createdAtTimestamp) {
		this.createdAtTimestamp = createdAtTimestamp;
	}

	public String getZzvcModelCode() {
		return zzvcModelCode;
	}

	public void setZzvcModelCode(String zzvcModelCode) {
		this.zzvcModelCode = zzvcModelCode;
	}

	public String getZzvcBrand() {
		return zzvcBrand;
	}

	public void setZzvcBrand(String zzvcBrand) {
		this.zzvcBrand = zzvcBrand;
	}

	public String getZzvcBrandAr() {
		return zzvcBrandAr;
	}

	public void setZzvcBrandAr(String zzvcBrandAr) {
		this.zzvcBrandAr = zzvcBrandAr;
	}

	public String getZzvcProduct() {
		return zzvcProduct;
	}

	public void setZzvcProduct(String zzvcProduct) {
		this.zzvcProduct = zzvcProduct;
	}

	public String getZzvcProductAr() {
		return zzvcProductAr;
	}

	public void setZzvcProductAr(String zzvcProductAr) {
		this.zzvcProductAr = zzvcProductAr;
	}

	public String getZzvcBrandStyle() {
		return zzvcBrandStyle;
	}

	public void setZzvcBrandStyle(String zzvcBrandStyle) {
		this.zzvcBrandStyle = zzvcBrandStyle;
	}

	public String getZzvcBrandStyleAr() {
		return zzvcBrandStyleAr;
	}

	public void setZzvcBrandStyleAr(String zzvcBrandStyleAr) {
		this.zzvcBrandStyleAr = zzvcBrandStyleAr;
	}

	public String getZzvcFuelType() {
		return zzvcFuelType;
	}

	public void setZzvcFuelType(String zzvcFuelType) {
		this.zzvcFuelType = zzvcFuelType;
	}

	public String getZzvcFuelTypeAr() {
		return zzvcFuelTypeAr;
	}

	public void setZzvcFuelTypeAr(String zzvcFuelTypeAr) {
		this.zzvcFuelTypeAr = zzvcFuelTypeAr;
	}

	public String getZzvcPowerTrain() {
		return zzvcPowerTrain;
	}

	public void setZzvcPowerTrain(String zzvcPowerTrain) {
		this.zzvcPowerTrain = zzvcPowerTrain;
	}

	public String getZzvcPowerTrainAr() {
		return zzvcPowerTrainAr;
	}

	public void setZzvcPowerTrainAr(String zzvcPowerTrainAr) {
		this.zzvcPowerTrainAr = zzvcPowerTrainAr;
	}

	public String getZzvcGrade() {
		return zzvcGrade;
	}

	public void setZzvcGrade(String zzvcGrade) {
		this.zzvcGrade = zzvcGrade;
	}

	public String getZzvcGradeAr() {
		return zzvcGradeAr;
	}

	public void setZzvcGradeAr(String zzvcGradeAr) {
		this.zzvcGradeAr = zzvcGradeAr;
	}

	public String getZzcvTransmission() {
		return zzcvTransmission;
	}

	public void setZzcvTransmission(String zzcvTransmission) {
		this.zzcvTransmission = zzcvTransmission;
	}

	public String getZzvcEngineSize() {
		return zzvcEngineSize;
	}

	public void setZzvcEngineSize(String zzvcEngineSize) {
		this.zzvcEngineSize = zzvcEngineSize;
	}

	public String getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}

	public String getLabvalTy() {
		return labvalTy;
	}

	public void setLabvalTy(String labvalTy) {
		this.labvalTy = labvalTy;
	}

	public String getAljSuffix() {
		return aljSuffix;
	}

	public void setAljSuffix(String aljSuffix) {
		this.aljSuffix = aljSuffix;
	}

	public String getMaktx() {
		return maktx;
	}

	public void setMaktx(String maktx) {
		this.maktx = maktx;
	}

	public String getzModelHybrisId() {
		return zModelHybrisId;
	}

	public void setzModelHybrisId(String zModelHybrisId) {
		this.zModelHybrisId = zModelHybrisId;
	}

	public String getZzvcSegment() {
		return zzvcSegment;
	}

	public void setZzvcSegment(String zzvcSegment) {
		this.zzvcSegment = zzvcSegment;
	}

	public String getZzvcSegmentAr() {
		return zzvcSegmentAr;
	}

	public void setZzvcSegmentAr(String zzvcSegmentAr) {
		this.zzvcSegmentAr = zzvcSegmentAr;
	}

	public String getExtColorAr() {
		return extColorAr;
	}

	public void setExtColorAr(String extColorAr) {
		this.extColorAr = extColorAr;
	}

	public String getIntColorAr() {
		return intColorAr;
	}

	public void setIntColorAr(String intColorAr) {
		this.intColorAr = intColorAr;
	}

	public String getZzvcTransmissionAr() {
		return zzvcTransmissionAr;
	}

	public void setZzvcTransmissionAr(String zzvcTransmissionAr) {
		this.zzvcTransmissionAr = zzvcTransmissionAr;
	}

	public String getZzvcCountryOfOrigin() {
		return zzvcCountryOfOrigin;
	}

	public void setZzvcCountryOfOrigin(String zzvcCountryOfOrigin) {
		this.zzvcCountryOfOrigin = zzvcCountryOfOrigin;
	}

	public String getZzvcCountryOfOriginEn() {
		return zzvcCountryOfOriginEn;
	}

	public void setZzvcCountryOfOriginEn(String zzvcCountryOfOriginEn) {
		this.zzvcCountryOfOriginEn = zzvcCountryOfOriginEn;
	}

	public String getZzvcCountryOfOriginAr() {
		return zzvcCountryOfOriginAr;
	}

	public void setZzvcCountryOfOriginAr(String zzvcCountryOfOriginAr) {
		this.zzvcCountryOfOriginAr = zzvcCountryOfOriginAr;
	}

	public String getZzEngineTech() {
		return zzEngineTech;
	}

	public void setZzEngineTech(String zzEngineTech) {
		this.zzEngineTech = zzEngineTech;
	}

	public String getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public String getRefWaerk() {
		return refWaerk;
	}

	public void setRefWaerk(String refWaerk) {
		this.refWaerk = refWaerk;
	}

	@Override
	public String toString() {
		return "VehicleModelEntity [productId=" + productId + ", extColor=" + extColor + ", intColor=" + intColor
				+ ", Desc=" + Desc + ", extColDesc=" + extColDesc + ", intColDesc=" + intColDesc + ", brand=" + brand
				+ ", type=" + type + ", body=" + body + ", doors=" + doors + ", passengers=" + passengers
				+ ", fuelType=" + fuelType + ", cubicCap=" + cubicCap + ", cubicCapU=" + cubicCapU + ", perform="
				+ perform + ", performU=" + performU + ", emmission=" + emmission + ", emmissionU=" + emmissionU
				+ ", cylinders=" + cylinders + ", modelLine=" + modelLine + ", modelYear=" + modelYear + ", fcComb="
				+ fcComb + ", fcCombU=" + fcCombU + ", fcCity=" + fcCity + ", fcCityU=" + fcCityU + ", fcRoad=" + fcRoad
				+ ", fcRoadU=" + fcRoadU + ", tank=" + tank + ", tankU=" + tankU + ", weight=" + weight + ", weightU="
				+ weightU + ", weightMax=" + weightMax + ", weightMaxU=" + weightMaxU + ", trans=" + trans
				+ ", powerTrain=" + powerTrain + ", price=" + price + ", priceC=" + priceC + ", used=" + used
				+ ", descAr=" + descAr + ", purchasePrice=" + purchasePrice + ", changedAt=" + changedAt
				+ ", changedDate=" + changedDate + ", recStatus=" + recStatus + ", createdAt=" + createdAt
				+ ", createdAtTimestamp=" + createdAtTimestamp + ", zzvcModelCode=" + zzvcModelCode + ", zzvcBrand="
				+ zzvcBrand + ", zzvcBrandAr=" + zzvcBrandAr + ", zzvcProduct=" + zzvcProduct + ", zzvcProductAr="
				+ zzvcProductAr + ", zzvcBrandStyle=" + zzvcBrandStyle + ", zzvcBrandStyleAr=" + zzvcBrandStyleAr
				+ ", zzvcFuelType=" + zzvcFuelType + ", zzvcFuelTypeAr=" + zzvcFuelTypeAr + ", zzvcPowerTrain="
				+ zzvcPowerTrain + ", zzvcPowerTrainAr=" + zzvcPowerTrainAr + ", zzvcGrade=" + zzvcGrade
				+ ", zzvcGradeAr=" + zzvcGradeAr + ", zzcvTransmission=" + zzcvTransmission + ", zzvcEngineSize="
				+ zzvcEngineSize + ", subProduct=" + subProduct + ", labvalTy=" + labvalTy + ", aljSuffix=" + aljSuffix
				+ ", maktx=" + maktx + ", zModelHybrisId=" + zModelHybrisId + ", zzvcSegment=" + zzvcSegment
				+ ", zzvcSegmentAr=" + zzvcSegmentAr + ", extColorAr=" + extColorAr + ", intColorAr=" + intColorAr
				+ ", zzvcTransmissionAr=" + zzvcTransmissionAr + ", zzvcCountryOfOrigin=" + zzvcCountryOfOrigin
				+ ", zzvcCountryOfOriginEn=" + zzvcCountryOfOriginEn + ", zzvcCountryOfOriginAr="
				+ zzvcCountryOfOriginAr + ", zzEngineTech=" + zzEngineTech + ", modifiedAt=" + modifiedAt
				+ ", refWaerk=" + refWaerk + "]";
	}
	
	
}