package by.htp.homework.dao.impl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import by.htp.homework.dao.ApplianceDao;
import by.htp.homework.dao.DaoException;
import by.htp.homework.entity.Appliance;
import by.htp.homework.entity.ApplianceFactory;
import by.htp.homework.entity.ApplianceType;

public class FileApplianceDao implements ApplianceDao {
	
	File dbFile = new File ("/src/sources/appliances_db.txt");
	Logic check = new Logic();

	@Override
	public void setQuantity(int quantity, String applType, Map<String, String> params) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Appliance> findAppliance(String applType, Map<String, String> params) 
			throws DaoException, IOException {
// метод поиска прибора по типу прибора + название и значение параметра
		FileReader fileReader;
		Appliance targetAppliance;
		ApplianceFactory factory = new ApplianceFactory();
		ApplianceType applianceType = null;
		List<Appliance> toReturn = new ArrayList<Appliance>();
		Map<String, String> newApplianceParams = new HashMap<String, String>();

		try {
			fileReader = new FileReader(System.getProperty("user.dir") + dbFile);
			BufferedReader reader = new BufferedReader (fileReader);
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				if(line.contains(applType)) {
					
				for (ApplianceType type : ApplianceType.values()) {
						if (type.toString().equals(applType.toUpperCase())) {
							applianceType = type;
						} 
					}
				if(check.checkParams(line, params)) {
				check.lineToMap(newApplianceParams, line);	
				targetAppliance = factory.getAppliance(applianceType, newApplianceParams);
				toReturn.add(targetAppliance);
				}
					
					break;
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} finally {
			
		}
		return toReturn;
	}


	@Override
	public void saveAppliance(String applianceType, Map<String, String> params) {
		// TODO метод сохранения в файл

	}

}
