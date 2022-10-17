<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="메인페이지" name="title"/>
</jsp:include>

<div class="container-400 mt-40">
	<div class="row center">
		<h1>포켓몬 목록</h1>
	</div>
	<div class="row">
		<table class="table table-border table-stripe center">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>속성</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dto" items="${list}">
					<tr>
						<td>${dto.no}</td>
						<td>
							<a href="detil?no=${dto.no}">${dto.name}</a>
						</td>
						<td>${dto.type}</td>						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="row right">
		<c:if test="${mg == '관리자' }">
			<a class="btn btn-positive" href="insert">등록</a>
		</c:if>
	</div>
	<div class="row">
		<a class="btn btn-neutral" href="/">메인</a>
	</div>
</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>