package by.htp.homework.controller.command.imp;

import java.io.IOException;

import by.htp.homework.controller.command.Command;
import by.htp.homework.service.ServiceException;
import by.htp.homework.service.ServiceProvider;
import by.htp.homework.service.UserService;

public class LoginationCommand implements Command {

	@Override
	public String execute(String request) throws IOException {

		String[] params = request.split("\\s+");
		ServiceProvider provider = ServiceProvider.getInstance();
		String response;

		UserService userService = provider.getUserService();
		String login = params[1].split("=")[1];
		String password = params[2].split("=")[1];

		try {
			if(userService.logination(login, password)) {
			response = "authorization is successful";
			}
			else {
				response = "username or password are incorrect";
			}
		} catch (ServiceException e) {
			response = "the data is incorrect";
		}
		return response;
	}
}
