package model;

import java.io.Serializable;

public class Account implements Serializable {

	private String name; //名前
	private String kana; //フリガナ
	private int zipcode; //郵便番号
	private String streetAddress; //住所
	private String streetAddress2; //住所2
	private int phoneNumber; //電話番号
	private String userId; //ユーザID
	private String password; //パスワード
	private String checkPassword; //確認用パスワード
	private String mailAddress; //メールアドレス

	public Account() {
	}

	public Account(String name, String kana, int zipcode, String streetAddress, String streetAddress2, int phoneNumber,
			String userId,
			String password, String checkPassword, String mailAddress) {
		this.name = name;
		this.kana = kana;
		this.zipcode = zipcode;
		this.streetAddress = streetAddress;
		this.streetAddress2 = streetAddress2;
		this.phoneNumber = phoneNumber;
		this.userId = userId;
		this.password = password;
		this.checkPassword = checkPassword;
		this.mailAddress = mailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKana() {
		return kana;
	}

	public void setKana(String kana) {
		this.kana = kana;
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

	public String getCheckPassword() {
		return checkPassword;
	}

	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
}
