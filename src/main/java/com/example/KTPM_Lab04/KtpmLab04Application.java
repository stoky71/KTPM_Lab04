package com.example.KTPM_Lab04;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.KTPM_Lab04.service.ChuyenBayService;

@SpringBootApplication
public class KtpmLab04Application {

	final ChuyenBayService chuyenBayService;
	
	public 	KtpmLab04Application(ChuyenBayService chuyenBayService) {
		this.chuyenBayService = chuyenBayService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(KtpmLab04Application.class, args);
	}
}
