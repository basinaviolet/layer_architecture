package by.htp.homework.controller;

import java.io.IOException;

import by.htp.homework.controller.command.Command;
import by.htp.homework.controller.command.CommandProvider;
import by.htp.homework.dao.DaoException;

/*import by.htp.homework.entity.Appliance;
import by.htp.homework.service.ServiceProvider;
import by.htp.homework.service.ApplianceService;
import by.htp.homework.service.ServiceException;
import by.htp.homework.service.UserService;
*/
public class Controller {

	private final CommandProvider provider = new CommandProvider();

	// команда переменная=значение переменная=значение
	public String doAction(String request) throws IOException, DaoException { // "logination login=123 password=123"

		String response = "";
		String commandName = request.split("\\s+", 2)[0];
		try {
			Command command = provider.takeCommand(commandName);
			response = command.execute(request);
		} catch (Exception e) {

		}
		return response;
	}
}
