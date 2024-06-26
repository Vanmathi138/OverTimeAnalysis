package com.app.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.OverTimeAnalysis;
import com.app.service.OverTimeAnalysisService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OverTimeAnalysisController {
	private final OverTimeAnalysisService service;
	
	@GetMapping("/getById/{id}")
	public Optional<OverTimeAnalysis> getById(@PathVariable Long id) {
		return service.getById(id);
	}
	@GetMapping("/overtimeHours")
	public ResponseEntity<Float> calculateOvertime(
	    @RequestParam("startDate") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate startDate,
	    @RequestParam("endDate") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate endDate) {
	    Float totalOvertimeHours = service.calculateOvertime(startDate, endDate);
	    return ResponseEntity.ok(totalOvertimeHours);
	}
}
