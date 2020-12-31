package by.htp.homework.main;

import java.io.IOException;

import by.htp.homework.controller.Controller;
import by.htp.homework.dao.DaoException;

public class Main {
public static void main(String[] args) throws IOException, DaoException {
	
	String request;
	String response;
	Controller controller= new Controller();
	
	request = "logination login=Name1_20 password=NaMe1_mail";
//	logination login=NameVioletta password=ViolettaBasina@1234
	response = controller.doAction(request);
	System.out.println("logination: " + response);
	
	request = "find TabletPC : BATTERY_CAPACITY=3 DISPLAY_INCHES=14 MEMORY_ROM=8000 FLASH_MEMORY_CAPACITY=2 COLOR=blue";
	response = controller.doAction(request);
	System.out.println("find: " + response);
	
}
}
