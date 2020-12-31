package by.htp.homework.service;

import by.htp.homework.service.impl.ApplianceServiceImpl;
import by.htp.homework.service.impl.UserServiceImpl;

public class ServiceProvider {
	
public static final ServiceProvider instance =  new ServiceProvider();

private ServiceProvider() {}

private final UserService userService = new UserServiceImpl();
private final ApplianceService applianceService = new ApplianceServiceImpl();

public static ServiceProvider getInstance() {
	return instance;
}

public UserService getUserService() {
	return userService;
}

public ApplianceService getApplianceService() {
	return applianceService;
}


}
