package com.kh.spring17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.entity.ProductDto;

@SpringBootTest
public class ProductSearchTest {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
//		목록
//		List<ProductDto> list = sqlSession.selectList("product.complex1");
		
//		검색
//		Map<String, Object> param = new HashMap<>();
//		param.put("type", "name");
//		param.put("keyword", "처음");
//		List<ProductDto> list = sqlSession.selectList("product.complex1", param);
//		
//		for(ProductDto dto : list) {
//			System.out.println(dto);
//		}
		
//		복합검색
		Map<String, Object> param = new HashMap<>();
//		param.put("no", 1);
//		param.put("name", "스크");
//		param.put("minPrice", 500);
//		param.put("maxPrice", "2000");
//		param.put("beginMade", "2020-01-01");
//		param.put("endMade", "2020-06-30");
//		param.put("type", List.of("과자"));
//		param.put("type", List.of("과자", "사탕"));
//		param.put("type", List.of("과자", "사탕", "아이스크림"));
//		param.put("type", List.of("과자", "사탕", "아이스크림", "주류"));
		List<ProductDto> list = sqlSession.selectList("product.complex4", param);
		
		for(ProductDto dto : list) {
		System.out.println(dto);
		}
	}
}






