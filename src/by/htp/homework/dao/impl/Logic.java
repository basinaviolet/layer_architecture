package by.htp.homework.dao.impl;

import java.util.Map;

import by.htp.homework.entity.User;

public class Logic {
	
	private static final String SPACE = "\\s+";
	private static final String EQUAL = "=";
//	private static final String TYPE = ":";
	private static final String END_PARAMS = ",";
	
	public boolean checkAutorization(String line, String login, String password) {

		boolean check = false;
		String[] userDataPair = lineToArray(line);
		if ((userDataPair[0] != null) && (userDataPair[1] != null)) {
			if (userDataPair[0].equals(login) && userDataPair[1].equals(password)) {
				check = true;
			}
		}
		return check;
	}

	public boolean checkAutorization(User item, String login, String password) {

		boolean check = false;

		if (item.getLogin().equals(login) && item.getPassword().equals(password)) {
			check = true;
		}
		return check;
	}

	public String[] lineToArray(String line) {

		String[] newDataPair = new String[2];
		newDataPair = line.split(SPACE);

		return newDataPair;
	}
	
	public boolean checkParams(String line, Map<String, String> params) {
		
		boolean check = true;
		String item;
		
		for (Map.Entry<String, String> entry : params.entrySet()) {
			item = entry.toString();
			if(!line.contains(item)) {
				check = false;
			}
		}
		
		return check;
	}
	
	public void lineToMap(Map<String, String> newApplianceParams, String line) {
	//	line
		String[] lineItem = line.trim().split(SPACE);
		String[] item;
		for (int i = 2; i < lineItem.length; i++) {
			if(lineItem[i].endsWith(END_PARAMS)) {
				lineItem[i] = lineItem[i].substring(0,lineItem[i].length()-2);
			};
			item = lineItem[i].split(EQUAL);
		newApplianceParams.put(item[0], item[1]);
		}
	}
}
