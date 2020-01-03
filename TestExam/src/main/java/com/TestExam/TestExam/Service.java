package com.TestExam.TestExam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;




@org.springframework.stereotype.Service
public class Service {

	@Autowired
	DaoSinhVien service;
	
	public List<ClassSinhVien> getAll() {
		return service.findAll();
	}
	
	public void ThemSv(ClassSinhVien sv) {
		service.save(sv);
	}
	
	public void XoaSv(Integer id) {
		service.deleteById(id);
	}
	
	public void SuaSv(ClassSinhVien sv) {
		service.save(sv);
	}
	
	public List<ClassSinhVien> SearchbyNameAndAddress(String tenSv, String address){
		ClassSinhVien sinhvien = new ClassSinhVien();
		sinhvien.setTenSv(tenSv);
		sinhvien.setAddress(address);
		
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("maSv")
				.withIgnorePaths("lopSv")
				.withIgnorePaths("bornSv")
				.withIgnorePaths("emailSv")
				.withIgnorePaths("queQuan");
		return service.findAll(Example.of(sinhvien, exampleMatcher));
	}
}
