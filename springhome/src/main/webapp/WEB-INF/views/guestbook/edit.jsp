<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="작성글 수정" name="title"/>
</jsp:include>

<div class="container-400">
	<form action="edit" method="post">
		<div class="row center">
			<h1>${dto.no}번 ${dto.name}의 작성글</h1>
		</div>
		<div class="row">
			<input class="input w-100" type="number" name="no" value="${dto.no}" readonly>
		</div>
		<div class="row">
			<input class="input w-100" type="text" name="name" value="${dto.name}">
		</div>
		<div class="row">
			<textarea class="input w-100"  name="memo">${dto.memo}</textarea>
		</div>
		<div class="row">
			<button class="btn btn-positive w-100" type="submit">수정</button>
		</div>
	</form>
</div>
	
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>