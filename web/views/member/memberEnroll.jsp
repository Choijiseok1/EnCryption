<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberEnroll</title>
</head>
<body>
<h2>회원가입페이지</h2>
<br>
<form action="<%= request.getContextPath() %>/minsert.me" method="post">
아이디 : <input type="text" name="userid" required> <br>
암 호 : <input type="password" name="userpwd" required> <br>
이 름 : <input type="text" name="username" required> <br>
<input type="submit" value="가입하기">
</form>
<br>
</body>
</html>