package com.example.KTPM_Lab04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.KTPM_Lab04.repository.MayBayRepo;

@Service
@Transactional
public class MayBayService {
	@Autowired
	private MayBayRepo mayBayRepo;
	
	public MayBayRepo getMayBayRepo() {
		return mayBayRepo;
	}
	
	public void getAllMayBayRepo() {
		mayBayRepo.findAll().forEach(System.out::println);
	}
	
	public void getMayBayCoTamBayHon10k() {
		mayBayRepo.findMayBayCoTamBayLonHon10k().forEach(System.out::println);
	}
	
	public int getMayBayBoeing() {
		return mayBayRepo.findMayBayLoaiBoeing();
	}
}
