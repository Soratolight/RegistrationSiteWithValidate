package model;

import dao.SignUpDAO;

public class SignUpLogic {

	public void execute(AccountDTO account) {
		SignUpDAO dao = new SignUpDAO();
		AccountDTO accountDTO = dao.SignUpAccount(account);
	}
}
