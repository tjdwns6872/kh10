<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="비밀번호 변경" name="title"/>
</jsp:include>

<div class="container-300">
	<div class="row center">
		<h1>비밀번호 변경</h1>
	</div>
	<form action="password" method="post">
	<div class="row">
		<input class="input w-100" type="password" name="beforePw" placeholder="기존 비밀번호" required>
	</div>
	<div class="row">
		<input class="input w-100" type="password" name="afterPw" placeholder="바꿀 비밀번호" required>
	</div>
	<div class="row">
		<button class="btn btn-positive w-100" type="submit">변경하기</button>
	</div>
	</form>
</div>

<c:if test="${param.error != null}">
	<h2 style="color:red;">비밀번호가 잘못 작성되었습니다</h2>
</c:if>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>