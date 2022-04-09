package day33_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Ali",'M',38);
        System.out.println(student1);

        Student student2=new Student("Semra",'F',37,797,'A');
        System.out.println(student2);


        Student [] students= {student1,student2};
        System.out.println(Arrays.toString(students));



    }
}
