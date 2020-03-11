package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AccountDTO;
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/SignUp.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//リクエストパラメータで入力された値を取得
		request.setCharacterEncoding("UTF-8");

		String sei = request.getParameter("sei");
		String mei = request.getParameter("mei");
		String dob_yearString = request.getParameter("dob_year");
		String dob_monthString = request.getParameter("dob_month");
		String dob_dateString = request.getParameter("dob_date");
		String gender = request.getParameter("gender");
		String zipcodeString = request.getParameter("zipcode");
		String streetAddress = request.getParameter("streetAddress");
		String streetAddress2 = request.getParameter("streetAddress2");
		String phoneNumberString = request.getParameter("phoneNumber");
		String mailAddress = request.getParameter("mailAddress");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String checkPassword = request.getParameter("checkPassword");

		//リクエストパラメータで受け取ったString型変数をparseIntでint型に変換する
		Integer dob_year = Integer.parseInt(dob_yearString);
		Integer dob_month = Integer.parseInt(dob_monthString);
		Integer dob_date = Integer.parseInt(dob_dateString);
		Integer zipcode = Integer.parseInt(zipcodeString);
		Integer phoneNumber = Integer.parseInt(phoneNumberString);

		//変数に格納した値をAccount型のaccountに代入
		AccountDTO account = new AccountDTO(sei, mei, dob_year, dob_month, dob_date, gender, zipcode, streetAddress, streetAddress2, phoneNumber, userId, password, mailAddress);

		//入力されたパスワードと確認用パスワードがあっているかどうか
		if(password.equals(checkPassword)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUpSuccessful.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("/Patrachan_FanClub/SignUp");
		}
	}
}
