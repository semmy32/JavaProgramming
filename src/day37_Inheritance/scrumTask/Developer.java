package day37_Inheritance.scrumTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String jobTitle, String companyName, double salary, int ID) {
        super(name, age, gender, jobTitle, companyName, salary, ID);
    }

    public void fixBug(){
        System.out.println(jobTitle+" "+name+ " is fixing bugs");
    }



}
