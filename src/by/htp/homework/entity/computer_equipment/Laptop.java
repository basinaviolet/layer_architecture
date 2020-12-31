package by.htp.homework.entity.computer_equipment;

public class Laptop extends ComputerEquipment{
	
	int batteryCapacity;
	String os;
	int memoryROM;
	int memorySys;
	String cpu;
	int displayInch;
	
	public Laptop (String brand, String applianceType, float price,
			int batteryCapacity, String os, int memoryROM, int memorySys, String cpu, int displayInch, 
			boolean applianceSwitch) {
		super(brand, applianceType, price, applianceSwitch);
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryROM = memoryROM;
		this.memorySys = memorySys;
		this.cpu = cpu;
		this.displayInch = displayInch;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getMemoryROM() {
		return memoryROM;
	}

	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}

	public int getMemorySys() {
		return memorySys;
	}

	public void setMemorySys(int memorySys) {
		this.memorySys = memorySys;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
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
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + displayInch;
		result = prime * result + memoryROM;
		result = prime * result + memorySys;
		result = prime * result + ((os == null) ? 0 : os.hashCode());
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
		Laptop other = (Laptop) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (displayInch != other.displayInch)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		if (memorySys != other.memorySys)
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return applianceType + ": [" + brand + ", price: " + price + "[battery capacity=" + batteryCapacity 
				+ ", OS: " + os + ", memory ROM= " + memoryROM + ", system memory= "
				+ memorySys + ",CPU= " + cpu + ", display (inchs)= " + displayInch + "]"
				+ ", switch: " + applianceSwitch + "]";
	}



}
