<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST">
		<div>
			<label>USER NAME</label>
			<input name="username"/>
		</div>
		<div>
			<label>PASSWORD</label>
			<input type="password" name="password"/>
		</div>
		<div>
			<button>로그인</button>
		</div>
	</form>
	<p>${USERNAME}, ${PASSWORD}
	
</body>
</html>