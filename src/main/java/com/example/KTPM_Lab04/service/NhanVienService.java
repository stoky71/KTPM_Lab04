package com.example.KTPM_Lab04.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.KTPM_Lab04.repository.NhanVienRepo;

@Service
@Transactional
public class NhanVienService {
	@Autowired
	private NhanVienRepo nhanVienRepo;
	
	public NhanVienRepo getNhanVienRepo() {
		return nhanVienRepo;
	}
	
	public void getAllNhanVienRepo() {
		nhanVienRepo.findAll().forEach(System.out::println);
	}
	public void getNhanVienLuongItHon10k() {
		nhanVienRepo.findNhanVienLuongItHon10k().forEach(System.out::println);
	}
	
	public Long getTongLuongPhaiTra() {
		return nhanVienRepo.tongSoLuongPhaiTraChoNhanVien();
	}
	public void getPhiCongBoing() {
		nhanVienRepo.findPhiCongDriveBoeing();
	}
}
