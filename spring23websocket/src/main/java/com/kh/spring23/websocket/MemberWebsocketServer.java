package com.kh.spring23.websocket;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kh.spring23.vo.MessageVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemberWebsocketServer  extends TextWebSocketHandler{
	private Set<WebSocketSession> users = new CopyOnWriteArraySet<>();
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
//		log.debug("session={}", session.getAttributes());
		Map<String, Object> attributes = session.getAttributes();
		String loginId = (String)attributes.get("loginId");
		String loginNick = (String)attributes.get("loginNick");
		String loginAuth = (String)attributes.get("loginAuth");
		log.debug("{}, {}, {}", loginId, loginNick, loginAuth);
		users.add(session);
	}
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		users.remove(session);
	}
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		Map<String, Object> attributes = session.getAttributes();
		String loginId = (String)attributes.get("loginId");
		String loginNick = (String)attributes.get("loginNick");
		String loginAuth = (String)attributes.get("loginAuth");
		boolean available = loginAuth != null;
		if(!available) {
			log.debug("비회원 채팅금지");
			return;
		}
		
		log.debug("메세지 - {}", message.getPayload());
		
		ObjectMapper mapper = new ObjectMapper();
		MessageVO json = mapper.readValue(
							message.getPayload(), MessageVO.class);
		log.debug("json = {}", json);
		
//		json에 시간을 추가
		json.setTime(new Date());
		
		// json에 id, nickname, auth를 추가
		json.setId(loginId);
		json.setNickname(loginNick);
		json.setAuth(loginAuth);
		
		
//		바뀐 정보를 이용하여 신규 메세지 생성
		String payload = mapper.writeValueAsString(json);
		TextMessage jsonMessage = new TextMessage(payload);
		
		for(WebSocketSession user : users) {
//			user.sendMessage(json);
			user.sendMessage(jsonMessage);
		}
	}
}
