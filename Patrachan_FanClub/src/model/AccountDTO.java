package model;

import java.io.Serializable;

public class AccountDTO implements Serializable {

	private String sei; //姓
	private String mei; //名
	private int dob_year; //生まれ年
	private int dob_month; //月
	private int dob_date; //日
	private String gender; //性別
	private int zipcode; //郵便番号
	private String streetAddress; //住所
	private String streetAddress2; //住所2
	private int phoneNumber; //電話番号
	private String userId; //ユーザID
	private String password; //パスワード
	private String mailAddress; //メールアドレス

	public AccountDTO() {
	}

	public AccountDTO(String sei, String mei, int dob_year, int dob_month, int dob_date, String gender, int zipcode,
			String streetAddress, String streetAddress2, int phoneNumber,
			String userId,
			String password, String mailAddress) {
		this.sei = sei;
		this.mei = mei;
		this.dob_year = dob_year;
		this.dob_month = dob_month;
		this.dob_date = dob_date;
		this.gender = gender;
		this.zipcode = zipcode;
		this.streetAddress = streetAddress;
		this.streetAddress2 = streetAddress2;
		this.phoneNumber = phoneNumber;
		this.userId = userId;
		this.password = password;
		this.mailAddress = mailAddress;
	}

	public String getSei() {
		return sei;
	}

	public void setSei(String sei) {
		this.sei = sei;
	}

	public String getMei() {
		return mei;
	}

	public void setMei(String mei) {
		this.mei = mei;
	}

	public int getDob_year() {
		return dob_year;
	}

	public void setDob_year(int dob_year) {
		this.dob_year = dob_year;
	}

	public int getDob_month() {
		return dob_month;
	}

	public void setDob_month(int dob_month) {
		this.dob_month = dob_month;
	}

	public int getDob_date() {
		return dob_date;
	}

	public void setDob_date(int dob_date) {
		this.dob_date = dob_date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
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
