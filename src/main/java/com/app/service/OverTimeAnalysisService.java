package com.app.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.entity.OverTimeAnalysis;
import com.app.repository.OverTimeAnalysisRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OverTimeAnalysisService {
	private final OverTimeAnalysisRepository repository;

	public Optional<OverTimeAnalysis> getById(Long id) {
		return repository.findById(id);
	}

	public Float calculateOvertime(LocalDate startDate, LocalDate endDate) {
		List<OverTimeAnalysis> overtimeData = repository.findByAttendanceDateBetween(startDate, endDate);
		return overtimeData.stream().map(OverTimeAnalysis::getOvertimeHours).reduce(0.0f, Float::sum);
	}
}
