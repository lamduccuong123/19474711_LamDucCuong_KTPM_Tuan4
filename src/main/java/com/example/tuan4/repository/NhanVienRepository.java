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

	@Query(value = "select sum(Luong) from nhanvien", nativeQuery = true)
	Double getTongLuongNhanVien();

	@Query(value = "select distinct c.MaNV from chungnhan c join maybay m on c.MaMB = m.MaMB where m.Loai like 'Boeing%'", nativeQuery = true)
	List<String> getMaSoPhiCongBoeing();
	
	@Query(value = "select distinct n.MaNV, Ten, Luong from nhanvien n join chungnhan c on n.MaNV = c.MaNV where MaMB = '747'", nativeQuery = true)
	List<NhanVien> getPhiCongLai747();
	
	@Query(value = "select distinct c.MaNV from chungnhan c join maybay m on c.MaMB = m.MaMB where m.Loai like 'Boeing%' and m.Loai like 'Airbus%'", nativeQuery = true)
	List<String> getPhiCongLaiDuocCaBoeingVaAirbus();
}
