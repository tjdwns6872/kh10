<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="게시글 상세보기" name="title"/>
</jsp:include>


<h1>상세보기</h1>
<table border="1" width="500">
	<tbody>
		<tr align="center">
			<th>${boardDto.boardNo}</th>
			<th>${boardDto.boardHead}</th>
			<th>${boardDto.boardTitle}</th>
			<td>${boardDto.boardRead}</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${boardDto.boardWriteTime}" /></td>
		</tr>
		<tr align="center">
			<th align="left" colspan="5" height="300" valign="top">
				${boardDto.boardContent}
			</th>
	</tbody>
</table>
<h2><a href="/board/list">뒤로가기</a></h2>
<h2><a href="/">메인으로 돌아가기</a></h2>
<h2><a href="delete?boardNo=${boardDto.boardNo}">삭제하기</a></h2>
<h2><a href="edit?boardNo=${boardDto.boardNo}">수정하기</a></h2>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>