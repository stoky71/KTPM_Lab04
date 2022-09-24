package com.example.KTPM_Lab04_entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;

public class ChungNhanID implements Serializable{
	@Basic
	@Column(name = "MaNV")
	private String maNV;
	
	@Basic(optional = false)
	@Column(name = "MaMB")
	private Integer maMB;
}
