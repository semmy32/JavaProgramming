package day22_MultiDimensionalArray;

import java.util.Scanner;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        int max=0;
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
                if( max< arr[i][j]){
                    max= arr[i][j];
                }

            }//end for cols

        }//end for rows

        //TODO write your code below
        System.out.println(max);



    }
}
