package by.htp.homework.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.htp.homework.dao.DaoException;
import by.htp.homework.entity.*;
import by.htp.homework.service.ApplianceService;

public class ApplianceServiceImpl implements ApplianceService{
	
	public List<Appliance> findAppliance(String applType, Map<String, String> params) throws DaoException{
		
		List<Appliance> findItem = new ArrayList<Appliance>();
		ApplianceFactory factory = new ApplianceFactory();
		ApplianceType applianceType;
		Appliance newAppliance;
		
		for (ApplianceType type : ApplianceType.values()) {
			if (type.toString().equals(applType.toUpperCase())) {
				applianceType = type;
				newAppliance = factory.getAppliance(applianceType, params);
				if (newAppliance != null) {
				findItem.add(newAppliance);
				}
			} 
		}
		
		return findItem;
	}; 
	
	
	public void saveAppliance(String applType, Map<String, String> params) {
		// validation
		
		// realisation
	};
	public void setQuantity (int quantity, String applType, Map<String, String> params) {
		// validation
		
		// realisation
	};
	
}
