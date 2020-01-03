package com.TestExam.TestExam;

import javax.persistence.*;

@Entity
public class ClassSinhVien {
	public Integer maSv;
	public String tenSv;
	public String lopSv;
	public String address;
	public String bornSv;
	public String emailSv;
	public String queQuan;
	
	
	public ClassSinhVien() {
		super();
	}
	
	public ClassSinhVien(Integer maSv, String tenSv, String lopSv, String address, String bornSv, String emailSv,
			String queQuan) {
		super();
		this.maSv = maSv;
		this.tenSv = tenSv;
		this.lopSv = lopSv;
		this.address = address;
		this.bornSv = bornSv;
		this.emailSv = emailSv;
		this.queQuan = queQuan;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaSv() {
		return maSv;
	}
	public void setMaSv(Integer maSv) {
		this.maSv = maSv;
	}
	public String getTenSv() {
		return tenSv;
	}
	public void setTenSv(String tenSv) {
		this.tenSv = tenSv;
	}
	public String getLopSv() {
		return lopSv;
	}
	public void setLopSv(String lopSv) {
		this.lopSv = lopSv;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBornSv() {
		return bornSv;
	}
	public void setBornSv(String bornSv) {
		this.bornSv = bornSv;
	}
	public String getEmailSv() {
		return emailSv;
	}
	public void setEmailSv(String emailSv) {
		this.emailSv = emailSv;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	
	
}
