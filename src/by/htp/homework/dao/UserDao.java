package by.htp.homework.dao;

import java.io.IOException;

public interface UserDao {
	
	boolean autorization (String login, String password) throws DaoException, IOException;
}
