package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String name = request.getParameter("name");
		String kana = request.getParameter("kana");
		String zipcode = request.getParameter("zipcode");
		String streetAddress = request.getParameter("streetAddress");
		String streetAddress2 = request.getParameter("streetAddress2");
		String phoneNumber = request.getParameter("phoneNumber");
		String mailAddress = request.getParameter("mailAddress");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String checkPassword = request.getParameter("checkPassword");

		//入力されたパスワードと確認用パスワードがあっているかどうか
		if(password.equals(checkPassword)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/SignUpSuccessful.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("/Patrachan_FanClub/SignUp");
		}
	}
}
