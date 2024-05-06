<html>
<head>
<title>Simple Web Application</title>

<link href="/resources/theme/css/main.css" rel="stylesheet" />
<script src="/resources/theme/js/jquery-3.7.1.min.js"></script>
</head>
<body>
	<div>
		<h1>Welcome to Spring Boot Login Page</h1>
		<h2>Login To Proceed</h2>
		<p color="red">${errorMessage}</p>
		<form id="validate" action="/validate" method="POST">
			<div>
				User Name: <input type="text" name="username" />
			</div>
			<br /> <br />
			<div>
				Password: <input type="password" name="password" />
			</div>
			<br /> <br /> <input type="submit"/>
		</form>
	</div>
	<script src="/resources/theme/js/main.js"></script>
</body>
</html>