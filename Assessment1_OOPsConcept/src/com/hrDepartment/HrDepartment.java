package com.hrDepartment;

import com.superDepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	
	public HrDepartment() {
		super();
	}
	
	public String departmentName(){
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	
	public String doActivity(){
		return "team Lunch";
	}

}
