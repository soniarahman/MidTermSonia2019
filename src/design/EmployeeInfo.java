package design;

import java.util.Scanner;

	public abstract class EmployeeInfo implements Employee {

		/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
		 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
		 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
		 * go to FortuneEmployee class to apply all the fields and attributes.
		 *
		 * Important: YOU MUST USE the
		 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
		 * Use all kind of keywords(super,this,static,final........)
		 * Implement Nested class.
		 * Use Exception Handling.
		 *
		 */

		/*
		 * declare few static and final fields and some non-static fields
		 */
		static String companyName;
		String nameOfEmployees;
		int idOfEmployees;
		String departments;
		int salary;
		String benefit;
		int pensions;
		private static int bonus;
		String presents;


		/*
		 * You must implement the logic for below 2 methods and
		 * following 2 methods are prototype as well for other methods need to be design,
		 * as you will come up with the new ideas.
		 */

		/*
		 * you must have multiple constructor.
		 * Must implement below constructor.
		 */
		public EmployeeInfo() {
		}

		public EmployeeInfo(int employeeId) {
			this.idOfEmployees = employeeId;

		}

		public EmployeeInfo(String name, int employeeId) {
			this.nameOfEmployees = name;
			this.idOfEmployees = employeeId;
		}

		public EmployeeInfo(String departments, int salary, String benefit) {
			this.departments = departments;
			this.salary = salary;
			this.benefit = benefit;
		}

		public EmployeeInfo(int salary, String benefit, int pensions, String presents) {
			this.salary = salary;
			this.benefit = benefit;
			this.pensions = pensions;
			this.presents = presents;
		}
		public EmployeeInfo(String nameOfEmployees, int idOfEmployees, String departments, int salary) {
			this.nameOfEmployees = nameOfEmployees;
			this.idOfEmployees = idOfEmployees;
			this.departments = departments;
			this.salary = salary;
		}
		@Override
		public int employeeId () {
			return this.employeeId();
		}

		@Override
		public int employeeName () {
			return this.employeeId();
		}

		@Override
		public void assignDepartment () {
				System.out.println("QA");
			}

		@Override
		public int calculateSalary () {
			return this.salary;
		}

		@Override
		public void benefitLayout () {
			System.out.println("401K");
		}

		@Override
		public int employeePension () {
			return this.pensions;
		}

		@Override
		public int employeeBonus () {
			return this.employeeBonus();
		}

		@Override
		public void employeeOfTheMonthPresent () {
			System.out.println("$500:giftcard");
		}




		/*
		 * This methods should calculate Employee bonus based on salary and performance.
		 * Then it will return the total yearly bonus. So you need to implement the logic.
		 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
		 * You can set arbitrary number for performance.
		 * So you probably need to send 2 arguments.
		 *
		 */
		public static double calculateEmployeeBonus(int salary, int performance) {
			double bonus;
			double performanceBonus = 0;
			if (performance >= 1) {
				bonus = 0.01;
				performanceBonus = salary + (salary * bonus);
			} else if (performance >= 2) {
				bonus = 0.02;
				performanceBonus = salary + (salary * bonus);
			} else if ((performance >= 5)) {
				bonus = 0.05;
				performanceBonus = salary + (salary * bonus);
			}
			return performanceBonus;
		}


			/*
			 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
			 * Then it will return the total pension. So you need to implement the logic.
			 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
			 *
			 */
			public static double calculateEmployeePension (int employmentYears, int salary) {

				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter start date in format (example: May,2015): ");
				String joiningDate = sc.nextLine();
				System.out.println("Please enter today's date in format (example: September,2017): ");
				String todaysDate = sc.nextLine();
				String convertedJoiningDate = DateConversion.convertDate(joiningDate);
				String convertedTodaysDate = DateConversion.convertDate(todaysDate);


				//implement numbers of year from above two dates


				//Calculate pension
				double totalPension = 0;
				double pension;
				if (employmentYears >= 1) {
					pension = 0.05;
					totalPension = salary * pension;
				} else if (employmentYears >= 2) {
					pension = 0.10;
					totalPension = salary * pension;
				}
				return totalPension;
				}



			private static class DateConversion {

				public DateConversion(Months months) {
				}

				public static String convertDate(String date) {
					String[] extractMonth = date.split(",");
					String givenMonth = extractMonth[0];
					int monthDate = whichMonth(givenMonth);
					String actualDate = monthDate + "/" + extractMonth[1];
					return actualDate;
				}

				public static int whichMonth(String givenMonth) {
					Months months = Months.valueOf(givenMonth);
					int date = 0;
					switch (months) {
						case January:
							date = 1;
							break;
						case February:
							date = 2;
							break;
						case March:
							date = 3;
							break;
						case April:
							date = 4;
							break;
						case May:
							date = 5;
							break;
						case June:
							date = 6;
							break;
						case July:
							date = 1;
							break;
						case August:
							date = 1;
							break;
						case September:
							date = 1;
							break;
						case October:
							date = 1;
							break;
						case November:
							date = 1;
							break;
						case December:
							date = 1;
							break;
						default:
							date = 0;
							break;
					}
					return date;

				}
			}
		}



