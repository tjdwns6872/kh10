<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	<h1>어서오세요!</h1>
	<!--  로그인 상태를 확인 -->
	<h2>loginId = ${sessionScope.loginId}</h2>
	<h2>로그인 상태 = ${loginId != null}</h2>
	<c:set var="login" value="${loginId != null}"></c:set>
	
	<c:choose>
		<c:when test="${login}">
		<h2><a href="member/list">회원정보</a></h2>
			<h2><a href="member/logout">로그아웃</a></h2>
		</c:when>
		<c:otherwise>
			<h2><a href="member/login">로그인</a></h2>
			<h2><a href="member/insert">회원 가입</a></h2>
		</c:otherwise>
	</c:choose>
	
	<h2><a href="pocketmon/insert">포켓몬 등록</a></h2>
	<h2><a href="pocketmon/list">포켓몬 목록</a></h2>
	<h2><a href="guestbook/list">방명록보기</a></h2>
	<h2><a href="music/list">음원보기</a></h2>
</body>
</html>