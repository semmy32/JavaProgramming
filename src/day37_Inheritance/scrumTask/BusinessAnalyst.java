package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, String companyName, double salary, int ID) {
        super(name, age, gender, "Business analyst", companyName, salary, ID);
    }
    public void analyze(){
        System.out.println(name+ " is analyzing the documents");

    }

}
