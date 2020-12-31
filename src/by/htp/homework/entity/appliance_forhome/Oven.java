package by.htp.homework.entity.appliance_forhome;

import java.util.Arrays;

public class Oven extends ApplianceForHome{

	int capacity;
	int weight;
	int[] size; //depth, height, width
	
	public Oven(String brand, String applianceType, float price, String power, 
			int capacity, int weight, int[] size, boolean applianceSwitch) {
		super(brand, applianceType, price, power, applianceSwitch);
		this.capacity = capacity;
		this.weight = weight;
		this.size = size;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int[] getSize() {
		return size;
	}

	public void setSize(int[] size) {
		this.size = size;
	}
	
	public String sizeToString (int[] size) {
		return "[depth= " + size[0] + ", height= " + size[1] + ", width= " + size[2] + "]"; 
	}

	public int getweight() {
		return weight;
	}

	public void setweight(int weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacity;
		result = prime * result + weight;
		result = prime * result + Arrays.hashCode(size);
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
		Oven other = (Oven) obj;
		if (capacity != other.capacity)
			return false;
		if (weight != other.weight)
			return false;
		if (!Arrays.equals(size, other.size))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return applianceType + ": [" + brand + "price: " + price + "$, power= " + power + ", capacity= " + capacity 
				+ "[weight= " + weight + ", size: " + sizeToString(size) 
				+ ", switch: " + applianceSwitch + "]";
	}

}
