package com.kh.spring23.vo.channel;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import org.springframework.web.socket.TextMessage;

import lombok.extern.slf4j.Slf4j;

/*
 * 채팅방 클래스
 * - 사용자를 저장할 수 있도록 구성
 * - 입장, 퇴장, 검색, 메세지 기능이 있어야 한다.
 */
@Slf4j
public class Room {
//	사용자 목록
	private Set<User> users = new CopyOnWriteArraySet<>();
	
	public void enter(User user) {
		users.add(user);
		log.debug("--> 방 입장 : {}", user);
	}
	public void leave(User user) {
		users.remove(user);
		log.debug("--> 방 퇴장 : {}", user);
	}
	public User search(String memberId) {
		for(User user : users) {
			if(user.is(memberId)) return user;
		}
		return null;
	}
	public void broadcast(TextMessage message) throws IOException {
		for(User user : users) {
			user.send(message);
		}
	}
	public int size() {
		return users.size();
	}
}













