package com.example.tuan4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan4.entity.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

	@Query(value = "select * from nhanvien where Luong < 10000", nativeQuery = true)
	List<NhanVien> findNhanVienbyLuongNhoHon10000();
}
