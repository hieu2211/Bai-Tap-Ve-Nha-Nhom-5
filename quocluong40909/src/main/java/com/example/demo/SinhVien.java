package com.example.demo;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class SinhVien {
	public int id;
	public String tenSV;
	public String khoa;
	public String monHoc;
	public Date ngaySinh;
	public String lop;
	public String diaChi;
	
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String tenSV, String khoa, String monHoc, Date ngaySinh, String lop, String diaChi) {
		super();
		this.tenSV = tenSV;
		this.khoa = khoa;
		this.monHoc = monHoc;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
		this.diaChi = diaChi;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
