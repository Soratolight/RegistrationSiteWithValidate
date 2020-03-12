package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AccountDTO;
import model.SignUpLogic;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//入力された郵便番号で住所を自動入力
		if(request.getParameter("zipConvert"))

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
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String checkPassword = request.getParameter("checkPassword");
		String mailAddress = request.getParameter("mailAddress");

		//リクエストパラメータで受け取ったString型変数をparseIntでint型に変換する
		Integer dob_year = Integer.parseInt(dob_yearString);
		Integer dob_month = Integer.parseInt(dob_monthString);
		Integer dob_date = Integer.parseInt(dob_dateString);
		Integer zipcode = Integer.parseInt(zipcodeString);
		Integer phoneNumber = Integer.parseInt(phoneNumberString);

		//変数に格納した値をAccount型のaccountに代入
		AccountDTO account = new AccountDTO(sei, mei, dob_year, dob_month, dob_date, gender, zipcode, streetAddress,
				streetAddress2, phoneNumber, userId, password, mailAddress);
		SignUpLogic logic = new SignUpLogic();

		//ここからフォームに入力されているかどうかのチェック
		if (sei == null || sei.length() > 10) {
			request.setAttribute("errorMsg", "姓が入力されていないか、条件を満たしていません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		} else if (mei == null || mei.length() > 10) {
			request.setAttribute("errorMsg", "名が入力されていないか、条件を満たしていません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		} else if (dob_year == null || dob_month == null || dob_date == null) {
			request.setAttribute("errorMsg", "生年月日が選択されていません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		} else if (gender == null) {
			request.setAttribute("errorMsg", "性別が選択されていません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		} else if (zipcode == null || zipcode > 8 && zipcode < 6) {
			request.setAttribute("errorMsg", "郵便番号が入力されていないか、条件を満たしていません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		} else if (streetAddress == null || streetAddress.length() > 25 || streetAddress2 == null
				|| streetAddress2.length() > 25) {
			request.setAttribute("errorMsg", "住所が入力されていないか、条件を満たしていません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		} else if (phoneNumber == null || phoneNumber > 0) {
			request.setAttribute("errorMsg", "電話番号が入力されていないか、条件を満たしていません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		} else if (userId == null || userId.length() > 10) {
			request.setAttribute("errorMsg", "ユーザIDが入力されていないか、条件を満たしていません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		} else if (password == null || password.length() > 10) {
			request.setAttribute("errorMsg", "パスワードが入力されていないか、条件を満たしていません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		} else if (mailAddress == null) {
			request.setAttribute("errorMsg", "メールアドレスが入力されていないか、条件を満たしていません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		} else if (password.equals(checkPassword)) {
			//最後にpasswordとcheckpasswordの値が等値なのか判定してTrueであればデータベースへ
			logic.execute(account);
			//ユーザ情報をセッションスコープに保存
			HttpSession session = request.getSession();
			session.setAttribute("newAccount", account);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUpSuccessful.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("errorMsg", "原因不明のエラーが発生しました");
			//SignUp.jspにフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUp.jsp");
			dispatcher.forward(request, response);
		}
	}
}
