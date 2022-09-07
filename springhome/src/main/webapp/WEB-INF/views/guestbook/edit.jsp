<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 내용 수정</title>
</head>
<body>
	<div align="center">
		<h1>${dto.no}번 ${dto.name}의 작성글</h1>
		<form action="edit" method="post">
			<input name="no" value="${dto.no}" readonly><br><br>
			<input name="name" value="${dto.name}"><br><br>
			<input name="memo" value="${dto.memo}"><br><br>
			<button>수정</button>
		</form>
	</div>
</body>
</html>