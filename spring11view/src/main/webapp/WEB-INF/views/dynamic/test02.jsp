<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	JSTL(Jsp Standard Tag Library)
	- JSP 표준 태그 모음
	- JSP에서 자바코드 없이 자바코드 효과를 내기 위해서 존재
	- 변수생성, 조건, 반복까지 필요(core 패키지)
	- 사용하려면 사용할 페이지에 등록해야함
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach  var="i" begin="1" end="10" step="1">
	<h1>JSTL 반복 ${i}</h1>
</c:forEach>

<%for(int i=1;i<=10;i++){%>
	<h1>Scriptlet 반복 <%=i %></h1>
<%}%>