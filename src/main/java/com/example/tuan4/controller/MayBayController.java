package com.example.tuan4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan4.entity.MayBay;
import com.example.tuan4.repository.MayBayRepository;

@RequestMapping("/maybay")
@RestController
public class MayBayController {

	@Autowired
	MayBayRepository mayBayRepository;

	// 2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@GetMapping("/tamBayTren10000")
	public List<MayBay> getMayBayTheoTamBay() {
		return mayBayRepository.getMayBayByTamBay();
	}

	// 7. Có bao nhiêu loại máy báy Boeing.
	@GetMapping("/loaiMayBayBoeing")
	public Integer getLoaiMayBayBoeing() {
		return mayBayRepository.getLoaiMayBayBoeing();
	}

}
