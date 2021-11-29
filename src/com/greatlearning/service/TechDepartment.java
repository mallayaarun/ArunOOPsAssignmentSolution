package com.greatlearning.service;
import com.greatlearning.model.*;

// TechDepartment
public class TechDepartment extends SuperDepartment
	{
		String departmentName;
		String getTodaysWork;
		String getWorkDeadline;
		String getTechStackInformation;
	
		public String departmentName()
		{
			return"Tech Department";
		}
		public String getTodaysWork()
		{
			return "Complete coding of module 1";
		}
		public String getWorkDeadline()
		{
			return "Complete by EOD";
		}
		public String getTechStackInformation()
		{
			return"core Java";
		}
	}