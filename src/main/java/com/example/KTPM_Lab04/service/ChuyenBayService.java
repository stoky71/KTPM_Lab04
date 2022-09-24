package com.example.KTPM_Lab04.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KTPM_Lab04.repository.ChuyenBayRepo;

@Service
@Transactional
public class ChuyenBayService {
	@Autowired
	private ChuyenBayRepo chuyenBayRepo;
	
	public ChuyenBayRepo getChuyenBayRepo() {
		return chuyenBayRepo;
	}
	
	public void getAllChuyenBayRepo() {
		chuyenBayRepo.findAll().forEach(System.out::println);
	}
	
	public void ChuyenBayDenDAD(){
		chuyenBayRepo.findChuyenBaystoGaDiDAD().forEach(System.out::println);
	}
}
