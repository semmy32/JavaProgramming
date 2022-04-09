package day09_NestedIf;

public class EqualNumbers {
    public static void main(String[] args) {

        int num1 = 12,
                num2 = 12,
                num3 = 122;
        String result="";
        if(num1==num2 && num1!=num3){
            result= "n1&n2 are equal";
        } else if (num2==num3 && num1!=num2){
            result="n2&n3 are equal";
        }else if (num3==num1 && num2!=num3) {
            result="print \"n3&n1 are equal";
        }else if(num1==num2 && num2==num3){
            result="all equal";
        } else {result= "none of them are equal";}
        System.out.println(result);








    } }
/*Create a class called EqualNumbers, and write a program that can check the equality of the three given numbers
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal

 */