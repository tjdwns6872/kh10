package com.kh.spring24;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kh.spring24.configuration.KakaoPayProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class PayTest04 {
	
	@Autowired
	private KakaoPayProperties kakaoPayProperties;
	
	private RestTemplate template = new RestTemplate();

	@Test
	public void test() throws URISyntaxException {
		//결제 승인에 필요한 데이터를 준비
		String tid = "T374730f204d1c578686";//준비 요청 완료 시 받는 정보에서 확인
		String partner_order_id = "ef7c3273-e54f-473e-81c1-4f7228e42dce";//준비 요청시와 동일한 정보
		String partner_user_id = "7c04c47f-adf4-4067-8c8d-539e7bd59f78";//준비 요청시와 동일한 정보
		String pg_token = "b1f896d1131ef34d7529";//결제 성공 페이지의 파라미터 조회
		
		
		//주소 설정
		URI uri = new URI("https://kapi.kakao.com/v1/payment/approve");
		
		//헤더 설정
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK "+kakaoPayProperties.getKey());
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		//바디 설정
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid());//가맹점번호(테스트용)
		body.add("tid", tid);
		body.add("partner_order_id", partner_order_id);//주문번호
		body.add("partner_user_id", partner_user_id);//고객번호
		body.add("pg_token", pg_token);
		
		//보낼 내용 합체
		HttpEntity<MultiValueMap<String, String>> entity = 
											new HttpEntity<>(body, headers);
		
		//요청
		Map response = template.postForObject(uri, entity, Map.class);
		log.debug("response = {}", response);
	}
	
}
