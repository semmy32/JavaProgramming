package day30_CustomClasses;

public class Student {
   public String name;
   public char gender;
   public int age;
   public int ID;
   public char grade;

    public void setInfo(String name, char gender, int age, int ID, char grade ){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.ID=ID;
        this.grade=grade;

    }
   //right click, select generate-> click constructor, select all then OK THIS WAY WE CREATE SET INFO METHOD
  // Then u change the String to void setInfo


    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }
    public void code(){
        System.out.println(name+ " is coding");}
    public void sleep(){
        System.out.println(name+ " is sleeping");}
}
