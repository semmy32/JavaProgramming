package selfPractice;

import java.util.*;

    public class ArrayDiagonal {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                    {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
            int result = 0;
            int sum1=0;
            int sum2=0;
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(i==j){sum1+=matrix[i][j];
                    }
                }
            }
            for(int k=0; k<3; k++){
                for(int l=2; l>=0; l--){
                    if(k+l==2){
                        sum2+=matrix[k][l];
                    }
                }
            }
            result=sum1-sum2;




            // FINAL PRINT
            System.out.println(Math.abs(result));
        }
    }

