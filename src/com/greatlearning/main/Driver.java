package com.greatlearning.main;
import com.greatlearning.service.*;
import java.util.*;

public class Driver {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		//Call methods HrDepartment, TechDepartment & AdminDepartment
		System.out.println("Enter the Department which you wish to display its functions:");
		System.out.println("-------------------------------------------------------------");
		System.out.println("1. HrDepartment");
		System.out.println("2. TechDepartment");
		System.out.println("3. AdminDepartment");		
		int dept = sc.nextInt();
		switch(dept)
		{
		case 1:
		{
			HrDepartment hrd = new HrDepartment();
			System.out.println("Welcome to "+hrd.departmentName());
			System.out.println(hrd.getTodaysWork());
			System.out.println(hrd.getWorkDeadline());
			System.out.println(hrd.doActivity());
			System.out.println(hrd.isTodayAHoliday());
			break;
		}
		case 2:
		{
			TechDepartment tech = new TechDepartment();
			System.out.println("Welcome to "+tech.departmentName());
			System.out.println(tech.getTodaysWork());
			System.out.println(tech.getWorkDeadline());
			System.out.println(tech.getTechStackInformation());
			System.out.println(tech.isTodayAHoliday());
			break;
		}
		case 3:
		{
			AdminDepartment admin = new AdminDepartment();
			System.out.println("Welcome to "+admin.departmentName());
			System.out.println(admin.getTodaysWork());
			System.out.println(admin.getWorkDeadline());
			System.out.println(admin.isTodayAHoliday());
			break;
		}
		default:
			System.out.println("Please enter only the numbers listed above");
			return;
		}
	}
}
