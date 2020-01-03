package com.TestExam.TestExam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/api")
public class ControllerMain  {
	@Autowired
	Service service;
	
	@RequestMapping(value="/getall")
	public List<ClassSinhVien> getAll(){
		return service.getAll();
	}
	
	@RequestMapping(value="/insert")
	public boolean InsertOne(@RequestBody ClassSinhVien sv) {
		service.ThemSv(sv);
		return true;
	}
	
	@RequestMapping(value="/delete")
	public boolean DeleteOne(@RequestBody ClassSinhVien Sinhvienss) {
		service.XoaSv(Sinhvienss.getMaSv());
		return true;
	}
	
	@RequestMapping(value="/update")
	public boolean updateone(@RequestBody ClassSinhVien sv) {
		service.SuaSv(sv);
		return true;
	}
	
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/searchbynameandaddress")
	public List<ClassSinhVien> SearchByNameAndAddress(@RequestParam(name = "tenSv") String tenSv,
			@RequestParam(name = "address") String address) {
		 return service.SearchbyNameAndAddress(tenSv, address);
	}
}
