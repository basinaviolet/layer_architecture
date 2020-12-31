package by.htp.homework.entity.computer_equipment;

public class TabletPC extends ComputerEquipment{
	
	int batteryCapacity;
	String color;
	int memoryROM;
	int memoryFlash;
	int displayInch;
	
	public TabletPC (String brand, String applianceType, float price,
			int batteryCapacity, String color, int memoryROM, int memoryFlash, int displayInch, 
			boolean applianceSwitch) {
		super(brand, applianceType, price, applianceSwitch);
		this.batteryCapacity = batteryCapacity;
		this.color = color;
		this.memoryROM = memoryROM;
		this.memoryFlash = memoryFlash;
		this.displayInch = displayInch;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMemoryFlash() {
		return memoryFlash;
	}

	public void setMemoryFlash(int memoryFlash) {
		this.memoryFlash = memoryFlash;
	}

	public int getMemoryROM() {
		return memoryROM;
	}

	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}

	public int getDisplayInch() {
		return displayInch;
	}

	public void setDisplayInch(int displayInch) {
		this.displayInch = displayInch;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
		result = prime * result + displayInch;
		result = prime * result + memoryROM;
		result = prime * result + memoryFlash;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (displayInch != other.displayInch)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		if (memoryFlash != other.memoryFlash)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return applianceType + ": [" + brand + ", price: " + price + ", color: " + color + "[battery capacity=" + batteryCapacity 
				+ ", memory ROM= " + memoryROM + ", flash memory= "	+ memoryFlash 
				+ ", display (inchs)= " + displayInch + "]" + ", switch: " + applianceSwitch + "]";
	}



}
