package com.example.KTPM_Lab04;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.KTPM_Lab04.service.ChuyenBayService;
import com.example.KTPM_Lab04.service.MayBayService;
import com.example.KTPM_Lab04.service.NhanVienService;

@SpringBootTest
class KtpmLab04ApplicationTests {
	@Autowired
	ChuyenBayService chuyenBayService;
	
	@Autowired
	MayBayService mayBayService;
	
	@Autowired
	NhanVienService nhanVienService;
	
	@Test
	void CacChuyenBayDiDAD() {
		System.out.println("Câu 1");
		chuyenBayService.ChuyenBayDenDAD();
	}
	
	@Test
	void TamBay10000() {
		System.out.println("Câu 2");
		mayBayService.getMayBayCoTamBayHon10k();
	}
	
	@Test
	void LuongNho10000() {
		System.out.println("Câu 3");
		nhanVienService.getNhanVienLuongItHon10k();
	}
	@Test
	void DoDaiBay() {
		System.out.println("Câu 4");
		chuyenBayService.getChuyenBayDoDaiHon8kVaNhoHon10k();
	}
	@Test
	void SGtoBMV() {
		System.out.println("Câu 5");
		chuyenBayService.getChuyenBayTuSGToiBMT();
	}
	@Test
	void CountFromSGN() {
		System.out.println("Câu 6 có " + chuyenBayService.getChuyenBayTuSGN() + "chuyến bay xuất phát từ SG");
	}
	@Test
	void CountMBBoeing() {
		System.out.println("Câu 7" + "có " + mayBayService.getMayBayBoeing() + " loại");
	}
	@Test
	void SumLuong() {
		System.out.println("Câu 8, tổng lương phải trả cho nhân viên là " + nhanVienService.getTongLuongPhaiTra() + "đồng");
	}
	@Test
	void NVBoeing() {
		System.out.println("Câu 9");
		nhanVienService.getPhiCongBoing();
	}
}
