public class HarvardLawyer extends Lawyer {
	

        public String getTitle() {
            return "Harvard Lawyer";
        }
        
    	//Getters
        public double getSalary() {
            double getSalary = super.getSalary();
            return getSalary + (getSalary*.20);
        }
        public int getVacationDays() {
            int getVacationDays = super.getVacationDays();
            return getVacationDays + 3 ;
        }
        public String getVacationForm() {
            String getVacationForm = super.getVacationForm();
            return getVacationForm + getVacationForm + getVacationForm ;
        }
}