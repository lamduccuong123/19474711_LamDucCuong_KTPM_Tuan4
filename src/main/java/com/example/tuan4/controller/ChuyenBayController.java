package com.example.tuan4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan4.entity.ChuyenBay;
import com.example.tuan4.repository.ChuyenBayRepository;

@RequestMapping("/chuyenbay")
@RestController
public class ChuyenBayController {

	@Autowired
	ChuyenBayRepository chuyenBayRepository;

	// 1. Cho biết các chuyến bay đi Đà Lạt (DAD).
	@GetMapping("/gaDenDaLat")
	public List<ChuyenBay> chuyenBayDenDaLat() {
		return chuyenBayRepository.findChuyenBayByGaDen("DAD");
	}

	// 4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn
	// 8.000km.
	@GetMapping("/duongBayNhoHon10000LonHon8000")
	public List<ChuyenBay> chuyenBayCoDuongBayNhoHon10000VaLonHon8000() {
		return chuyenBayRepository.findChuyenBayCoDuongBayNhoHon10000VaLonHon8000();
	}

	// 5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@GetMapping("/chuyenBayXuatPhatSaiGonDiBuonMeThuoc")
	public List<ChuyenBay> chuyenBayXuatPhatSaiGonDiBuonMeThuoc(){
		return chuyenBayRepository.findChuyenBayCoGaDiSaiGonGaDenBuonMaThuoc();
		
	}
}
