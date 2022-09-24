package com.example.KTPM_Lab04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.KTPM_Lab04.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepo extends JpaRepository<ChuyenBay, String>{
	@Query(value = "select *  from chuyenbay where GaDen = 'DAD'", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaystoGaDiDAD();
	
	
}
