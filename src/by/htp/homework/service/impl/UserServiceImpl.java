package by.htp.homework.service.impl;

import java.io.IOException;

//import java.io.IOException;

import by.htp.homework.dao.DaoException;
import by.htp.homework.dao.DaoProvider;
import by.htp.homework.dao.UserDao;
//import by.htp.homework.dao.impl.ListUserDao;
import by.htp.homework.service.ServiceException;
import by.htp.homework.service.UserService;

public class UserServiceImpl implements UserService {
	
	String[] validChar = {"@", "-", "_"};

	DaoProvider provider = DaoProvider.getInstance();
	UserDao userDao = provider.getUserDao();
	
	@Override
	public boolean logination(String login, String password) throws ServiceException, IOException {
		
		// validation
		boolean result = false;
		if ((login != null) && (login.length() >= 6) || 
				(password != null) && (password.length() >= 8)) {
			if ((validation(login)) && (validation(password))){
				result = true;
			} else {
			throw new ServiceException();
			}
		}
	
		//autorisation
			DaoProvider provider= DaoProvider.getInstance();
			UserDao userDao = provider.getUserDao();
		try {	
			result = userDao.autorization(login, password);
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		 
		return result;
	}
	
	public boolean validation (String item) {
		boolean check = false;
		if(item.matches("[A-Za-z0-9_@-]*")) {
			check = true;
		} 
		
		return check;
	}

}
