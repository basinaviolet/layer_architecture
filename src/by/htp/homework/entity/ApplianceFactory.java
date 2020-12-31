package by.htp.homework.entity;

import java.util.Map;

import by.htp.homework.entity.appliance_forhome.Oven;
import by.htp.homework.entity.appliance_forhome.VacuumCleaner;
import by.htp.homework.entity.computer_equipment.Laptop;
import by.htp.homework.entity.computer_equipment.TabletPC;

public class ApplianceFactory {
public Appliance getAppliance(ApplianceType applianceType, Map<String, String> params) {
	
	Appliance toReturn = null;

	try {
	switch (applianceType) {
	//Oven(String brand, String applianceType, float price, String power, 
	//     int capacity, int weight, int[] size, boolean applianceSwitch)
	// POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5
	case OVEN: 
	int[] size = {Integer.parseInt(params.get("DEPTH")), Integer.parseInt(params.get("HEIGHT")),
			Integer.parseInt(params.get("WIDTH"))};
		
	toReturn = new Oven("Brand", "Oven", 0,	params.get("POWER_CONSUMPTION"), 
				Integer.parseInt(params.get("CAPACITY")), Integer.parseInt(params.get("WEIGHT")),
				size, true);
		
		break;
		
	//VacuumCleaner(String brand, String applianceType, float price, String power,
	//	String filter, String bag, String wand, int speed, int cleanWidth, boolean applianceSwitch)
	//POWER_CONSUMPTION=100, FILTER_TYPE=A, BAG_TYPE=A2, WAND_TYPE=all-in-one, 
	//MOTOR_SPEED_REGULATION=3000, CLEANING_WIDTH=20
	case VACUUMCLEANER: 
		toReturn = new VacuumCleaner("Brand", "VacuumCleaner", 0, params.get("POWER_CONSUMPTION"),
				params.get("FILTER_TYPE"), params.get("BAG_TYPE"), params.get("WAND_TYPE"), 
				Integer.parseInt(params.get("MOTOR_SPEED_REGULATION")), Integer.parseInt(params.get("CLEANING_WIDTH")), true);
		break;
		
	//	Laptop (String brand, String applianceType, float price,
	//	int batteryCapacity, String os, int memoryROM, int memorySys, String cpu, int displayInch, 
	//	boolean applianceSwitch)
	//	BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHS=18
	case LAPTOP: 
		toReturn = new Laptop("Brand", "LapTop", 0, Integer.parseInt(params.get("BATTERY_CAPACITY")),
				params.get("OS"), Integer.parseInt(params.get("MEMORY_ROM")), 
				Integer.parseInt(params.get("SYSTEM_MEMORY")), params.get("CPU"), 
				Integer.parseInt(params.get("DISPLAY_INCHS")), true);
		break;
		
	//TabletPC (String brand, String applianceType, float price,
	//	int batteryCapacity, String color, int memoryROM, int memoryFlash, int displayInch, 
	//	boolean applianceSwitch)
	// BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=2, COLOR=blue		
	case TABLETPC:
		toReturn = new TabletPC("Brand", "TabletPC", 0, Integer.parseInt(params.get("BATTERY_CAPACITY")),
				params.get("COLOR"), Integer.parseInt(params.get("MEMORY_ROM")),
				Integer.parseInt(params.get("FLASH_MEMORY_CAPACITY")), 
				Integer.parseInt(params.get("DISPLAY_INCHES")), true);	
		break;
	default:
		throw new IllegalArgumentException();
}
	} catch (Exception e) {
		toReturn = null;
	}
	return toReturn;
	
}
}
