package com.kh.spring23.websocket;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;

/*
 * 여러 명의 사용자를 기억하기 위한 코드가 구현된 서버
 * - 아직 메세지는 처리하지 않음
 */
@Slf4j
@Service
public class MultipleUserWebsocketServer extends TextWebSocketHandler{
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		log.debug("사용자 접속 : {}", session);
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		log.debug("사용자 종료 : {}", session);
	}

}













