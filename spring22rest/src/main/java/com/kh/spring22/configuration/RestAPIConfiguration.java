package com.kh.spring22.configuration;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
	info = @Info(
		title = "테스트용 REST API 서비스",
		description = "KH 정보교육원 REST API 수업자료",
		version = "v1"
	)
)
@Configuration
public class RestAPIConfiguration {

}