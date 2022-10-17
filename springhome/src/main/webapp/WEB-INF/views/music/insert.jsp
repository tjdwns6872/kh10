<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="음원등록" name="title"/>
</jsp:include>

<div class="container-300">
	<div class="row center">
		<h1>음원 정보 입력</h1>
	</div>
	<form action="insert" method="post">
		<div class="row left">
			<label>제목</label>
			<input class="input w-100" name="musicTitle" type="text" required>
		</div>
		<div class="row left">
			<label>가수</label>
			<input class="input w-100" name="musicArtist" type="text" required>
		</div>
		<div class="row left">
			<label>앨범명</label>	
			<input class="input w-100" name="musicAlbum" type="text" required>
		</div>
		<div class="row left">
			<label>발매일</label>
			<input class="input w-100" name="releaseTime" type="date" required>
		</div>
		<div class="row center">
			<button class="btn btn-positive w-100" type="submit">등록</button>
		</div>
	</form>
</div>
	
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>