package com.example.tuan4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan4.entity.NhanVien;
import com.example.tuan4.repository.NhanVienRepository;

@RequestMapping("/nhanvien")
@RestController
public class NhanVienController {

	@Autowired
	NhanVienRepository nhanVienRepository;

	// 3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	@GetMapping("/nhanVienLuongDuoi10000")
	public List<NhanVien> nhanVienLuongDuoi10000() {
		return nhanVienRepository.findNhanVienbyLuongNhoHon10000();
	}

	// 8. Cho biết tổng số lương phải trả cho các nhân viên.
	@GetMapping("/tongLuongNhanVien")
	public Double getTongLuongNhanVien() {
		return nhanVienRepository.getTongLuongNhanVien();
	}

	// 9. Cho biết mã số của các phi công lái máy báy Boeing.
	@GetMapping("/maSoPhiCongBoeing")
	public List<String> getMaSoPhiCongBoeing() {
		return nhanVienRepository.getMaSoPhiCongBoeing();
	}

}
