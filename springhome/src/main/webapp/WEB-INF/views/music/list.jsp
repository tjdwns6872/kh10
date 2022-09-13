<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="메인페이지" name="title"/>
</jsp:include>
	<div align="center">
		<h1>
			음원목록
			<c:if test="${mg == '관리자' }">
				<a href="insert">등록하기</a>
			</c:if>
		</h1>
		<form action="list" method="get">
			<select name="type">
				<option value = "music_no">번호</option>
				<option value = "music_title">제목</option>
				<option value = "music_artist">가수</option>
				<option value = "music_album">앨범</option>
			</select> <input name="keyword" required>
			<button>검색</button>
			<table border="1" width="500">
				<thead>
					<tr>
						<th>번호</th>
						<th>타이틀</th>
						<th>가수</th>
						<th>앨범명</th>
						<th>재생수</th>
						<th>날짜</th>
					</tr>
				</thead>
				<tbody align="center">
					<c:forEach var="dto" items="${list}">
						<tr>
							<td>${dto.musicNo}</td>
							<td>
								<a href="detail?musicNo=${dto.musicNo}">${dto.musicTitle}</a>
							</td>
							<td>${dto.musicArtist}</td>
							<td>${dto.musicAlbum}</td>
							<td>${dto.musicPlay}</td>
							<td>${dto.releaseTime}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</form>
	</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>