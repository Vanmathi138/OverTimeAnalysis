package com.app.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entity.OverTimeAnalysis;

@Repository
public interface OverTimeAnalysisRepository extends JpaRepository<OverTimeAnalysis, Long>{
	  List<OverTimeAnalysis> findByAttendanceDateBetween(LocalDate startDate, LocalDate endDate);

}
