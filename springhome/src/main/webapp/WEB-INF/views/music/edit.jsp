<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="음원정보 수정" name="title"/>
</jsp:include>
<div class="container-300">
	<div class="row center">
		<h1>음원 정보 수정</h1>
	</div>
	<form action="edit" method="post">
	<input type="hidden" name="musicNo" value="${musicDto.musicNo}">
	<div class="row">
		<input class="input w-100" type="text" name="musicTitle" value="${musicDto.musicTitle}">
	</div>
	<div class="row">
		<input class="input w-100" type="text" name="musicArtist" value="${musicDto.musicArtist}">
	</div>
	<div class="row">
		<input class="input w-100" type="text" name="musicAlbum" value="${musicDto.musicAlbum}">
	</div>
	<div class="row">
		<input class="input w-100" type="date" name="releaseTime" value="${musicDto.releaseTime}">
	</div>
	<div class="row">
		<button class="btn btn-positive w-100" type="submit">변경</button>
	</div>
	</form>
</div>
	<%-- <input type="number" name="musicPlay" value="${musicDto.musicPlay}"> --%>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>


