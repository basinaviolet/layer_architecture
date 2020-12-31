package by.htp.homework.entity.computer_equipment;

import by.htp.homework.entity.Appliance;

public class ComputerEquipment implements Appliance {
	
	String brand;
	String applianceType;
	float price;
	boolean applianceSwitch;
	
	
	public ComputerEquipment(String brand, String applianceType, float price, boolean applianceSwitch) {
		super();
		this.brand = brand;
		this.applianceType = applianceType;
		this.price = price;
		this.applianceSwitch = applianceSwitch;
	}

	@Override
	public void switchOn() {
		if (!applianceSwitch) {
			applianceSwitch = true;
		}
		
	}

	@Override
	public void switchOff() {
		if(applianceSwitch) {
			applianceSwitch = false;
		}
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getApplianceType() {
		return applianceType;
	}

	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isApplianceSwitch() {
		return applianceSwitch;
	}

	public void setApplianceSwitch(boolean applianceSwitch) {
		this.applianceSwitch = applianceSwitch;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (applianceSwitch ? 1231 : 1237);
		result = prime * result + ((applianceType == null) ? 0 : applianceType.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + Float.floatToIntBits(price);
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
		ComputerEquipment other = (ComputerEquipment) obj;
		if (applianceSwitch != other.applianceSwitch)
			return false;
		if (applianceType == null) {
			if (other.applianceType != null)
				return false;
		} else if (!applianceType.equals(other.applianceType))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return applianceType +": [" + brand + ", price=" + price + ", switch=" + applianceSwitch + "]";
	}

	

}
