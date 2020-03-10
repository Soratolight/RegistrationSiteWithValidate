<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style2.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- StyleSheet -->


<title>Patrachan_FanClub</title>
</head>
<body>
	<section class="section-divider divider1"></section>
	<!-- コンテナ -->
	<div class="container">
		<h1>会員登録画面だよ</h1>
		<!-- ここからform -->
		<form>
			<!-- 名前 -->
			<div class="form-group">
				<label for="name">氏名</label> <input type="text" class="form-control"
					id="formGroupExampleInput" placeholder="大阪太郎">
			</div>
			<div class="form-group">
				<label for="furigana">フリガナ</label> <input type="text"
					class="form-control" id="formGroupExampleInput2"
					placeholder="オオサカタロウ">
			</div>
			<!-- 郵便番号 -->
			<label for="name">郵便番号</label>
			<div class="input-group">
				<input type="text" class="form-control"
					placeholder="002-8282" aria-label="" aria-describedby="basic-addon1">
				<div class="input-group-append">
					<button class="btn btn-success" type="button">郵便番号から住所を自動入力</button>
				</div>
			</div>
			<!-- 住所 -->
			<div class="form-group">
				<label for="name">住所</label> <input type="text" class="form-control"
					id="formGroupExampleInput" placeholder="大阪府大阪市浪速区">
			</div>
			<!-- 住所２ -->
			<div class="form-group">
				<label for="name">住所２</label> <input type="text"
					class="form-control" id="formGroupExampleInput"
					placeholder="〇〇マンション101号室">
			</div>
			<!-- 電話番号 -->
			<div class="form-group">
				<label for="furigana">電話番号</label> <input type="text"
					class="form-control" id="formGroupExampleInput2"
					placeholder="090-1234-5678">
			</div>
			<!-- メールアドレス -->
			<div class="form-group">
				<label for="mailAddres">メールアドレス</label> <input type="text"
					class="form-control" id="eMailAddress"
					placeholder="example@example.com">
			</div>
			<!-- userID -->
			<div class="form-group">
				<label for="name">ユーザーID</label> <input type="text"
					class="form-control" id="formGroupExampleInput"
					placeholder="SuouPatraGachiKoiZei">
			</div>
			<!-- password -->
			<div class="form-group">
				<label for="password">パスワード</label> <input type="password"
					class="form-control" id="password">
			</div>
			<div class="form-group">
				<label for="checkPasword">確認用パスワード</label> <input type="text"
					class="form-control" id="checkPassword">
			</div>

			<div class="form-check mb-2 mr-sm-2">
				<input class="form-check-input" type="checkbox" id="inlineFormCheck">
				<label class="form-check-label" for="inlineFormCheck">
					継続してログイン（工事中） </label>
			</div>
			<button type="submit" class="btn btn-primary mb-2">登録</button>
			<!-- flexwrap -->
		</form>
		<!-- コンテナ -->
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>