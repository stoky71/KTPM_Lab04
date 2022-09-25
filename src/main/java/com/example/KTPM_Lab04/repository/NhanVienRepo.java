package com.example.KTPM_Lab04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.KTPM_Lab04.entity.NhanVien;

@Repository
public interface NhanVienRepo extends JpaRepository<NhanVien, String>{
	@Query(value = "select * from nhanvien where Luong < 10000", nativeQuery = true)
	public List<NhanVien> findNhanVienLuongItHon10k();
	
	@Query(value = "select sum(Luong) from nhanvien", nativeQuery = true)
	public Long tongSoLuongPhaiTraChoNhanVien();
	
	@Query(value = " select * from nhanvien n join chungnhan c \n" +
            "on n.MaNV = c.MaNV join maybay m on m.MaMB = c.MaMB\n" +
            "where m.Loai like '%Boeing%'\n" +
            "group by n.MaNV, n.Ten  ", nativeQuery = true)
	public List<NhanVien> findPhiCongDriveBoeing();
}
