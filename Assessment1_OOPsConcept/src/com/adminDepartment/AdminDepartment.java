package com.adminDepartment;

import com.superDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	public AdminDepartment() {
		super();
	}

	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your document Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
