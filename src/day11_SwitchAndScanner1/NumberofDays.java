package day11_SwitchAndScanner1;

public class NumberofDays {
    public static void main(String[] args) {
       int months= 8;
       String days="";
       if(months>=1 && months<=12){
           switch (months){
               case 2:
                   days=" have 28 days.";
                   break;
               case 4: case 6: case 9: case 11:
                   days=" have 30 days.";
                   break;
               default:
                   days= " have 31 days.";

           }
       }

        System.out.println(months+". month "+ days);

    }
}
/*NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}

 */