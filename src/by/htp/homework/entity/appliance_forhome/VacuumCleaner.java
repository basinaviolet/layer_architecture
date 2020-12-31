package by.htp.homework.entity.appliance_forhome;

public class VacuumCleaner extends ApplianceForHome{

	String filter;
	String bag;
	String wand;
	int speed;
	int cleanWidth;
	
	public VacuumCleaner(String brand, String applianceType, float price, String power,
			String filter, String bag, String wand, int speed, int cleanWidth, boolean applianceSwitch) {
		super(brand, applianceType, price, power, applianceSwitch);
		this.filter = filter;
		this.bag = bag;
		this.wand = wand;
		this.speed = speed;
		this.cleanWidth = cleanWidth;
	}

	public String getFilter() {
		return filter;
	}


	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getBag() {
		return bag;
	}

	public void setBag(String bag) {
		this.bag = bag;
	}

	public String getWand() {
		return wand;
	}

	public void setWand(String wand) {
		this.wand = wand;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCleanWidth() {
		return cleanWidth;
	}

	public void setCleanWidth(int cleanWidth) {
		this.cleanWidth = cleanWidth;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bag == null) ? 0 : bag.hashCode());
		result = prime * result + cleanWidth;
		result = prime * result + ((filter == null) ? 0 : filter.hashCode());
		result = prime * result + speed;
		result = prime * result + ((wand == null) ? 0 : wand.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bag == null) {
			if (other.bag != null)
				return false;
		} else if (!bag.equals(other.bag))
			return false;
		if (cleanWidth != other.cleanWidth)
			return false;
		if (filter == null) {
			if (other.filter != null)
				return false;
		} else if (!filter.equals(other.filter))
			return false;
		if (speed != other.speed)
			return false;
		if (wand == null) {
			if (other.wand != null)
				return false;
		} else if (!wand.equals(other.wand))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return applianceType + ": ["+ brand + "price: " + price + "$, power= " + power
				+ ", [filter type: " + filter + ", bag type: " + bag + ", wand type: " + wand 
				+ "], motor speed regulation=" + speed	+ ", cleanWidth=" + cleanWidth 
				+ ", switch: " + applianceSwitch + "]";
	}

}
