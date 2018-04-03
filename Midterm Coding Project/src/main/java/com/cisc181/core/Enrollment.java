package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID Enrollment;
	private double Grade;
	
	private void Enrollment() {
	}
	
	public void Enrollment(UUID StudentID,UUID SectionID) {
		
			 this.Enrollment = Enrollment;
			}
	

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
		public UUID getStudentID() {
			return StudentID;
		}

		public void setStudentID(UUID studentID) {
			StudentID = studentID;
		}
	

	public UUID getEnrollment() {
		return Enrollment;
	}


	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
	
}
