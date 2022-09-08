<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
</head>
<body>
	<div align="center">
		<h1>회원정보 수정</h1>
		<form action="edit" method="post">
			<input type="hidden" name="memberId" value="${dto.memberId}">
			<input type="text" name="memberPw" value="${dto.memberPw}"><br><br>
			<input type="text" name="memberNick" value="${dto.memberNick}"><br><br>
			<input type="text" name="memberTel" value="${dto.memberTel}"><br><br>
			<input type="text" name="memberEmail" value="${dto.memberEmail}"><br><br>
			<input type="text" name="memberPost" value="${dto.memberPost}"><br><br>
			<input type="text" name="memberBaseAddress" value="${dto.memberBaseAddress}"><br><br>
			<input type="text" name="memberDetailAddress" value="${dto.memberDetailAddress}"><br><br>
			<input type="text" name="memberGrade" value="${dto.memberGrade}"><br><br>
			<button type="submit">수정하기</button>
		</form>
	</div>
</body>
</html>