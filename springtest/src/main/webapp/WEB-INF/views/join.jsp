<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<style>
/* 메세지는 숨김처리 */
.success-message, .fail-message {
	display: none;
}

.success-message {
	color: green;
}

.fail-message {
	color: red;
}

/* 입력창의 상태에 따라 특정 메세지를 표시 */
.input.success {
	border-color: green;
}

.input.success ~ .success-message {
	display: block;
}

.input.fail {
	border-color: red;
}

.input.fail ~ .fail-message {
	display: block;
}
</style>

<script src="https://code.jquery.com/jquery-3.6.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("[name=userId]").blur(checkId);
		$("[name=userPw]").blur(checkPassword);
		$("#password-check").blur(checkPasswordRe);

		function checkId() {
			var userId = $(this);
			var regex = /^[a-zA-Z0-9]{8,20}$/;

			if (!userId) return;
			userId.removeClass("success fail");
			
			if(regex.test(userId.val())){
				userId.addClass("success");
				return true;
			}else {
				userId.addClass("fail");
			}
		}
		function checkPassword() {
			var regex = /^.*(?=^.{8,16}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
			$(this).removeClass("success fail");
			if (regex.test($(this).val())) {
				$(this).addClass("success");
			} else {
				$(this).addClass("fail");
			}
		}
		function checkPasswordRe() {
			$(this).removeClass("success fail");
			if ($(this).val() == $("input[name=userPw]").val()) {
				$(this).addClass("success");
			} else {
				$(this).addClass("fail");
			}
		}

	});
</script>

</head>
<body>
	<h1>회원가입</h1>
	<form action="join" method="post" autocomplete="off">
		<div class="row">
			<label>아이디</label> <input type="text" name="userId"
				class="input w-100" > <span
				class="success-message">사용 가능한 아이디</span> 
				<span class="fail-message">영문 대문자, 소문자 또는 숫자 8~20글자</span>
		</div>
		<div class="row">
			<label>비밀번호</label> <input type="password" name="userPw"
				class="input w-100" > <span
				class="success-message">올바른 비밀번호 형식</span> <span
				class="fail-message">영문 대문자, 소문자 또는 숫자 또는 특수문자(!, @, #, $)로 구성된 8~16글자</span>
		</div>
		<div class="row">
			<label>비밀번호 확인</label> <input type="password" class="input w-100"
				id="password-check" > <span
				class="success-message">비밀번호가 일치</span> <span
				class="fail-message">비밀번호가 일치하지 않습니다</span>
		</div>
		<div class="row right">
			<button type="submit">가입</button>
		</div>
	</form>
</body>
</html>
