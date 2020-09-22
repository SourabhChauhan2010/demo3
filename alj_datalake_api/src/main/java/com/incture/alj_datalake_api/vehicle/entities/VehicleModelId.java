package com.incture.alj_datalake_api.vehicle.entities;

import java.io.Serializable;

public class VehicleModelId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String productId;
	private String extColor;
	private String intColor;
	
	public VehicleModelId() {
		
	}
	
	public VehicleModelId(String productId, String extColor, String intColor) {
		super();
		this.productId = productId;
		this.extColor = extColor;
		this.intColor = intColor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((extColor == null) ? 0 : extColor.hashCode());
		result = prime * result + ((intColor == null) ? 0 : intColor.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
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
		VehicleModelId other = (VehicleModelId) obj;
		if (extColor == null) {
			if (other.extColor != null)
				return false;
		} else if (!extColor.equals(other.extColor))
			return false;
		if (intColor == null) {
			if (other.intColor != null)
				return false;
		} else if (!intColor.equals(other.intColor))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}
	
	
}
