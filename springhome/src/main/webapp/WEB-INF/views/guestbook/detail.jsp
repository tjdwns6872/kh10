<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 보기</title>
</head>
<body>
	<div	align="left">
		<h1>내용 상세 보기</h1>
		<ul>
			<li>번호:${dto.no}</li>
			<li>이름:${dto.name}</li>
			<li>내용:${dto.memo}</li>
		</ul>
		
		<h2><a href="edit?no=${dto.no}">수정</a></h2>
		<h2><a href="delete?no=${dto.no}">삭제</a></h2>
		<h2><a href="insert">정보입력</a></h2>
		<h2><a href="list">목록</a></h2>
		<h2><a href="/">메인</a></h2>
	</div>
</body>
</html>