package employee.info.system;

public class EmployeeInfo extends NewsEmployee implements Employee{
	
	 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to CnnEmployee class to apply all the fields and attributes.
	 * 
	 * Important: YOU MUST USE the 
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 */

		/*
		 * declare few static and final fields and some non-static fields
		 */
		static String companyName;
		
	        //The type is used for salary
	        private int type;
	        
		/*
		 * You must implement the logic for below 2 methods and 
		 * following 2 methods are prototype as well for other methods need to be design,
		 * as you will come up with the new ideas.
		 */
		
		/*
		 * you must have multiple constructor.
		 * Must implement below constructor.
		 */
		public EmployeeInfo(int employeeId){
			
	        this.name = "";
	        this.id = employeeId;
	        this.type = 1;
	        this.isRetired = false;
	        this.onVacation = false;
			
		}
	    public EmployeeInfo(String name, int employeeId){
	    	
	        this.name = name;
	        this.id = employeeId;
	        this.type = 1;
	        this.isRetired = false;
	        this.onVacation = false;
			
		}
		
		/*
		 * This methods should calculate Employee bonus based on salary and performanc
		 * Then it will return the total yearly bonus. So you need to implement the logic.
		 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
		 * You can set arbitrary number for performance.
		 * So you probably need to send 2 arguments.
		 * 
		 */
		public static int calculateEmployeBonus(int salary, int performance){
	                double calc=0;
	                
	                //Above 5 is 10 %, above 2 is 8%
	                if (performance>5){
	                    calc = salary * .1f;
	                } else if (performance >2){
	                    calc = salary * .08f;
	                }
	                
			return (int)calc;
		}
		
		/*
		 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
		 * Then it will return the total pension. So you need to implement the logic.
		 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
		 * So you probably need to send 2 arguments.
		 * 
		 */
		public static int calculateEmployePension(int salary, int years){
			double percent = years * 0.05;
	                return (int)(salary*percent);
		}
	        
	        //Declare a promote method
	        public void promote(){
	            this.type++;
	            if (type>4){
	                //Needs to retire
	                this.isRetired = true;
	            }
	        }

	        //This one comes from NewsEmployee and must be written in here
	    @Override
	    public String toString() {
	        String ret = "ID: "+this.id+"\nNAME: "+this.name+"\nRETIRED: ";
	        if (this.isRetired) ret+="YES";
	        else ret+="NO";
	        ret+="\nON VACATIONS: ";
	        if (this.onVacation) ret+="YES";
	        else ret+="NO";
	        return ret;
	    }
	    
	    //The methods from the interface

	    @Override
	    public int employeeId() {
	        return this.id;
	    }

	    @Override
	    public String employeeName() {
	        return this.name;
	    }

	    @Override
	    public void assignDepartment() {
	        
	        this.department = "News";
	    }

	    @Override
	    public int calculateSalary() {
	        //If its retired, no salary
	        if (this.isRetired) return 0;
	        //Otherwise, the level defines the figures on the paycheck!
	        return 10000*(int)Math.pow(10, this.type);
	    }

	    @Override
	    public void benefitLayout() {
	        if (this.isRetired) System.out.println("No benefits");
	        else
	        switch(this.type){
	            
	            case 1:
	                System.out.println("Basic Benefits");
	                break;
	            case 2:
	            case 3:
	            case 4:
	                System.out.println("Full Benefits");
	                break;
	            default:
	                System.out.println("No benefits");
	        }
	    }

	    @Override
	    public void onVacation(boolean vacation) {
	        this.onVacation = vacation;
	    }

	    @Override
	    public boolean isRetired() {
	        return this.isRetired;
	    }
		//public void promote() {
			// TODO Auto-generated method stub
			
		}
	
