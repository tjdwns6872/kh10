<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="회원정보 수정" name="title"/>
</jsp:include>
	<div align="center">
		<h1>회원정보 수정</h1>
		<form action="edit" method="post">
			<input type="hidden" name="memberId" value="${dto.memberId}">
			<input type="text" name="memberNick" value="${dto.memberNick}"><br><br>
			<input type="text" name="memberTel" value="${dto.memberTel}"><br><br>
			<input type="text" name="memberEmail" value="${dto.memberEmail}"><br><br>
			<input type="text" name="memberPost" value="${dto.memberPost}"><br><br>
			<input type="text" name="memberBaseAddress" value="${dto.memberBaseAddress}"><br><br>
			<input type="text" name="memberDetailAddress" value="${dto.memberDetailAddress}"><br><br>
			<input type="text" name="memberGrade" value="${dto.memberGrade}"><br><br>
			<button type="submit">수정하기</button>
		</form>
	</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>