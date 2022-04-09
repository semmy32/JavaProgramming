package day35_Encapsulation.encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }



    public void setName(String name) {
        if (name.isEmpty()) {
            System.err.println("Invalid name " + name);
            System.exit(0);
        }
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'M')) {
            System.err.println("Invalid gender " + gender);
            System.exit(0);  //if I want not to set the data, I can use return without error and exit status.
        }
        this.gender=gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        if (age < 16 || age > 90) {
            return;
        }
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Invalid salary " + salary);
            System.exit(0);
        }
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
