package by.htp.homework.controller.command.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.htp.homework.controller.command.Command;
import by.htp.homework.dao.DaoException;
import by.htp.homework.entity.Appliance;
import by.htp.homework.service.ApplianceService;
import by.htp.homework.service.ServiceException;
import by.htp.homework.service.ServiceProvider;

public class FindApplianceCommand implements Command {

	@Override
	public String execute(String request) throws DaoException {

		ServiceProvider provider = ServiceProvider.getInstance();
		String response = "";

		ApplianceService applService = provider.getApplianceService();
		Map<String, String> paramsForSearch = new HashMap<String, String>();
		List<Appliance> findResult;
		String applType;

		String[] params = request.split("\\s+");
		applType = params[1];

		for (int i = 3; i <= params.length - 1; i++) {
			paramsForSearch.put(params[i].split("=")[0], params[i].split("=")[1]);
		}

		try {
			findResult = applService.findAppliance(applType, paramsForSearch);
			if (findResult.isEmpty()) {
				response = "appliance didn`t found";
			} else {
				response = findResult.toString();
			}
		} catch (ServiceException e) {
			response = "appliance didn`t found";
		}
		return response;
	}
}
