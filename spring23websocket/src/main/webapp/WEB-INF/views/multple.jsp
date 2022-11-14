<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>웹소켓 연결 예제</h1>
<button class="btn-connect">연결</button>
<button class="btn-disconnect">종료</button>

<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script>
	$(function(){
		// 목표
		// 1. 연결버튼을 누르면 웹소켓 연결을 생성
		// 2. 종료버튼을 누르면 웹소켓 연결을 제거
		
		disconnectState();
		
		// 1.
		$(".btn-connect").click(function(){
			var uri = "ws://localhost:8888/ws/multiple";
			//window.socket = new WebSocket(uri);
			socket = new WebSocket(uri);
			
			// (+추가) 웹소켓이 연결되었는지 종료되었는지 확인
			// - 웹소켓 객체가 기본 제공하는 4가지 이벤트를 설정해서 처리
			//console.log(socket);
			socket.onopen = function(){
				connectState();
				//console.log("open");
			};
			socket.onclose = function(){
				disconnectState();
				//console.log("close");
			};
			socket.onerror = function(){
				disconnectState();
				//console.log("error");
			};
			socket.onmessage = function(){
				console.log("message");
			};
				
		});
		
		// 2.
		$(".btn-disconnect").click(function(){
			//window.socket.close();
			socket.close();
		});
		function connectState(){ // 연결상태일 때 보여줘야 할 화면 처리
			$(".btn-connect").prop("disabled", true) // 연결버튼 잠금
			$(".btn-disconnect").prop("disabled", false) // 종료버튼 해제
		}
		function disconnectState(){ // 종료상태일 때 보여줘하 할 화면 처리
			$(".btn-connect").prop("disabled", false) // 연결버튼 해제
			$(".btn-disconnect").prop("disabled", true) // 종료버튼 잠금
		}
	})
</script>








