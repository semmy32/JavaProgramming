package day21_ArrayPart2;

public class Task8 {
    public static void main(String[] args) {
       String [] str={"java", "Phyton","java", "phyton", "C++", "phyton"} ;
       int javaCount=0;
       int phytonCount=0;
        for (String each : str) {
            if(each.equals("java")){
                javaCount++;
            }else if(each.equals("phyton")){
                phytonCount++;
            }

        }
        System.out.println("phytonCount = " + phytonCount);
        System.out.println("javaCount = " + javaCount);



    }
}
//Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
