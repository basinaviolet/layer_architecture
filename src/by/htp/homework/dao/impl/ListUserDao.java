package by.htp.homework.dao.impl;

import java.util.List;
import by.htp.homework.dao.UserDao;
import by.htp.homework.entity.User;
import by.htp.homework.entity.UserAggregator;

public class ListUserDao implements UserDao {

	@Override
	public boolean autorization (String login, String password) {
		
		UserAggregator userInformation = new UserAggregator();
		List<User> userAutorizationList = userInformation.userAutorizationList;
		boolean checkAutorizationFlag = false;
		Logic check = new Logic();

		for (User item : userAutorizationList) {
			checkAutorizationFlag = check.checkAutorization(item, login, password);
			if (checkAutorizationFlag) {
				userAutorizationList.add(new User(login, password));
				break;
			}
		}

		return checkAutorizationFlag;
	}

}
