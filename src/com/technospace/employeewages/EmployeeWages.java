package com.technospace.employeewages;

import java.util.Random;

public class EmployeeWages {


				int attendance;
				int duty_type ;
				int monthly_hr = 0;
				int monthly_day = 1;
				double daily_wages = 0;
				double monthly_wage = 0;
				
				Random random = new Random();
				
				public void showPresenty(String empStatus) {
					System.out.println("Employee is "+empStatus);
				}
				
				public void calculateWage(String presenty, int hr) {
					System.out.println("Employee is "+presenty);
					daily_wages = Constants.WAGE_PER_HR * hr;
					monthly_hr = monthly_hr + hr;
				}
				
				public void EmployeeWage() {
					daily_wages = 0;
					attendance = random.nextInt(2);
					System.out.println("Attendance :"+attendance);
					
					if(attendance == Constants.ABSENT)
					{
						showPresenty("Absent");
					}	else {
						showPresenty("Present");
						
						duty_type = random.nextInt(2);
						switch(duty_type)
						{
							case Constants.PART_TIME:
								calculateWage("Part Time",Constants.PART_TIME_HR);
								break;
								
							case Constants.FULL_TIME:
								calculateWage("Full Time",Constants.FULL_TIME_HR);
									break;
						}
					}
						System.out.println("Daily Wages :"+daily_wages); 
						monthly_wage = monthly_wage +daily_wages;
						System.out.println("################################");
						monthly_day++;
			}
	
	

	public static void main(String[] args){
					 /*
					 * Welcome message for user
					 */
					System.out.println("Welcome To Employee Wage Computation Program");
			
					EmployeeWages employeeWages = new EmployeeWages();
				
					/**
					 * using while loop for checking the monthly hours and days condition
					 */
					while(employeeWages.monthly_hr < 100 && employeeWages.monthly_day != 21)
					{
						System.out.println("Days :"+employeeWages.monthly_day+"   Total Hour :"+employeeWages.monthly_hr);
						employeeWages.EmployeeWage();
					}
					System.out.println("Monthly Wages :"+employeeWages.monthly_wage);
				
		}
}
