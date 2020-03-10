<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>eggs</title>
</head>
<body>

	<form action="/eggs/LoginServlet" method="post">
	 	<div class="form-group">
	    	<label for="formGroupId">ユーザーID</label>
	    	<input type="text" name="employeeId" class="form-control" id="employeeId" placeholder="ユーザーID">
	  	</div>
	  	<div class="form-group">
	    	<label for="formGroupPassword">パスワード</label>
	    	<input type="password" name="employeePassword" class="form-control" id="employeePassword" placeholder="パスワード">
	 	</div>
		<div class="form-group">
	    	<label for="formAuthKey">管理者キー</label>
	    	<input type="password" name="authority" class="form-control" id="authority" placeholder="管理者キー">
	 	</div>
  	<div class="form-group">
  		<button type="submit" class="btn btn-primary">ログイン</button>
    </div>

	</form>


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
