<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 페이지</title>
</head>
<body>

	<h1>방명록</h1>
	<form action="/guest_book/insert">
		<input name="name">
		<input name="memo">
		<button>작성완료</button>
	</form>

</body>
</html>