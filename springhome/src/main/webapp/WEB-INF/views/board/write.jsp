<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="자유 게시판" name="title"/>
</jsp:include>
<c:set var="isReply" value="${param.boardParent != null}"></c:set>

<div class="container-400">
	<form action="write" method="post" enctype="multipart/form-data">
	<div class="row center">
		<c:choose>
			<c:when test="${isReply}">
				<h1>답글 작성</h1>
			</c:when>
			<c:otherwise>
				<h1>게시글 작성</h1>
			</c:otherwise>
		</c:choose>
	</div>
	<%-- 답글이라면 부모글번호를 추가로 전송하도록 처리 --%>
	<c:if test="${isReply}">
		<input type="hidden" name="boardParent" 
									value="${param.boardParent}">
	</c:if>
	<div class="row left">
		말머리:
		<select name="boardHead">
			<option value="">선택</option>
			<option>정보</option>
			<option>유머</option>
					
			<c:if test="${mg == '관리자'}">
				<option>공지</option>
			</c:if>
		</select>
	</div>
	<div class="row left">
		<input class="input input-underline w-100" type="text" name="boardTitle" 
		required placeholder="제목" autocomplete="off">
	</div>
	<div class="row">
		<!-- 
			여러 줄 입력이 가능한 도구
			- rows 는 기본 표시 줄 수
			- cols 는 기본 표시 칸 수 
		-->
		<textarea class="input textarea.input w-100" name="boardContent" rows="10" cols="50" required
		placeholder="내용" autocomplete="off"></textarea>
	</div>
	<div class="row left">
	<!-- 첨부파일 -->
	 <label>첨부파일</label>
	<input class="w-100" type="file" name="attachment" multiple>
	</div>
	<div class="row right">
		<a class="btn btn-neutral" href="list">목록</a>
		<button class="btn btn-positive" type="submit">등록하기</button>
	</div>
</form>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



