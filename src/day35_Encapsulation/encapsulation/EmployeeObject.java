package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1= new Employee("Sally",'F',32,120000);
        System.out.println(employee1);

        Employee employee2=new Employee("Mat",'M',15,100000);
        System.out.println(employee2);  //bcs of set.age method, this gives '0' for age.
        employee2.setAge(30);
        System.out.println(employee2);

        employee2.setSalary(employee2.getSalary()+40000);
        System.out.println(employee2);




    }
}
