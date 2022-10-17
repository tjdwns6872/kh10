<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="회원 가입" name="title"/>
</jsp:include>

<div class="container-300">
	<div class="row center">
		<h1>가입 정보 입력</h1>
	</div>
<form action="join" method="post" enctype="multipart/form-data">
	<div class="row left">
		<label>ID</label>
		<input class="input w-100" type="text" name="memberId" required
		autocomplete="off">
	</div>
	<div class="row left">
		<label>PW</label>
		<input class="input w-100" name="memberPw" type="password" required
		autocomplete="off">
	</div>
	<div class="row left">
		<label>닉네임</label>
		<input class="input w-100" name="memberNick" type="text" required
		autocomplete="off">
	</div>
	<div class="row left">
		<label>생년월일</label>
		<input class="input w-100" name="memberBirth" type="date" required
		autocomplete="off">
	</div>
	<div class="row left">
		<label>전화번호</label>
		<input class="input w-100" name="memberTel" type="tel"
		autocomplete="off">
	</div>
	<div class="row left">
		<label>이메일</label>
		<input class="input w-100" name="memberEmail" type="email"
		autocomplete="off">
	</div>
	<div class="row left">
		<label>우편번호</label>
		<input class="input w-100" name="memberPost" type="text" maxlength="6" size="6"
		autocomplete="off">
	</div>
	<div class="row left">
		<label>기본주소</label>
		<input class="input w-100" name="memberBaseAddress" type="text"
		autocomplete="off">
	</div>
	<div class="row left">
		<label>상세주소</label>
		<input class="input w-100" name="memberDetailAddress" type="text"
		autocomplete="off">
	</div>
	<div class="row left">
		<label>프로필이미지</label>
		<input class="input w-100" type="file" name="memberProfile" accept=".png, .jpg">
	</div>
	<div class="row left">
		<button class="btn btn-positive w-100" type="submit">가입하기</button>
	</div>
</form>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>