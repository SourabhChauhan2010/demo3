package com.incture.alj_datalake_api.sales_n_service.entities;

import java.io.Serializable;

public class SaleHistoryRefId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String orderNo;
	private String soItemNo;
	private String vin;
	private String customerBp;
	private String invoiceNo;
	private String center;

	public SaleHistoryRefId() {

	}

	public SaleHistoryRefId(String orderNo, String soItemNo, String vin, String customerBp, String invoiceNo,
			String center) {
		super();
		this.orderNo = orderNo;
		this.soItemNo = soItemNo;
		this.vin = vin;
		this.customerBp = customerBp;
		this.invoiceNo = invoiceNo;
		this.center = center;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((customerBp == null) ? 0 : customerBp.hashCode());
		result = prime * result + ((invoiceNo == null) ? 0 : invoiceNo.hashCode());
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		result = prime * result + ((soItemNo == null) ? 0 : soItemNo.hashCode());
		result = prime * result + ((vin == null) ? 0 : vin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaleHistoryRefId other = (SaleHistoryRefId) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (customerBp == null) {
			if (other.customerBp != null)
				return false;
		} else if (!customerBp.equals(other.customerBp))
			return false;
		if (invoiceNo == null) {
			if (other.invoiceNo != null)
				return false;
		} else if (!invoiceNo.equals(other.invoiceNo))
			return false;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		if (soItemNo == null) {
			if (other.soItemNo != null)
				return false;
		} else if (!soItemNo.equals(other.soItemNo))
			return false;
		if (vin == null) {
			if (other.vin != null)
				return false;
		} else if (!vin.equals(other.vin))
			return false;
		return true;
	}

}
