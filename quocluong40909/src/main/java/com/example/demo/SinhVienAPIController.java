package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/sinhvien")
public class SinhVienAPIController {
	@Autowired
	SinhVienService service;

	//a.liệt kê tất cả các thông tin của thực thể
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getAllDataSinhVien")
	public List<SinhVien> getAllDataSinhVien() {
		return service.getAllDataSinhVien();
	}

	// b. thêm mới 1 thực thể	
	@RequestMapping(value = "/insertOneSinhVien")
	public boolean insertOneSinhVien(@RequestBody SinhVien sinhvien) {
		service.insertOneSinhVien(sinhvien);
		return true;
	}

	//c. xóa 1 thực thể
	@RequestMapping(value = "/deleteOneSinhVien")
	public boolean deleteOneSinhVien(@RequestBody SinhVien sinhvien) {
		service.deleteOneSinhVien(sinhvien.getId());
		return true;
	}

	// d. xóa 1 thực thể6 Update one
	@RequestMapping(value = "/updateOneSinhVien")
	public boolean updateOneSinhVien(@RequestBody SinhVien sinhvien) {
		service.updateOneSinhVien(sinhvien);
		return true;
	}
	// tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getAllSinhVienByNameAdress")
	public List<SinhVien> getAllSinhVienByNameAdress(@RequestParam(name = "TenSV") String TenSV,
			@RequestParam(name = "DiaChi") String DiaChi) {
		 return service.getAllSinhVienByNameAdress(TenSV,DiaChi);	 
	}
}
