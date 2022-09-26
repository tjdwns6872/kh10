<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="마이페이지" name="title"/>
</jsp:include>

	<div align="center">
		<h1>${dto.memberId} 회원 정보</h1>
		<table border="1" width="400">
			<tbody>
				<!-- 프로필 이미지를 출력 -->
				<tr>
					<th colspan="2">
						<img src="download?memberId=${dto.memberId}" width="100" height="100">
					</th>
				</tr>
				<tr>
					<th width="25%">아이디</th>
					<td>${dto.memberId}</td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td>${dto.memberNick}</td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td>${dto.memberBirth}</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td>${dto.memberTel}</td>
				</tr>
				<tr>
					<th>이메일</th>
					<td>${dto.memberEmail}</td>
				</tr>
				<tr>
					<th>주소</th>
					<td>
						<c:if test="${dto.memberPost != null}">
						[${dto.memberPost}]
						${dto.memberBaseAddress}
						${dto.memberDetailAddress}
						</c:if>
					</td>
				</tr>
				<tr>
					<th>포인트</th>
					<td>
						<fmt:formatNumber value="${dto.memberPoint}" pattern="#,##0"/> point
					</td>
				</tr>
				<tr>
					<th>권한</th>
					<td>
						${dto.memberGrade}
					</td>
				</tr>
				<tr>
					<th>가입일시</th>
					<td>
						<fmt:formatDate value="${dto.memberJoin}" pattern="y년 M월 d일 E a h시 m분 s초"/>
					</td>
				</tr>
				<tr>
					<th>로그인일시</th>
					<td>
						<fmt:formatDate value="${dto.memberLogin}" pattern="y년 M월 d일 E a h시 m분 s초"/>
					</td>
				</tr>
			</tbody>
		</table>
		<!-- 회원용 메뉴 -->
			<c:choose>
				<c:when test="${mg=='관리자'}">
					<h2><a href="list">목록 보기</a></h2>
					<h2><a href="edit?id=${dto.memberId}">수정하기</a></h2>
					<h2><a href="delete?id=${dto.memberId}">삭제하기</a></h2>
				</c:when>
				<c:otherwise>
					<h2><a href="password">비밀번호 수정</a></h2>
					<h2><a href="information">개인정보 수정</a></h2>
					<h2><a href="goodbye">회원탈퇴</a></h2>
					
				</c:otherwise>
			</c:choose>
	</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>