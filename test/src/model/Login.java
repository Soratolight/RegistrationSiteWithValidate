package model;

public class Login {
	private String employeeId;
	private String employeePassword;
	private String authority;

	//コンストラクタ
	public Login(String employeeId, String employeePassword, String authority) {
		this.employeeId = employeeId;
		this.employeePassword = employeePassword;
		this.authority = authority;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public String getAuthority() {
		return authority;
	}

}