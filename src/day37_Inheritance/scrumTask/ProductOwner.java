package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, String companyName, double salary, int ID) {
        super(name, age, gender, "Product owner", companyName, salary, ID);
    }

    public void reqGathering(){
        System.out.println(name+" is gathering requirement");
    }
}
