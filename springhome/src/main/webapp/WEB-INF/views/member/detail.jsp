<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세 정보</title>
</head>
<body>
	<div align="left">
		<h1>회원 상세 정보</h1>
		<table border="1" width="900">
			<thead>
				<tr>
					<th>아이디</th>
					<th>닉네임</th>
					<th>생년월일</th>
					<th>전화번호</th>
					<th>이메일</th>
					<th>등급</th>
					<th>포인트</th>
				</tr>
			</thead>
			<tbody align="center">
				<tr>
					<td>${dto.memberId}</td>
					<td>${dto.memberNick}</td>
					<td>${dto.memberBirth}</td>
					<td>${dto.memberTel}</td>
					<td>${dto.memberEmail}</td>
					<td>${dto.memberGrade}</td>
					<td>${dto.memberPoint}</td>
				</tr>
			</tbody>
		</table>
		<h2><a href="list">목록</a></h2>
		<h2><a href="/">메인</a></h2>
	</div>
</body>
</html>