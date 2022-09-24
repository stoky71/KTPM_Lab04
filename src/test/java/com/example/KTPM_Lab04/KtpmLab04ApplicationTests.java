package com.example.KTPM_Lab04;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.KTPM_Lab04.service.ChuyenBayService;

@SpringBootTest
class KtpmLab04ApplicationTests {
	@Autowired
	ChuyenBayService ChuyenBayService;
	@Test
	void CacChuyenBayDiDAD() {
		System.out.println("Các chuyến bay đi Đà Lạt");
		ChuyenBayService.ChuyenBayDenDAD();
	}

}
