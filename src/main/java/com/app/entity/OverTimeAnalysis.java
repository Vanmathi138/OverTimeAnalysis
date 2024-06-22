package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="overtime_analysis")
public class OverTimeAnalysis {
	private String job_code;
	private String job_name;
	private String phase_code;
	
}
