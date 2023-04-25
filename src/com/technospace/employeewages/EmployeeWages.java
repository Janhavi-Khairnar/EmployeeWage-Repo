package com.technospace.employeewages;

import java.util.Random;

public class EmployeeWages {

	public static void main(String[] args) {

		/*
		 * Welcome message for user
		 */
		System.out.println("Welcome To Employee Wage Computation Program");
		
		/*
		 * Using variables for checking the employee is present or
		 * absent.
		 */
		int attendance;
		final int ABSENT = 0;
		
		Random random = new Random();
		attendance = random.nextInt(2);
		
		if(attendance == ABSENT)
		{
			System.out.println("Employee is absent.");
		}	else{
			System.out.println("Employee is present.");
		}
		
		
	}

}
