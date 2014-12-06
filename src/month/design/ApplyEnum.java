package month.design;

public class ApplyEnum {

     public enum Month{
         January,
         February,
         March,
         April,
         May,
         June,
         July,
         August,
         September,
         October,
         November,
         December
     }
     
    
     private Month month;
     
     public ApplyEnum(){
         month = Month.January;
     }
     
     public  void setMonth(Month month){
         this.month = month;
     }
     
     public String toString(){
         
         switch ( this.month){
            
             case January:
             case February:
                 return "It's cold";
             case May:
             case June:
             case July:
            	 return "It's hot";
             case August:
            	 return "My fav month";
             case September:
             case October:
             case November:
             case December:
             
             default:
                 return "Its ok!";
                       
         }
     }
    
	/**
	 * Please design the following Feature in java.
	 */
	public static void main(String[] args) {
		/*
		 * Create an Enum called Month,then create a class to use that Month Enum where you
		 * will implement a method using switch...case. Once the whole use able process is done,
		 * create an object in this main method to demonstrate the Enum feature in java.
		 */
            //Create the object
            ApplyEnum object = new ApplyEnum();
            
            System.out.println(object);
            
            //Change the month
            object.setMonth(Month.July);
            
            System.out.println(object);
            
            //Change the month
            object.setMonth(Month.October);
            
            System.out.println(object);
            

	}

}
