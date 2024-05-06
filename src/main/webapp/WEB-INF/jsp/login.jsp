<html>
<head>
<title>Simple Web Application</title>
</head>
<body>
	<div>
		<h1>Welcome to Spring Boot Login Page</h1>

		<h2>Login To Proceed</h2>
		<p color="red">${errorMessage}</p>
		<form method="post">
			<div>User Name: <input type="text" name="name" /></div><br/><br/>
			<div>Password: <input type="password" name="password" /></div><br/><br/>
			<input type="submit" />
		</form>
	</div>
</body>
</html>