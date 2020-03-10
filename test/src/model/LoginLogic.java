package model;

import dao.EmployeeAccountDAO;

public class LoginLogic {

	public boolean execute(Login login) {
		EmployeeAccountDAO dao = new EmployeeAccountDAO();
		EmployeeAccount employeeAccount = dao.findByLogin(login);
		return employeeAccount != null;
	}
}

}