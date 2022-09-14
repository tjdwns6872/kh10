<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="메인페이지" name="title"/>
</jsp:include>

<table>
  <tr>
    <th>아이디 : </th>
    <td>${dto.memberId} </td>
  </tr>
  <tr>
    <th>닉네임 : </th>
    <td>${dto.memberNick} </td>
  </tr>
  <tr>
    <th>전화번호 : </th>
    <td>
    	<c:if test="${dto.memberTel == null}">
    		등록하지 않음
    	</c:if>
    </td>
  </tr>
  <tr>
    <th>이메일 : </th>
    <td>
    	<c:if test="${dto.memberEmail == null}">
    		등록하지 않음
    	</c:if>
    </td>
  </tr>
  <tr>
    <th>닉네임 : </th>
    <td>${dto.memberNick} </td>
  </tr>
  <tr>
    <th>우편번호 : </th>
    <td>
    	<c:if test="${dto.memberPost == null}">
    		등록하지 않음
    	</c:if>
    </td>
  </tr>
  <tr>
    <th>주소 : </th>
    <td>
    	<c:if test="${dto.memberBaseAddress == null}">
    		등록하지 않음
    	</c:if>
    </td>
  </tr>
  <tr>
    <th>상세주소 : </th>
    <td>
    	<c:if test="${dto.memberDetailAddress == null}">
    		등록하지 않음
    	</c:if>
     </td>
  </tr>
  <tr>
    <th>등급 : </th>
    <td>${dto.memberGrade} </td>
  </tr>
  <tr>
    <th>생년월일 : </th>
    <td>${dto.memberBirth} </td>
  </tr>
  <tr>
    <th>포인트 : </th>
    <td>${dto.memberPoint} </td>
  </tr>
</table>
<h2><a href="/member/password">비밀번호 수정</a></h2>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>