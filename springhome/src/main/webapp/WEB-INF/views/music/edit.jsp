<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음원 정보 수정</title>
</head>
<body>
	<div align="center">
		<h1>음원 정보 수정</h1>
		<form action="edit" method="post">
			<input type="hidden" name="musicNo" value="${musicDto.musicNo}">
			<input type="text" name="musicTitle" value="${musicDto.musicTitle}"><br><br>
			<input type="text" name="musicArtist" value="${musicDto.musicArtist}"><br><br>
			<input type="text" name="musicAlbum" value="${musicDto.musicAlbum}"><br><br>
<%-- 			<input type="number" name="musicPlay" value="${musicDto.musicPlay}"><br><br> --%>
			<input type="date" name="releaseTime" value="${musicDto.releaseTime}"><br><br>
			<button type="submit">변경</button>
		</form>
	</div>
</body>
</html>