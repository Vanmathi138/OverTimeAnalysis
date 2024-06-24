package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public Optional<OverTimeAnalysis> getById(@PathVariable Long id){
		return service.getById(id);
	}
}
