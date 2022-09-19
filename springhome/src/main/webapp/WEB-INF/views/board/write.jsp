<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="게시판 목록" name="title"/>
</jsp:include>

<h1>글작성</h1>
<form action="write" method="post">
	<!-- 
	말머리 : <input name="boardHead" type="text" required><br><br>
	 -->
	말머리 : <select name="boardHead">
		<option value = "없음">없음</option>
		<option value = "정보">정보</option>
		<option value = "유머">유머</option>
		<option value = "공지">공지</option>
	</select>
	제목 : <input name="boardTitle" type="text" required><br><br>
	내용 <br><input name="boardContent" type="text" required 
	style="width:300px;height:200px;"><br><br>

	<button type="submit">작성하기</button>
</form>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>