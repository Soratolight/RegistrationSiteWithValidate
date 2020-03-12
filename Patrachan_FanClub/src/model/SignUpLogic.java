package model;

import dao.SignUpDAO;

public class SignUpLogic {

	public void execute(AccountDTO account) {
		SignUpDAO dao = new SignUpDAO();
		dao.SignUpAccount(account);
	}
}
