<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 목록</title>
</head>
<body>
	<div align="center">
		<h1>방명록 목록</h1>
		<table border="1">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>목록</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach var="dto" items="${list}">
					<tr>
						<td>${dto.no}</td>
						<td>${dto.name}</td>
						<td>${dto.memo}</td>						
					</tr>
				</c:forEach>
			</tbody>
		
		</table>
	</div>
</body>
</html>