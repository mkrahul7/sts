package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.studentRepo.Studentrepo;

@SpringBootTest
class TrywithApplicationTests {
//	@Autowired
//	private Studentrepo s;
	@Test
	void contextLoads() {
		System.out.println(5);
	}

}
