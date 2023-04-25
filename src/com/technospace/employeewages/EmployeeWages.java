package com.technospace.employeewages;

import java.util.Random;

public class EmployeeWages {

	public static void main(String[] args) {

		/*
		 * Welcome message for user
		 */
		System.out.println("Welcome To Employee Wage Computation Program");
		
		/*
		 * Variables
		 * attendance : checking employee is present or absent.
		 * daily_ wages : checking how much money the employee gets daily.
		 * WAGE_PER_HR : Using to check per hour employee's wage
		 * FULL_DAY_HR : Full Day duty hour of Employee 
		 * PART_TIME_HR : Part Day duty hour of Employee 
		 */
		
		int attendance;
		int duty_type;
		double daily_wages = 0;
		final int ABSENT = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int PART_TIME_DUTY = 0;
		
		Random random = new Random();
		attendance = random.nextInt(2);
		
		if(attendance == ABSENT)
		{
			System.out.println("Employee is absent.");
		}	else{
			System.out.println("Employee is present.");
			duty_type = random.nextInt(2);
			if(duty_type == PART_TIME_DUTY)
			{
				System.out.println("Employee is part time.");
				daily_wages = WAGE_PER_HR * PART_TIME_HR;
			}	else{
				System.out.println("Employee is full time.");
				daily_wages = WAGE_PER_HR * FULL_TIME_HR;
			}
		}
		
		System.out.println("Daily Wages :$"+daily_wages);
		
	}

}
