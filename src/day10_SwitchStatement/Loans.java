package day10_SwitchStatement;

public class Loans {
    public static void main(String[] args) {

        int salary= 50000;
        int creditScore= 800;
        String isEligible= (salary>60000 && creditScore>650)? "Loan Approved" :"Loan denied!:(";

        System.out.println("Are you eligible for loan: \n"+ isEligible);


    }


}
/*Create a class called Loans, Given two variables salary and credit score,
use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.


 */