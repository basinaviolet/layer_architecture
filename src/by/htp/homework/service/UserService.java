package by.htp.homework.service;

import java.io.IOException;

public interface UserService {
	boolean logination (String login, String password) throws ServiceException, IOException;
}
