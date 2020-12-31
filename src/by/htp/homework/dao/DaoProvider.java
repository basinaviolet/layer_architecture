package by.htp.homework.dao;

import by.htp.homework.dao.impl.FileApplianceDao;
import by.htp.homework.dao.impl.FileUserDao;
import by.htp.homework.dao.impl.ListUserDao;

public class DaoProvider {
	private static final DaoProvider instance = new DaoProvider();
	
	private UserDao userDao = new FileUserDao();
	private ApplianceDao applianceDao = new FileApplianceDao();
	
	private DaoProvider() {}
	
	public UserDao getUserDao() {
		return userDao;
	}

	public ApplianceDao getApplianceDao() {
		return applianceDao;
	}

	public static DaoProvider getInstance() {
		return instance;
	}
	
	

}
