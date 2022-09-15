package com.kh.spring12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring12.repository.PocketMonsterDao;

@SpringBootTest
public class Test03 {
	@Autowired
	private PocketMonsterDao pocketMonsterDao;
}
