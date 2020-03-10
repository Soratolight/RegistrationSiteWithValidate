package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Login;
import model.LoginLogic;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//フォワード
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String employeeId = request.getParameter("employeeId");
		String employeePassword = request.getParameter("employeePassword");
		String authority = request.getParameter("authority");

		//ログイン処理の実行
		Login login = new Login(employeeId, employeePassword, authority);
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);
		//ここから権限認証
		//		AuthLogic bo2 = new AuthLogic();
		//		boolean auth = bo2.execute(login);

		//ログイン処理の成否によって処理を分岐
		if (result) { //ログイン成功時
			//セッションスコープにemployeeIdを保存
			HttpSession session = request.getSession();
			session.setAttribute("employeeId", employeeId);

			//権限分け
			if (login.getAuthority().equals("999")) {
				RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/loginSuccessfulAdmin.jsp");
				d.forward(request, response);
			} else if(login.getAuthority().isEmpty()) {
				//フォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/loginSuccessful.jsp");
				dispatcher.forward(request, response);
				//			if(auth == true) {
				//				//フォワード
				//				RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/loginSuccessfulAdmin.jsp");
				//				d.forward(request, response);
				//			}
			}
		} else {
			//リダイレクト
			response.sendRedirect("/eggs/LoginServlet");
		}
	}
}
