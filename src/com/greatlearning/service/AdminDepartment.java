package com.greatlearning.service;
import com.greatlearning.model.*;

// AdminDepartment
public class AdminDepartment extends SuperDepartment
	{
		String departmentName;
		String getTodaysWork;
		String getWorkDeadline;

		public String departmentName()
		{
			return "Admin Department ";
		}
		public String getTodaysWork()
		{
			return "Complete your documents Submission";
		}
		public String getWorkDeadline()
		{
			return "Complete by EOD";
		}
	}