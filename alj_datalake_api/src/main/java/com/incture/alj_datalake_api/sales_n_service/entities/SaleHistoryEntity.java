package com.incture.alj_datalake_api.sales_n_service.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "TARGET_ZVEH_SALEHISTORY", schema = "ALJ_DEV_POC_HDI_DATALAKE_DB_1")
@IdClass(SaleHistoryRefId.class)
public class SaleHistoryEntity {
	
	@Id
	@Column(name = "ORDER_NO", length = 10)
	@NotNull
	private String orderNo;
	
	@Id
	@Column(name = "SO_ITEM_NUMBER", length = 6)
	@NotNull
	private String soItemNo;
	
	@Id
	@Column(name = "VIN", length = 35)
	@NotNull
	private String vin;
	
	@Id
	@Column(name = "CUSTOMER_BP", length = 10)
	@NotNull
	private String customerBp;
	
	@Id
	@Column(name = "INVOICE_NO", length = 10)
	@NotNull
	private String invoiceNo;
	
	@Id
	@Column(name = "CENTRE", length = 4)
	@NotNull
	private String center;
	
	@Column(name = "ORDER_TYPE", length = 4)
	private String orderType;
	
	@Column(name = "DESCRIPTION", length = 40)
	private String description;
	
	@Column(name = "STATUS", length = 4)
	private String status;
	
	@Column(name = "PLATE_NO", length = 15)
	private String plateNo;
	
	@Column(name = "ODOMETER_READING", precision = 2)
	private Double odometerReading;
	
	@Column(name = "CUSTOMER_ID", length = 60)
	private String customerId;
	
	@Column(name = "SHIPTO_BP", length = 10)
	private String shipToBp;
	
	@Column(name = "SHIPTO_ID", length = 60)
	private String shipToId;
	
	@Column(name = "INVOICE_CUSTOMER", length = 10)
	private String invoiceCustomer;
	
	@Column(name = "CUSTOMER_DELIVERY_DATE", length = 8)
	private String custDeliverDt;
	
	@Column(name = "CURRENCY", length = 5)
	private String currency;
	
	@Column(name = "PAYMENT_TERMS", length = 4)
	private String paymentTerms;
	
	@Column(name = "PRODUCT_ID", length = 50)
	private String productId;
	
	@Column(name = "VEHICLE_FULL_DESCRIPTION", length = 40)
	private String vehicleFullDesc;
	
	@Column(name = "NET_PRICE", precision = 17, scale = 2)
	private Double netPrice;
	
	@Column(name = "VEHICLE_TYPE", length = 29)
	private String vehicleType;
	
	@Column(name = "PLANT_NAME", length = 29)
	private String plantName;
	
	@Column(name = "VIN_BRAND", length = 30)
	private String vinBrand;
	
	@Column(name = "ALJ_SUFFIX", length = 30)
	private String aljSuffix;
	
	@Column(name = "COLOR", length = 29)
	private String color;
	
	@Column(name = "CREATED_AT", length = 15)
	private String createdAt;
	
	@Column(name = "CHANGED_ON", length = 8)
	private String changedOn;
	
	@Column(name = "MODEL_YEAR", length = 30)
	private String modelYear;
	
	@Column(name = "ZREF_MEINS", length = 3)
	private String zrefMeins;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSoItemNo() {
		return soItemNo;
	}

	public void setSoItemNo(String soItemNo) {
		this.soItemNo = soItemNo;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getCustomerBp() {
		return customerBp;
	}

	public void setCustomerBp(String customerBp) {
		this.customerBp = customerBp;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public Double getOdometerReading() {
		return odometerReading;
	}

	public void setOdometerReading(Double odometerReading) {
		this.odometerReading = odometerReading;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getShipToBp() {
		return shipToBp;
	}

	public void setShipToBp(String shipToBp) {
		this.shipToBp = shipToBp;
	}

	public String getShipToId() {
		return shipToId;
	}

	public void setShipToId(String shipToId) {
		this.shipToId = shipToId;
	}

	public String getInvoiceCustomer() {
		return invoiceCustomer;
	}

	public void setInvoiceCustomer(String invoiceCustomer) {
		this.invoiceCustomer = invoiceCustomer;
	}

	public String getCustDeliverDt() {
		return custDeliverDt;
	}

	public void setCustDeliverDt(String custDeliverDt) {
		this.custDeliverDt = custDeliverDt;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getVehicleFullDesc() {
		return vehicleFullDesc;
	}

	public void setVehicleFullDesc(String vehicleFullDesc) {
		this.vehicleFullDesc = vehicleFullDesc;
	}

	public Double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(Double netPrice) {
		this.netPrice = netPrice;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public String getVinBrand() {
		return vinBrand;
	}

	public void setVinBrand(String vinBrand) {
		this.vinBrand = vinBrand;
	}

	public String getAljSuffix() {
		return aljSuffix;
	}

	public void setAljSuffix(String aljSuffix) {
		this.aljSuffix = aljSuffix;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getChangedOn() {
		return changedOn;
	}

	public void setChangedOn(String changedOn) {
		this.changedOn = changedOn;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getZrefMeins() {
		return zrefMeins;
	}

	public void setZrefMeins(String zrefMeins) {
		this.zrefMeins = zrefMeins;
	}

	@Override
	public String toString() {
		return "SaleHistoryEntity [orderNo=" + orderNo + ", soItemNo=" + soItemNo + ", vin=" + vin + ", customerBp="
				+ customerBp + ", invoiceNo=" + invoiceNo + ", center=" + center + ", orderType=" + orderType
				+ ", description=" + description + ", status=" + status + ", plateNo=" + plateNo + ", odometerReading="
				+ odometerReading + ", customerId=" + customerId + ", shipToBp=" + shipToBp + ", shipToId=" + shipToId
				+ ", invoiceCustomer=" + invoiceCustomer + ", custDeliverDt=" + custDeliverDt + ", currency=" + currency
				+ ", paymentTerms=" + paymentTerms + ", productId=" + productId + ", vehicleFullDesc=" + vehicleFullDesc
				+ ", netPrice=" + netPrice + ", vehicleType=" + vehicleType + ", plantName=" + plantName + ", vinBrand="
				+ vinBrand + ", aljSuffix=" + aljSuffix + ", color=" + color + ", createdAt=" + createdAt
				+ ", changedOn=" + changedOn + ", modelYear=" + modelYear + ", zrefMeins=" + zrefMeins + "]";
	}
	
	
}
