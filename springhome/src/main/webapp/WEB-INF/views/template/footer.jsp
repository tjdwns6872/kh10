<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		</div>
		<hr>
	
		<!-- 정보 -->
		<div align="center">
			<h2>KH정보교육원 웹 개발 수업자료</h2>
		
			<%--  
				사용자 세션과 관련된 정보 출력
				- 세션 ID : 세션에 부여되는 고유번호(16진수 32자리)
					 세션ID : ${pageContext.session.getId()} 
				- 신규 세션은 세션이 생성될 경우(신규 접속)만 true로 출력
					 신규세션 : ${pageContext.session.isNew()} 		 
			 	(참고) pageContext는 페이지 내에서 사용 가능한 도구를 제공
			 --%>
			 loginId : ${sessionScope.loginId} <br>
			 로그인 : ${sessionScope.loginId != null} <br>
			 mg : ${sessionScope.mg} <br>
			 관리자 : ${sessionScope.mg == '관리자'}
		</div>
	</body>
</html>