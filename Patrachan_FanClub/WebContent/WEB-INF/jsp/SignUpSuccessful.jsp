<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.AccountDTO" %>
<%
AccountDTO newAccount = (AccountDTO) session.getAttribute("newAccount");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patrachan_FanClub</title>
</head>
<body>
	<h1><%= newAccount.getUserId() %>さん会員登録ありがとう</h1>
	<a href="/Patrachan_FanClub/TopPage">トップページへ戻る</a>
</body>
</html>