<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String errorMsg = (String) request.getAttribute("errorMsg");
%>
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
		<form action="/Patrachan_FanClub/SignUp" method="post">
			<!-- 名前 -->
			<div class="form-group">
				<label for="name">姓</label> <input type="text" class="form-control"
					id="name" placeholder="周防" name="sei" required>
			</div>
			<div class="form-group">
				<label for="kana">名</label> <input type="text" class="form-control"
					id="name" placeholder="パトラ" name="mei" required>
			</div>
			<div class="d-flex text-white">
				<div class="p-2 flex-fill">
					<select class="custom-select" name="dob_year" required>
						<option value="">年</option>
						<option value="2020">2020年</option>
						<option value="2019">2019年</option>
						<option value="2018">2018年</option>
						<option value="2017">2017年</option>
						<option value="2016">2016年</option>
						<option value="2015">2015年</option>
						<option value="2014">2014年</option>
						<option value="2013">2013年</option>
						<option value="2012">2012年</option>
						<option value="2011">2011年</option>
						<option value="2010">2010年</option>
						<option value="2009">2009年</option>
						<option value="2008">2008年</option>
						<option value="2007">2007年</option>
						<option value="2006">2006年</option>
						<option value="2005">2005年</option>
						<option value="2004">2004年</option>
						<option value="2003">2003年</option>
						<option value="2002">2002年</option>
						<option value="2001">2001年</option>
						<option value="2000">2000年</option>
						<option value="1999">1999年</option>
						<option value="1998">1998年</option>
						<option value="1997">1997年</option>
						<option value="1996">1996年</option>
						<option value="1995">1995年</option>
						<option value="1994">1994年</option>
						<option value="1993">1993年</option>
						<option value="1992">1992年</option>
						<option value="1991">1991年</option>
						<option value="1990">1990年</option>
						<option value="1989">1989年</option>
						<option value="1988">1988年</option>
						<option value="1987">1987年</option>
						<option value="1986">1986年</option>
						<option value="1985">1985年</option>
						<option value="1984">1984年</option>
						<option value="1983">1983年</option>
						<option value="1982">1982年</option>
						<option value="1981">1981年</option>
						<option value="1980">1980年</option>
						<option value="1979">1979年</option>
						<option value="1978">1978年</option>
						<option value="1977">1977年</option>
						<option value="1976">1976年</option>
						<option value="1975">1975年</option>
						<option value="1974">1974年</option>
						<option value="1973">1973年</option>
						<option value="1972">1972年</option>
						<option value="1971">1971年</option>
						<option value="1970">1970年</option>
						<option value="1969">1969年</option>
						<option value="1968">1968年</option>
						<option value="1967">1967年</option>
						<option value="1966">1966年</option>
						<option value="1965">1965年</option>
						<option value="1964">1964年</option>
						<option value="1963">1963年</option>
						<option value="1962">1962年</option>
						<option value="1961">1961年</option>
						<option value="1960">1960年</option>
						<option value="1959">1959年</option>
						<option value="1958">1958年</option>
						<option value="1957">1957年</option>
						<option value="1956">1956年</option>
						<option value="1955">1955年</option>
						<option value="1954">1954年</option>
						<option value="1953">1953年</option>
						<option value="1952">1952年</option>
						<option value="1951">1951年</option>
						<option value="1950">1950年</option>
						<option value="1949">1949年</option>
						<option value="1948">1948年</option>
						<option value="1947">1947年</option>
						<option value="1946">1946年</option>
						<option value="1945">1945年</option>
						<option value="1944">1944年</option>
						<option value="1943">1943年</option>
						<option value="1942">1942年</option>
						<option value="1941">1941年</option>
						<option value="1940">1940年</option>
						<option value="1939">1939年</option>
						<option value="1938">1938年</option>
						<option value="1937">1937年</option>
						<option value="1936">1936年</option>
						<option value="1935">1935年</option>
						<option value="1934">1934年</option>
						<option value="1933">1933年</option>
						<option value="1932">1932年</option>
						<option value="1931">1931年</option>
						<option value="1930">1930年</option>
						<option value="1929">1929年</option>
						<option value="1928">1928年</option>
						<option value="1927">1927年</option>
						<option value="1926">1926年</option>
						<option value="1925">1925年</option>
						<option value="1924">1924年</option>
						<option value="1923">1923年</option>
						<option value="1922">1922年</option>
						<option value="1921">1921年</option>
						<option value="1917">1917年</option>
						<option value="1920">1920年</option>
						<option value="1919">1919年</option>
						<option value="1918">1918年</option>
					</select>
				</div>
				<div class="p-2 flex-fill">
					<select class="custom-select" name="dob_month" required>
						<option value="">月</option>
						<option value="1">1月</option>
						<option value="2">2月</option>
						<option value="3">3月</option>
						<option value="4">4月</option>
						<option value="5">5月</option>
						<option value="6">6月</option>
						<option value="7">7月</option>
						<option value="8">8月</option>
						<option value="9">9月</option>
						<option value="10">10月</option>
						<option value="11">11月</option>
						<option value="12">12月</option>
					</select>
				</div>
				<div class="p-2 flex-fill">
					<select class="custom-select" name="dob_date" required>
						<option value="">日</option>
						<option value="1">1日</option>
						<option value="2">2日</option>
						<option value="3">3日</option>
						<option value="4">4日</option>
						<option value="5">5日</option>
						<option value="6">6日</option>
						<option value="7">7日</option>
						<option value="8">8日</option>
						<option value="9">9日</option>
						<option value="10">10日</option>
						<option value="11">11日</option>
						<option value="12">12日</option>
						<option value="13">13日</option>
						<option value="14">14日</option>
						<option value="15">15日</option>
						<option value="16">16日</option>
						<option value="17">17日</option>
						<option value="18">18日</option>
						<option value="19">19日</option>
						<option value="20">20日</option>
						<option value="21">21日</option>
						<option value="22">22日</option>
						<option value="23">23日</option>
						<option value="24">24日</option>
						<option value="25">25日</option>
						<option value="26">26日</option>
						<option value="27">27日</option>
						<option value="28">28日</option>
						<option value="29">29日</option>
						<option value="30">30日</option>
						<option value="31">31日</option>
					</select>
				</div>
				<div class="p-2 flex-fill">
					<select class="custom-select" name="gender" required>
						<option value="">性別</option>
						<option value="男">男</option>
						<option value="女">女</option>
					</select>
				</div>
			</div>
			<!-- 郵便番号 -->
			<label for="zipcode">郵便番号</label>
			<div class="input-group">
				<input type="text" class="form-control" placeholder="0028282"
					aria-label="" aria-describedby="basic-addon1" id="zipcode"
					name="zipcode" required>
				<div class="input-group-append">
					<button class="btn btn-success" type="button" id="zipConvert" name="zipConvert">郵便番号から住所を自動入力</button>
				</div>
			</div>
			<br>
			<!-- 住所 -->
			<div class="form-group">
				<label for="streetAddress">住所</label> <input type="text"
					class="form-control" id="streetAddress" placeholder="東京都北区赤羽"
					name="streetAddress" required>
			</div>
			<!-- 住所２ -->
			<div class="form-group">
				<label for="streetAddress2">住所２</label> <input type="text"
					class="form-control" id="streetAddress" placeholder="喫茶店ハニーストラップ"
					name="streetAddress2" required>
			</div>
			<!-- 電話番号 -->
			<div class="form-group">
				<label for="phoneNumber">電話番号</label> <input type="text"
					class="form-control" id="phoneNumber" placeholder="09012345678"
					name="phoneNumber" required>
			</div>
			<!-- メールアドレス -->
			<div class="form-group">
				<label for="mailAddres">メールアドレス</label> <input type="email"
					class="form-control" id="mailAddress"
					placeholder="example@example.com" name="mailAddress" required>
			</div>
			<!-- userID -->
			<div class="form-group">
				<label for="userId">ユーザーID</label> <input type="text"
					class="form-control" id="userId" placeholder="PatraChan"
					name="userId" required>
			</div>
			<!-- password -->
			<div class="form-group">
				<label for="password">パスワード</label> <input type="password"
					class="form-control" id="password" name="password" required>
			</div>
			<div class="form-group">
				<label for="checkPasword">確認用パスワード</label> <input type="password"
					class="form-control" id="checkPassword" name="checkPassword"
					oninput="CheckPassword(this)" required>
			</div>

			<div class="form-check mb-2 mr-sm-2">
				<input class="form-check-input" type="checkbox" id="inlineFormCheck">
				<label class="form-check-label" for="inlineFormCheck">
					継続してログイン（現在利用不可） </label>
			</div>
			<button type="submit" class="btn btn-primary mb-2">登録</button>
			<!-- flexwrap -->
		</form>
		<!-- error msg -->
		<%
			if (errorMsg != null) {
		%>
		<div class="message-window">
			<div class="message-area">
				<div class="content">
					<div class="arrow-white"></div>
					<div class="arrow-black"></div>
					<div class="background-white"></div>
					<div class="background-black"></div>
					<div class="text-area">
						<div><%=errorMsg%></div>

					</div>
				</div>
			</div>
		</div>
		<%
			}
		%>
		<!-- コンテナ -->
	</div>

	<!-- Optional JavaScript -->
	<script>
		function CheckPassword(checkPassword) {
			// 入力値取得
			var input1 = password.value;
			var input2 = checkPassword.value;
			// パスワード比較
			if (input1 != input2) {
				confirm.setCustomValidity("入力値が一致しません。");
			} else {
				confirm.setCustomValidity('');
			}
		}
	</script>
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