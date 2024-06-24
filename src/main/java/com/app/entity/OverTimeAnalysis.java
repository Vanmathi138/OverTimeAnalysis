package com.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="ot")
public class OverTimeAnalysis{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name="job_code")
	private String job_code;
	
	@Column(name="job_name")
	private String job_name;
	
	@Column(name="phase_code")
	private String phase_code;
	
	@Column(name="phase_name")
	private String phase_name;
	
	@Column(name="project_code")
	private String project_code;
	
	@Column(name="project_name")
	private String project_name;
	
	@Column(name="estimated_hours")
	private String estimated_hours;
	
	@Column(name="status")
	private String status;
	
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="attendance_date")
	private String attendance_date;
	
	@Column(name="job_hours")
	private String job_hours;
	
	@Column(name="Job Count")
	private float job_count;
	
	@Column(name="ot1")
	private String ot1;
	
	@Column(name="ot2")
	private String ot2;
	
	@Column(name="Clocked Hours")
	private float clocked_hours;
	
	@Column(name="Overtime_Hours")
	private float overtime_hours;
	
	@Column(name="department-name")
	private String department_name;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="designation-name")
	private String designation_name;
	
	@Column(name="organization-name")
	private String organization_name;
	
	@Column(name="grade-name")
	private String grade_name;
	
	@Column(name="section-name")
	private String section_name;
	
	@Column(name="category-name")
	private String category_name;
	
	@Column(name="branch-name")
	private String branch_name;
	
	@Column(name="Cost Per Hour")
	private float cost_per_hour;
	
	@Column(name="Cost Incurred")
	private float cost_incurred;
	
	@Column(name="ProjectID")
	private String project_id;
	
	@Column(name="max-end-date")
	private LocalDate max_end_date;
	
	@Column(name="Project Status")
	private String project_status;
	
	@Column(name="HasProjectStarted")
	private String has_project_started;
	
	@Column(name="Active Project")
	private float active_project;
	
	@Column(name="Created Datetime")
	private LocalDateTime  created_date_time;
	
	@Column(name="Start Date Time")
	private LocalDateTime start_date_time;
	
	@Column(name="End Date Time")
	private LocalDateTime  end_date_time;
	
	@Column(name="ProcessDate")
	private String process_date;
	
	@Column(name="FHSHS")
	private String fhshs;
	
	@Column(name="Day")
	private String day;
	
	@Column(name="Overtime-Percent")
	private String overtime_percent;
}
