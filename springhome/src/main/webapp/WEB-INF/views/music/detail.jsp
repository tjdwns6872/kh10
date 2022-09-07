<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음원 상세 보기</title>
</head>
<body>
	<div align="left">
		<h1>음원 상세보기</h1>
		<ul>
			<li>번호 : ${dto.musicNo}</li>
			<li>타이틀 : ${dto.musicTitle}</li>
			<li>가수 : ${dto.musicArtist}</li>
			<li>앨범명 : ${dto.musicAlbum}</li>
			<li>재생수 : ${dto.musicPlay}</li>
			<li>등록날짜 : ${dto.releaseTime}</li>
		</ul>
		
		<h2><a href="insert">정보입력</a></h2>
		<h2><a href="list">목록</a></h2>
		<h2><a href="/">메인</a></h2>
	</div>
</body>
</html>