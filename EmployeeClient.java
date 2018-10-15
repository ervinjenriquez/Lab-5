public class EmployeeClient {
    public static void main (String [] args) {
        Employee a = new Lawyer();
        Employee b = new SoftwareEngineer();
        Employee c = new HarvardLawyer();
        
        System.out.println(a + "\n");
        System.out.println(b + "\n");
        System.out.println(c);
    }
    }