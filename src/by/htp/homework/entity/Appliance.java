package by.htp.homework.entity;

public interface Appliance {

String brand = "brand";
String applianceType = "applianceType";
float price = 0;
boolean appleanceSwitch = true;
public abstract void switchOn();
public abstract void switchOff();

/*public Appliance (String name, String brand, float price) {
	super();
	this.name = name;
	this.brand = brand;
	this.price = price;
	
}




public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

*/


}
