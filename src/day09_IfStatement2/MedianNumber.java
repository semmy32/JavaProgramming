package day09_IfStatement2;

public class MedianNumber {
    public static void main(String[] args) {

        int a=70,
         b= 55,
         c= 990;
        boolean aIsMedian = (a<c && b<a) || (c<a && a<b);
        boolean bIsMedian = (a<b && b<c) || (c<b && b<a);
        boolean cIsMedian = (b<c && c<a) || (a<c && c<b); // or we can write as (!aIsMedian && !bIsMedian)
        if(aIsMedian){
            System.out.println(a + " is median number ");}
        if(bIsMedian){
            System.out.println(b+ " is median number ");}
        if(cIsMedian){
            System.out.println(c + " is median number ");
        }







    }
}
/*Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
*/