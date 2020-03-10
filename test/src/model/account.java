package model;

import java.io.Serializable;

public class account implements Serializable {
	String employeeId;
	String employeePassword;
	String employeeName;
	String employeePosition;
	int authority;

	public EmployeeAccount() {}
	public EmployeeAccount(String employeeId,String employeePassword,String employeeName, String employeePosition, int authority) {
		this.employeeId = employeeId;
		this.employeePassword = employeePassword;
		this.employeeName = employeeName;
		this.employeePosition = employeePosition;
		this.authority = authority;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public int getAuthority() {
		return authority;
	}
}
