<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="메인페이지" name="title"/>
</jsp:include>
	<div	align="center">
		<h1>포켓몬 목록
		<c:if test="${mg == '관리자' }">
				<a href="insert">등록하기</a>
		</c:if>
		</h1>
	
		<table border="1" width="400">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>속성</th>
				</tr>
			</thead>
			<tbody align="center">
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
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>