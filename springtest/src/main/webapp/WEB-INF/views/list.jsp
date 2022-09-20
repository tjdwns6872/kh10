<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장난감 목록</title>
</head>
<body>
	<div align="center">
		<table border="1" width=200>
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>가격</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach var="dto" items="${list}">
					<tr>
						<td>${dto.toyNo}</td>
						<td>${dto.toyName}</td>
						<td>${dto.toyPrice}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>