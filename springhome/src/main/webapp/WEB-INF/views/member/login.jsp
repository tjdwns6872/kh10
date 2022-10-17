<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="회원 로그인" name="title"/>
</jsp:include>


<!-- 정상/이상 모두 나오는 화면 -->
<div class="container-300">
	<div class="row center">
		<div class="row">
			<h1>회원 로그인</h1>
		</div>
		<form action="login" method="post">
			<div class="row">
				<input class="input w-100" type="text" name="memberId" placeholder="아이디"
					required>
			</div>
			<div class="row">
				<input class="input w-100" type="password" name="memberPw"
					placeholder="비밀번호" required>
			</div>
			<div class="row">
				<button class="btn btn-positive w-100" type="submit">로그인</button>
			</div>
		</form>
		<!-- 이상인 경우만 나오는 화면 -->
		<c:if test="${param.error != null}">
			<h2 style="color: red">입력한 정보가 맞지 않습니다</h2>
		</c:if>

	</div>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>