package day33_Statics;

public class Employee {

    public String name;// if I write public static String name; I can assign just one name for all employees.
    public double salary;

    public static boolean isHuman;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
