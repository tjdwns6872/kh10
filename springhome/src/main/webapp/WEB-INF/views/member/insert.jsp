<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<h1>회원 정보 입력</h1>
	<form action="insert" method="post">
		*아이디 <input name="memberId" type="text" required> <br><br>
		*비밀번호 <input name="memberPw" type="password" required> <br><br>
		*닉네임 <input name="memberNick" type="text" required> <br><br>
		*생년월일 <input name="memberBirth" type="date" required> <br><br>
		전화번호 <input name="memberTel" type="tal"> <br><br>
		이메일 <input name="memberEmail" type="email"> <br><br>
		우편번호 <input name="memberPost" type="text" maxlength = "6" size = 6> <br><br>
		기본주소 <input name="memberBaseAddress" type="text"> <br><br>
		상세주소 <input name="memberDetailAddress" type="text"> <br><br>
		<button>가입</button>
	</form>
</body>
</html>