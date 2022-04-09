package day37_Inheritance.scrumTask;

public class Employee extends Person{ //employee IS a person

    public String jobTitle, companyName;
    public double salary;
    public int ID;

    public Employee(String name, int age, char gender, String jobTitle, String companyName, double salary, int ID) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.ID = ID;
    }

    public void work(){
        System.out.println(jobTitle+ " "+name+ " is working");

    }

    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", ID=" + ID +
                '}';
    }
}
