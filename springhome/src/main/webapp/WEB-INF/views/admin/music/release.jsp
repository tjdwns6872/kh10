<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/adminHeader.jsp">
	<jsp:param value="연도별 음원 개수" name="title"/>
</jsp:include>

<h1>연도별 음원 개수</h1>

<table border="1" width="600">
	<thead>
		<tr>
			<th>순위</th>
			<th>노래</th>
			<th>가수</th>
			<th>앨범</th>
			<th>재생수</th>
			<th>발매일</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="dto" items="${musicVo}" varStatus="status">
			<tr>
				<td>${musicVo.year}</td>
				<td>${musicVo.cnt}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/adminFooter.jsp"></jsp:include>
