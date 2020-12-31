package by.htp.homework.service;

import java.util.List;
import java.util.Map;

import by.htp.homework.dao.DaoException;
import by.htp.homework.entity.Appliance;

public interface ApplianceService {

	List<Appliance> findAppliance(String applType, Map<String, String> params) throws ServiceException, DaoException; 
	void saveAppliance (String applType, Map<String, String> params) throws ServiceException;
	void setQuantity (int quantity, String applType, Map<String, String> params);
	
	
}
