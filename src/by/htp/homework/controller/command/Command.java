package by.htp.homework.controller.command;

import java.io.IOException;

import by.htp.homework.dao.DaoException;

public interface Command {

	String execute(String request) throws IOException, DaoException;
	
}
