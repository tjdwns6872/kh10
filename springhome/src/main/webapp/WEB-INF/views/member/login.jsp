<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="로그인" name="title"/>
</jsp:include>
	<div align="center">
		<h1>회원 로그인</h1>
		<form action="login" method="post">
			<input type="text" name="memberId" placeholder="아이디" required><br><br>
			<input type="password" name="memberPw" placeholder="비밀번호" required><br><br>
			<button type="submit">로그인</button>
		</form>
	</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>