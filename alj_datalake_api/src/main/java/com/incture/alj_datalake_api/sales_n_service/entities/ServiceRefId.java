package com.incture.alj_datalake_api.sales_n_service.entities;

import java.io.Serializable;

public class ServiceRefId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logSys;
	private String orderTypeForSplit;
	private String dbmOrderNo;
	
	public ServiceRefId() {

	}

	public ServiceRefId(String logSys, String orderTypeForSplit, String dbmOrderNo) {
		super();
		this.logSys = logSys;
		this.orderTypeForSplit = orderTypeForSplit;
		this.dbmOrderNo = dbmOrderNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dbmOrderNo == null) ? 0 : dbmOrderNo.hashCode());
		result = prime * result + ((logSys == null) ? 0 : logSys.hashCode());
		result = prime * result + ((orderTypeForSplit == null) ? 0 : orderTypeForSplit.hashCode());
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
		ServiceRefId other = (ServiceRefId) obj;
		if (dbmOrderNo == null) {
			if (other.dbmOrderNo != null)
				return false;
		} else if (!dbmOrderNo.equals(other.dbmOrderNo))
			return false;
		if (logSys == null) {
			if (other.logSys != null)
				return false;
		} else if (!logSys.equals(other.logSys))
			return false;
		if (orderTypeForSplit == null) {
			if (other.orderTypeForSplit != null)
				return false;
		} else if (!orderTypeForSplit.equals(other.orderTypeForSplit))
			return false;
		return true;
	}
	
}
