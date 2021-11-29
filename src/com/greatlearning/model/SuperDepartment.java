package com.greatlearning.model;

public class SuperDepartment 
{
	// Initializing the variables for SuperDepartment superclass
	String departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	String isTodayAHoliday;

	// Call functions
	public String departmentName()
	{
		return"Super Department";
	}
	public String getTodaysWork()
	{
		return"No Work as of now";
	}
	public String getWorkDeadline()
	{
		return"Nil";
	}
	public String isTodayAHoliday()
	{
		return"Today is not a holiday";
	}
}