package day37_Inheritance.scrumTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, String jobTitle, String companyName, double salary, int ID) {
        super(name, age, gender, jobTitle, companyName, salary, ID);
    }
   public void createTicket(){
       System.out.println(jobTitle+" "+name+" is creating ticket ");
   }

}

