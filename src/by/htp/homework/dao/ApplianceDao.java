package by.htp.homework.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import by.htp.homework.entity.Appliance;



public interface ApplianceDao {

	List<Appliance> findAppliance(String applType, Map<String, String> params) throws DaoException, IOException; 
	void saveAppliance (String applType, Map<String, String> params) throws DaoException;
	void setQuantity (int quantity, String applType, Map<String, String> params);
}
