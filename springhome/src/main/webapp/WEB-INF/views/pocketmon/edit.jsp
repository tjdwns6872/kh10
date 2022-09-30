<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="몬스터 정보 수정" name="title"/>
</jsp:include>

<div class="container-300">
	<div class="row center">
		<h1>몬스터 정보 수정</h1>
	</div>
<form action="edit" method="post">
	<div class="row">
		<input class="input w-100" name="no" value="${dto.no}" readonly><br><br>
	</div>
	<div class="row">
		<input class="input w-100" type="text" name="name" value="${dto.name}"><br><br>
	</div>
	<div class="row">
		<input class="input w-100" type="text" name="type" value="${dto.type}"><br><br>
	</div>
	<div class="row">
		<button class="btn btn-positive w-100" type="submit">수정</button>
	</div>
</form>
</div>
	
<!-- 
	변경이 불가능한 항목에 대한 처리 방법
	[1] 읽기 전용 처리(readonly) - 전송은 됨
	[2] 비활성화(disabled) - 전송도 안됨
	[3] 숨김 처리(type="hidden")
-->
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>