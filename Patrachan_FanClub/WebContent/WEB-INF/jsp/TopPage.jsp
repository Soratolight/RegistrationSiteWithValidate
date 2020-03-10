<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PatraChan_FanClub</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">
<!-- StyleSheet -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/reset.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
<!-- Script -->

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

<script>
	$(document).ready(function() {
		$('.slider').bxSlider({
			auto : true,
		});
	});
</script>

</head>
<body>
	<div class="wrapper">

		<!-- menu bar -->
		<nav class="nav_on">
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#about">Photo</a></li>
				<li><a href="#hobby">Signin</a></li>
				<li><a href="/Patrachan_FanClub/SignUp">SignUp</a></li>
				<li><a href="#contact">Contact</a></li>
			</ul>
		</nav>

		<div class="section_wrap">
			<div id="home" class="section">
				<h2 class="section_title">このサイトは現在制作中です</h2>
				<h2 class="section_title">周防パトラファンクラブへようこそ</h2>
				<div class="slider">
					<div>
						<img src="resources/SliderImages/ptrchan1.png">
					</div>
					<div>
						<img src="resources/SliderImages/ptrchan2.png">
					</div>
					<div>
						<img src="resources/SliderImages/ptrchan3.png">
					</div>
					<div>
						<img src="resources/SliderImages/ptrchan4.png">
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<!-- Scripts -->
	<script>
		$(function() {
			$('a[href^="#"]').on('click', function() {
				var speed = 1000;
				var href = $(this).attr("href");
				var target = $(href == "#" || href == "" ? 'html' : href);
				var position = target.offset().top;
				$("html, body").animate({
					scrollTop : position
				}, speed, "swing");
				return false;
			});
		});
	</script>
</body>
</html>