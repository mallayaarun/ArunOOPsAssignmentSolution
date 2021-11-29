package com.greatlearning.service;
import com.greatlearning.model.*;

// HrDepartment
public class HrDepartment extends SuperDepartment
	{
		String departmentName;
		String getTodaysWork;
		String getWorkDeadline;
		String doActivity;
		

		public String departmentName()
		{
			return"Hr Department ";
		}
		public String getTodaysWork()
		{
			return"Fill today’s timesheet and mark your attendance";
		}
		public String getWorkDeadline()
		{
			return"Complete by EOD";
		}
		public String doActivity()
		{
			return"Team Lunch";
		}
	}