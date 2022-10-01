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

}
