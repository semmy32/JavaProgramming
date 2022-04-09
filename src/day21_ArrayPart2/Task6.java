package day21_ArrayPart2;

public class Task6 {
    public static void main(String[] args) {
      String[] str={"anna", "level", "kayak","java", "around"};

        int count=0;
        for (int j = 0; j< str.length ; j++) {
            String rev="";
            for (int i = str[j].length()-1; i >=0 ; i--) {
                rev+=str[j].charAt(i);
            }
            if(str[j].equals(rev)){
                count++;
            }

        }
        System.out.println(count);

    }
}

  /*  4. write a program that can count how many palindromes in an array of string
            Ex:
            {"anna", "level", "Java"};

            output:
            2

   */