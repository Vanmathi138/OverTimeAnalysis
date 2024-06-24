package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.entity.OverTimeAnalysis;
import com.app.repository.OverTimeAnalysisRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OverTimeAnalysisService {
	private final OverTimeAnalysisRepository repo;

	public Optional<OverTimeAnalysis> getById(Long id) {
		
		return repo.findById(id);
	}

}
