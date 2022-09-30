<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/adminHeader.jsp">
	<jsp:param value="회원 정보 변경" name="title"/>
</jsp:include>

<div class="container-400">
	<form action="change" method="post">
		<div class="row center">
			<h1>회원 정보 변경</h1>
		</div>
		<input type="hidden" name="memberId" value="${memberDto.memberId}">
<%--<input type="password" name="memberPw" value="${memberDto.memberPw}"> --%>
		<div class="row left">
			<label>닉네임</label>
			<input class="input w-100" type="text" name="memberNick" value="${memberDto.memberNick}" required><br><br>
		</div>
		<div class="row left">
			<label>생년월일</label>
			<input class="input w-100" type="date" name="memberBirth" value="${memberDto.memberBirth}" required>
		</div>
		<div class="row left">
			<label>전화번호</label>
			<input class="input w-100" type="tel" name="memberTel" value="${memberDto.memberTel}">
		</div>
		<div class="row left">
			<label>이메일</label>
			<input class="input w-100" type="email" name="memberEmail" value="${memberDto.memberEmail}">
		</div>
		<div class="row left">
			<label>우편번호</label>
			<input class="input w-100" type="text" name="memberPost" value="${memberDto.memberPost}" size="6" maxlength="6">
		</div>
		<div class="row">
			<input class="input w-100" type="text" name="memberBaseAddress" value="${memberDto.memberBaseAddress}" placeholder="기본주소">
		</div>
		<div class="row">
			<input class="input w-100" type="text" name="memberDetailAddress" value="${memberDto.memberDetailAddress}" placeholder="상세주소">
		</div>
		<div class="row left">
			<label>포인트</label>
			<input class="input w-100" type="number" name="memberPoint" value="${memberDto.memberPoint}">
		</div>
		<div class="row center">
			<label>등급</label>
			<c:choose>
				<c:when test="${memberDto.memberGrade == '일반'}">
					<input type="radio" name="memberGrade" value="일반" checked> 일반
				</c:when>
				<c:otherwise>
					<input type="radio" name="memberGrade" value="일반"> 일반
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${memberDto.memberGrade == 'VIP'}">
					<input type="radio" name="memberGrade" value="VIP" checked> VIP
				</c:when>
				<c:otherwise>
					<input type="radio" name="memberGrade" value="VIP"> VIP	
				</c:otherwise>
			</c:choose>
		</div>
		<div class="row">
			<button class="btn btn-positive w-100" type="submit">수정</button>
		</div>
	</form>
</div>

<jsp:include page="/WEB-INF/views/template/adminFooter.jsp"></jsp:include>




