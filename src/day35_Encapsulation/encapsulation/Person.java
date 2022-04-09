package day35_Encapsulation.encapsulation;

public class Person {
   private String name;
   private int age;

   public String getName(){
       return name;
   }   //ALWAYS GETTER AND SETTER HAVE PUBLIC ACCESS MODIFIER

   public void setName(String name){
       if(name.isEmpty()){
           System.err.println("Invalid name "+name);
           System.exit(0);
       }
       this.name=name;
   }  //return type is void bcs there is no return

   public int getAge(){
       return age;
   }   //GETTER AND SETTER ARE INSTANT METHODS!

   public void setAge(int age){
       if(age<=0 || age>150){
           System.err.println("Invalid age "+age);
           System.exit(0);
       }
       this.age=age;
   }



}
