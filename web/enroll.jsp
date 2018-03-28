<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원가입 페이지</h2><br>
<form action="<%=request.getContextPath()%>/insert" method="post">
아이디:<input type="text" name="id" required><br>
비밀번호:<input type="password" name="pw" required><br>
이름:<input type="text" name="name" required><br>
<input type="submit" value="회원가입">
<input type="reset" value="초기화">
</form>
</body>
</html>