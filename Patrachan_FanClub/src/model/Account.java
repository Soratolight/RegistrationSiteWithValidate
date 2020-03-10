package model;

import java.io.Serializable;

public class Account implements Serializable {

	private String name; //名前
	private String kana; //フリガナ
	private String streetAddress; //住所
	private String streetAddress2; //住所2
	private int phoneNumber; //電話番号
	private String id; //ユーザID
	private String password; //パスワード
	private String checkPassword; //確認用パスワード
	private String mailaddress; //メールアドレス

	public Account() {
	}

	public Account(String name, String kana, String streetAddress, String streetAddress2, int phoneNumber, String id,
			String password, String checkPassword, String mailAddress) {
		this.name = name;
		this.kana = kana;
		this.streetAddress = streetAddress;
		this.streetAddress2 = streetAddress2;
		this.phoneNumber = phoneNumber;
		this.id = id;
		this.password = password;
		this.checkPassword = checkPassword;
		this.mailaddress = mailAddress;
	}

	public String getName() {
		return name;
	}

	public String getKana() {
		return kana;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getCheckPassword() {
		return checkPassword;
	}

	public String getMailaddress() {
		return mailaddress;
	}
}
