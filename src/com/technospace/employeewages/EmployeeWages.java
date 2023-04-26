package com.technospace.employeewages;

import java.util.Random;

public class EmployeeWages {


				int attendance;
				int duty_type ;
				int monthly_hr = 0;
				int monthly_day = 1;
				double daily_wages = 0;
				double monthly_wage = 0;
				int working_day_per_month;
				int working_hr_per_month;
				int wage_per_hr;
				String com_name;
				
				Random random = new Random();
				
				
				/**
				 * 
				 * empStatus parameter pass the showPresenty  function and display the employee is present or absent. 
				 */
				public void showPresenty(String empStatus) {
					System.out.println("Employee is "+empStatus);
				}
				
				
				/**
				 * Using presenty parameter to show the employee is part or full time.
				 * hr parameter takes for how many hour per day employee work part or full time.
				 * Passing these two parameters to find the daily wages and monthly wages.
				 */
				public void calculateWage(String presenty, int hr) {
					System.out.println("Employee is "+presenty);
					daily_wages = wage_per_hr * hr;
					monthly_hr = monthly_hr + hr;
				}
				
				
				/**
				 * 
				 * @param com_name : represent the company name.             
				 * @param wage_per_hr : each hour employee gets payment.
				 * @param working_day_per_month : each month how many hour employee works.
				 * @param working_hr_per_month : per month working hour 
				 * 
				 * EmployeeWage function uses for the employee is present or not then it is 
				 * calculated the daily wage and monthly month. In this function we uses the while loop iteration
				 * up to company's requirement.        
				 */
				
				public void EmployeeWage(String com_name, int wage_per_hr, int working_day_per_month, int working_hr_per_month) {
					this.com_name = com_name;
					this.wage_per_hr = wage_per_hr;
					this.working_day_per_month = working_day_per_month;
					this.working_hr_per_month = working_hr_per_month;
					
					System.out.println("***Company Name :"+com_name);
					System.out.println("**Wage Per Hour :"+wage_per_hr);
					System.out.println("**Working Day Per Month :"+working_day_per_month);
					System.out.println("**Working Hr Per Month :"+working_hr_per_month);
					
					
					while(monthly_hr < 100 && monthly_day != 21)
					{
						System.out.println("Days :"+monthly_day+"   Total Hour :"+monthly_hr);
	
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
						System.out.println("________________________________________");
						monthly_day++;
				}
				System.out.println("Monthly Wages :"+monthly_wage);
				System.out.println("##############################################");
				System.out.println("\n\n");
				
}

	/*
	 * Using main function we runs the actual program. Here, we creates the object of EmployeeWages Class
	 * and calls the functions for multiple company.
	 */

	public static void main(String[] args){
					 /*
					 * Welcome message for user
					 */
					System.out.println("Welcome To Employee Wage Computation Program");
			
					
					/**
					 * Here, we creates the three objects for the 3 multiple company.
					 */
					EmployeeWages employeeWages1 = new EmployeeWages();
					employeeWages1.EmployeeWage("TCS",20,22,100);
					
					EmployeeWages employeeWages2 = new EmployeeWages();
					employeeWages2.EmployeeWage("Wipro",20,25,110);
					
					EmployeeWages employeeWages3 = new EmployeeWages();
					employeeWages3.EmployeeWage("Capgemini",18,22,120);
					
			}
}
