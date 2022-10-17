<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="방명록 작성" name="title"/>
</jsp:include>

<div class="container-400">
	<div class="row center">
		<h1>몬스터 상세 정보</h1>
	</div>
	<div class="row">
		<table class="table table-border">
			<tbody>
				<tr>
					<td>
						번호 : ${dto.no}
					</td>
					<td>
						이름 : ${dto.name}
					</td>
					<td>
						속성 : ${dto.type}
					</td>
				</tr>
			</tbody>
		</table>		
	</div>
	<div class="row right">
		<h2><a class="btn btn-positive" href="insert">등록</a></h2>
		<h2><a class="btn btn-positive" href="edit?no=${dto.no}">수정</a></h2>
		<h2><a class="btn btn-negative" href="delete?no=${dto.no}">삭제</a></h2>
		<h2><a class="btn btn-neutral" href="list">목록</a></h2>
		<h2><a class="btn btn-neutral" href="/">메인</a></h2>
	</div>
</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>   



