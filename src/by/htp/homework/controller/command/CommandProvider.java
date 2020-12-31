package by.htp.homework.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.homework.controller.command.imp.AddNewApplianceCommand;
import by.htp.homework.controller.command.imp.FindApplianceCommand;
import by.htp.homework.controller.command.imp.LoginationCommand;

public class CommandProvider {

	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("logination", new LoginationCommand());
		commands.put("find", new FindApplianceCommand());
		commands.put("add", new AddNewApplianceCommand());
	}
	
	public Command takeCommand(String commandName) {
		return commands.get(commandName);
	}
}
