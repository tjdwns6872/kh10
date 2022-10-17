<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="방명록" name="title"/>
</jsp:include>

<div class="container-400">
	<div class="row center">
		<h1>
			방명록
			<a href="insert">작성하기</a>
		</h1>
	</div>
	<div>
		<!-- 
			검색을 위한 검색창
			-<select>는 주어진 <option>중에서만 선택이 가능하도록 하는 태그
		 -->
		<form action="list" method="get">
			<select name="type">
				<option>name</option>
				<option>no</option>
				<option>memo</option>
			</select> <input name="keyword" required>	
			<button class="btn-positive" type="submit">검색</button>
		</form>
	</div>
	<div>	
		<table class="table table-border table-stripe">
			<tbody>
				<c:forEach var="dto" items="${list}">
					<tr>
						<th>${dto.no}</th>
						<th>
							<a href="detail?no=${dto.no}">${dto.name}</a>
						</th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>