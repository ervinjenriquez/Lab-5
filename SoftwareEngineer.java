public class SoftwareEngineer extends Employee {
       
	//Getters
	public String getTitle() {
		return "Software Engineer";  
	}    
	public int getHours() {
		int getHours = super.getHours(); 
		return getHours + 10;
	}       
	public double getSalary() {  
		double getSalary = super.getSalary();  
		return getSalary +  15000.0;
	}
	public int getVacationDays() {    
		int getVacationDays = super.getVacationDays();    
		return getVacationDays - 5;
	}
    
	
	public String writeCode() {
		return "Coding!";   
	}
    
	public String toString() {
		return (super.toString() + "\n" + writeCode());
        
	}
}
