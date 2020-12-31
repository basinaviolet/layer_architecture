package by.htp.homework.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.List;

import by.htp.homework.dao.DaoException;
import by.htp.homework.dao.UserDao;
//import by.htp.homework.entity.Appliance;
//import by.htp.homework.entity.User;
//import by.htp.homework.entity.UserAggregator;

public class FileUserDao implements UserDao {

	File userFile = new File("/src/sources/user.txt");

	@Override
	public boolean autorization(String login, String password) throws DaoException, IOException {

		FileReader fileReader;
		boolean checkAutorizationFlag = false;
		Logic check = new Logic();
		try {

			fileReader = new FileReader(System.getProperty("user.dir") + userFile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;

			while (((line = reader.readLine()) != null) && (!checkAutorizationFlag)) {
				checkAutorizationFlag = check.checkAutorization(line, login, password);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} finally {

		}

		return checkAutorizationFlag;

	}

}
