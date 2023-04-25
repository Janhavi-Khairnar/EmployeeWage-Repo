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
		double monthly_wage = 0;
		int monthly_hr = 0;
		int monthly_day = 1;
	
		
		Random random = new Random();
		
		while(monthly_hr < 100 && monthly_day != 21)
		{
			System.out.println("Days :"+monthly_day+"    Hour :"+monthly_hr);
			daily_wages = 0;
			attendance = random.nextInt(2);
			System.out.println("Attendance :"+attendance);
			
			if(attendance == Constants.ABSENT)
			{
				System.out.println("Employee is absent.");
			}	else{
				System.out.println("Employee is present.");
				
				duty_type = random.nextInt(2);
				switch(duty_type)
				{
					case Constants.PART_TIME:
					System.out.println("Employee is part time.");
					daily_wages = Constants.WAGE_PER_HR * Constants.PART_TIME_HR;
					monthly_hr = monthly_hr + Constants.PART_TIME_HR;
					break;
					
					case Constants.FULL_TIME:
					System.out.println("Employee is full time.");
					daily_wages = Constants.WAGE_PER_HR * Constants.FULL_TIME_HR;
					monthly_hr = monthly_hr + Constants.FULL_TIME_HR;
					break;
				}
			}
			
			System.out.println("Daily Wages :$"+daily_wages);
			monthly_wage = monthly_wage + daily_wages;
			System.out.println("##########################");
			monthly_day++;
		}
			System.out.println("Monthly Wages =$"+monthly_wage);
	}
	
}
