<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
	<div align="center">
		<h1>
			회원정보
		</h1>
		<form action="list" method="get">
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nick">닉네임</option>
				<option value="member_grade">등급</option>
				<option value="member_point">포인트</option>
				<option value="member_login">로그인날짜</option>
			</select> <input name="keyword" required>
			<button>검색</button>
			<table border="1" wdth="500">
				<thead>
					<tr>
						<th>아이디</th>
						<th>닉네임</th>
						<th>등급</th>
						<th>포인트</th>
						<th>로그인날짜</th>
					</tr>
				</thead>
				<tbody align="center">
					<c:forEach var="dto" items="${list}">
						<tr>
							<td>${dto.memberId}</td>
							<td>${dto.memberNick}</td>
							<td>${dto.memberGrade}</td>
							<td>${dto.memberPoint}</td>
							<td>${dto.memberLogin}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>