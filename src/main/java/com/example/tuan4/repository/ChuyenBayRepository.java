package com.example.tuan4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan4.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {

	List<ChuyenBay> findChuyenBayByGaDen(String gaden);

	@Query(value = "select * from chuyenbay where DoDai < 10000 and DoDai > 8000", nativeQuery = true)
	List<ChuyenBay> findChuyenBayCoDuongBayNhoHon10000VaLonHon8000();

	@Query(value = "select * from chuyenbay where GaDi = 'SGN' and GaDen = 'BMV'", nativeQuery = true)
	List<ChuyenBay> findChuyenBayCoGaDiSaiGonGaDenBuonMaThuoc();

	@Query(value = "select count(*) from chuyenbay where GaDi = 'SGN'", nativeQuery = true)
	Integer findChuyenBayCoGaDiSaiGon();

	@Query(value = "select * from chuyenbay c where DoDai <= 4168", nativeQuery = true)
	List<ChuyenBay> chuyenBayDuocThucHienBoiAirbusA320();
	
	@Query(value = "select * from chuyenbay where GaDi in ( select GaDen from chuyenbay) and GaDen in (select GaDi from chuyenbay)", nativeQuery = true)
	List<ChuyenBay>getDuongBayDiRoiTroVe();
	
	
	
	
}
