<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="게시판 수정" name="title"/>
</jsp:include>

<h1>게시글 수정</h1>
<form action="edit" method="post">
	<c:choose>
		<c:when test="${boardDto.boardHead == '없음'}">
			<select name="boardHead" required>
				<option value="없음" selected>없음</option>
				<option value="정보">정보</option>
				<option value="유머">유머</option>
				<option value="공지">공지</option>
			</select>
		</c:when>
		<c:when test="${boardDto.boardHead == '정보'}">
			<select name="boardHead" required>
				<option value="없음">없음</option>
				<option value="정보" selected>정보</option>
				<option value="유머">유머</option>
				<option value="공지">공지</option>
			</select>
		</c:when>
		<c:when test="${boardDto.boardHead == '유머'}">
			<select name="boardHead" required>
				<option value="없음">없음</option>
				<option value="정보">정보</option>
				<option value="유머" selected>유머</option>
				<option value="공지">공지</option>
			</select>
		</c:when>
		<c:otherwise>
			<select name="BoardHead" required>
				<option value="없음">없음</option>
				<option value="정보">정보</option>
				<option value="유머">유머</option>
				<option value="공지" selected>공지</option>
			</select>
		</c:otherwise>
	</c:choose>
	<input type="text" name="boardNo" value="${boardDto.boardNo}">
	제목 : <input name="boardTitle" type="text" required
		value="${boardDto.boardTitle}"><br>
	<br> 내용 <br>
	<input name="boardContent" type="text" required
		value="${boardDto.boardContent}" style="width: 300px; height: 200px;"><br>
	<br>

	<button type="submit">수정하기</button>
</form>
<h2><a href="/board/list">뒤로가기</a></h2>
<h2><a href="/">메인으로 돌아가기</a></h2>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>