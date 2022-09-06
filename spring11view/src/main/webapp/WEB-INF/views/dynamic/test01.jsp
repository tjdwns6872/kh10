<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	JSP에서는 Java코드를 사용할 수 있다.
	단, 표시를 해야 한다.
	
	<%%>로 구간을 만들고 코드를 작성하는데
	이를 scriptlet 이라고 부른다.
	
	값을 출력할 때는 별도의 출력구문을 사용한다.
	<%=%>로 변수명을 감싸면 출력이 되며,
	이를 표현식(expression)이라고 부른다.
	
	장점 : 자바의 코드를 그대로 쓸 수 있다.
	단점 : 가독성이 떨어진다.
--%>

<%for(int i = 0; i < 10; i++){%>
	<h1>Hello <%=i%></h1>
<%} %>
