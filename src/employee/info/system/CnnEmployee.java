package employee.info.system;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from  EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * 
	 **/
	public static void main(String[] args) {
            
            EmployeeInfo.companyName = "CNN";
            
            //Create an employeeInfo
            EmployeeInfo stuff  = new EmployeeInfo("John Smith",1);
            
            //Use an interface too
            Employee someEmployee = stuff; // Works
            
            System.out.println("SomeEmployee makes "+someEmployee.calculateSalary());
            someEmployee.benefitLayout();
            
            
         
            stuff.promote();
             System.out.println("SomeEmployee makes "+someEmployee.calculateSalary());
            someEmployee.benefitLayout();
            
           
            System.out.println(stuff);
            
            //calculate the Bonus
            int bonus = EmployeeInfo.calculateEmployeBonus(stuff.calculateSalary(), 10);
            System.out.println("Bonus: "+bonus);
           
            
            stuff.promote();
            stuff.promote();
            
            int pension = EmployeeInfo.calculateEmployePension(stuff.calculateSalary(), 30);
            System.out.println("After 30 years of service, wih a salary of "+stuff.calculateSalary()+" pension would be "+pension);
            stuff.promote();
            stuff .promote();
            
            //Is retired?
            if (stuff.isRetired()){
                System.out.println(stuff);
            }
            
            
            

        }
        
}