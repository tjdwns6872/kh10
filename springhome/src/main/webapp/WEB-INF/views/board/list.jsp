<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="자유 게시판" name="title"/>
</jsp:include>

<h1>자유 게시판</h1>

<table border="1" width="800">
	<thead>
		<tr>
			<td align="right" colspan="5">
				<a href="write">글쓰기</a>
			</td>
		</tr>
		<tr>
			<th>번호</th>
			<th width="45%">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="boardDto" items="${list}">
		<tr>
			<td>${boardDto.boardNo}</td>
			<td align="left">
			
				<!-- 말머리 출력(있을 경우에만) -->
				<c:if test="${boardDto.boardHead != null}">
					[${boardDto.boardHead}]
				</c:if>
				
				<!-- 제목을 누르면 상세 페이지로 이동하도록 처리 -->
				<a href="detail?boardNo=${boardDto.boardNo}">
					${boardDto.boardTitle}
				</a>
				
			</td>
			<td>${boardDto.boardWriter}</td>
			<td>${boardDto.boardWritetime}</td>
			<td>${boardDto.boardRead}</td>
		</tr>
		</c:forEach>
	</tbody>
	<tfoot>
		<tr>
			<td align="right" colspan="5">
				<a href="write">글쓰기</a>
			</td>
		</tr>
	</tfoot>
</table>

<!-- 페이지 네비게이터 -->
<h3> &laquo; &lt; 1 2 3 4 5 6 7 8 9 10 &gt; &raquo; </h3>

<!-- 검색창 -->
<form action="list" method="get">
	<select name="type" required>
		<option value="board_title" <c:if test="${vo.type == 'board_title'}">selected</c:if>>제목</option>
		<option value="board_writer" <c:if test="${vo.type == 'board_writer'}">selected</c:if>>작성자</option>
	</select>
	
	<input type="search" name="keyword" placeholder="검색어" required value="${vo.keyword}">
	
	<button type="submit">검색</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>