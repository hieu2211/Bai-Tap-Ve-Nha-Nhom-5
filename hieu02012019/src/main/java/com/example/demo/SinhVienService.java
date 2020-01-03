package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;


@Service
public class SinhVienService {
	@Autowired
	daoSinhVien service;
//	a.liệt kê tất cả các thông tin của thực thể
	public List<SinhVien> getAllDataSinhVien() {
		return service.findAll();
	}

	// b. thêm mới 1 thực thể	
	public void insertOneSinhVien(SinhVien sinhvien) {
		service.save(sinhvien);
	}

	//c. xóa 1 thực thể
	public void deleteOneSinhVien(Integer id) {
		service.deleteById(id);
	}

	// d. chỉnh sửa 1 thực thể
	public void updateOneSinhVien(SinhVien sinhvien) {
		service.save(sinhvien);
	}
	// tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
	public List<SinhVien> getAllSinhVienByNameAdress(String name, String diachi){
		SinhVien sinhvien = new SinhVien();
		sinhvien.setTenSV(name);
		sinhvien.setDiaChi(diachi);
		
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("id")
				.withIgnorePaths("khoa")
				.withIgnorePaths("monHoc")
				.withIgnorePaths("ngaySinh")
				.withIgnorePaths("lop");
		return service.findAll(Example.of(sinhvien, exampleMatcher));
	}
}
