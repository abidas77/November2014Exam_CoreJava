package employee.info.system;

/*
This abstract class represents a news employee
*/
public abstract class NewsEmployee {
    
    
    protected int id;
    protected String name;
    protected String department;
    protected boolean isRetired;
    protected boolean onVacation;
    
    public  final String printEmployeeName(){
        return "The Employee Name is "+name.toUpperCase();
    }
    
    abstract public String toString();
}
