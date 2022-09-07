<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포켓몬 정보 수정</title>
</head>
<body>
	<div align="center">
	<h1>몬스터 정보 수정</h1>
	
	<!-- 
		변경이 불가능한 항목에 대한 처리 방법
		[1] 읽기 전용 처리(readonly) - 전송은 됨
		[2] 비활성화(disabled) - 전송도 안됨
		[3] 숨김 처리(type="hidden")
	 -->
		<form action="edit" method="post">
			<input name="no" value="${dto.no}" readonly><br><br>
			<input name="name" value="${dto.name}"><br><br>
			<input name="type" value="${dto.type}"><br><br>
			<button>수정</button>
		</form>
	</div>
</body>
</html>