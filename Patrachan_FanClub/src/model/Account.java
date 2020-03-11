package model;

public class Account {

	private String userId;
	private String password;
	private String mailAddress;

	public Account(String userId, String password, String mailAddress) {
		this.userId = userId;
		this.password = password;
		this.mailAddress = mailAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
}
