public class Employee {
	
	//Getters
    public String getTitle() {
            return "employee";
        }
    public int getHours() {
        return 40;
    }
    public double getSalary() {
        return 40000.0; 
    }
    public int getVacationDays() {
        return 10; //
    }
    public String getVacationForm() {
        return "yellow"; 
    }
    
    //ToString
    public String toString() {
        return (getTitle() +
                "\nSalary: " + getSalary()  +
                "\nHours: " + getHours()  + 
                "\nVacation Days: " + getVacationDays()  +
                "\nVacationForm: " + getVacationForm());
    }
}
