<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="게시판 목록" name="title"/>
</jsp:include>

<h1>게시판 목록</h1>
<form action="list" method="get">
	<select name="type">
		<option value="board_writer">작성자</option>
		<option value="board_title">제목</option>
	</select> <input name="keyword" type="text" required>
	<button type="submit">검색</button>
</form>
<table border="1" width="500" >
	<thead align="center">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>조회수</td>
			<td>작성일</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="listDto" items="${list}">
		<tr>
			<td>${listDto.boardNo}</td>
			<td>
				<a href="detail?boardNo=${listDto.boardNo}">${listDto.boardTitle}</a>
			</td>
			<td>${listDto.boardWriter}</td>
			<td>${listDto.boardRead}</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${listDto.boardWriteTime}" /></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<h2><a href="/board/write">글 작성하기</a></h2>
<c:if test="${param.error != null}">
	<h2 style="color:red;">존재하지 않는 게시물입니다.</h2>
</c:if>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>