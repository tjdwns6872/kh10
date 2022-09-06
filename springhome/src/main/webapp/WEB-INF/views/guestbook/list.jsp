<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
</head>
<body>
	<div align="center">
		<h1>
			방명록
			<a href="insert">작성하기</a>
		</h1>
		
		<!-- 
			검색을 위한 검색창
			-<select>는 주어진 <option>중에서만 선택이 가능하도록 하는 태그
		 -->
		<form action="list" method="get">
			<select name="type">
				<option>name</option>
				<option>no</option>
				<option>memo</option>
			</select> <input name="keyword" required>
			<button>검색</button>
		</form>
		<table border="1" width="400">
			<tbody>
				<c:forEach var="dto" items="${list}">
					<tr>
						<th>${dto.no}</th>
						<th>${dto.name}</th>
					</tr>
					<tr height="80" valign="top">
						<td colspan="2">${dto.memo}</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>
</body>
</html>