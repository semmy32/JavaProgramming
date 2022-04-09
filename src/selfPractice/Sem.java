package selfPractice;

public class Sem {
    public static void main(String[] args) {
        int count=0;
        for (int a = 0; a < 4; a++) {
            if(a==3)
                continue;
            for(int b=a+1;b<5;b++){
                count++;
                if(b==3)
                    break;
            }
            
        }
        System.out.println(count);
    }
}
