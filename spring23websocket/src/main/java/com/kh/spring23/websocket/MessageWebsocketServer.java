package com.kh.spring23.websocket;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Service
public class MessageWebsocketServer extends TextWebSocketHandler{
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {

	}
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {

	}
}
