<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>teste</title>
</head>
<body>
<h1>testEnCryptionProject : 암호화 테스트 프로젝트</h1>
<h3>context root 명 : <%= request.getContextPath() %></h3>
<form action="<%= request.getContextPath() %>/login.me" method="post">
아이디 : <input type="text" name="userid" required> <br>
암 호 : <input type="password" name="userpwd" required> <br>
<input type="submit" value="로그인">
</form>
<h3><a href="views/member/memberEnroll.jsp">회원가입</a></h3>
</body>
</html>