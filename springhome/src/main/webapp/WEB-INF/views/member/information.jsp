<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="내 정보 변경" name="title"/>
</jsp:include>

<div class="container-400">
	<form action="information" method="post">
		<div class="row center">
			<h1>내 정보 변경</h1>
		</div>
		<div class="row">
			아이디 : ${memberDto.memberId}
		</div>
		<div class="row left">
			<label>닉네임</label>
			<input class="input w-100" type="text" name="memberNick" required value="${memberDto.memberNick}">
		</div>
		<div class="row left">
			<label>생년월일</label>
			<input class="input w-100" type="date" name="memberBirth" required value="${memberDto.memberBirth}">
		</div>
		<div class="row left">
			<input class="input w-100" type="tel" name="memberTel" required value="${memberDto.memberTel}">
		</div>
		<div class="row left">
			<input class="input w-100" type="email" name="memberEmail" value="${memberDto.memberEmail}">
		</div>
		<div class="row left">
			<input class="input w-100" type="text" name="memberPost" value="${memberDto.memberPost}" size="6" maxlength="6">
		</div>
		<div class="row">
			<input class="input w-100" type="text" name="memberBaseAddress" 
			value="${memberDto.memberBaseAddress}" placeholder="기본주소">
		</div>
		<div class="row">
			<input class="input w-100" type="text" name="memberDetailAddress" 
			value="${memberDto.memberDetailAddress}" placeholder="상세주소">
		</div>
		<div class="row left">
			<label>비밀번호 확인</label>
			<input class="input w-100" type="password" name="memberPw" required>
		</div>
		<div class="row">
			<button class="btn btn-positive w-100" type="submit">변경하기</button>
		</div>
	</form>
</div>
<c:if test="${param.error != null}">
	<h2 style="color:red">비밀번호가 맞지 않습니다</h2>
</c:if>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

