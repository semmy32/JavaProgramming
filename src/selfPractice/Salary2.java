package selfPractice;

public class Salary2 {
    public static void main(String[] args) {
        int hourlyRate= 50,
                weeklyHours= 40;
        double stateTaxRate= 0.08,
                federalTaxRate= 0.20;

       int salaryBeforeTax = hourlyRate * weeklyHours * 52;
       double stateTax= salaryBeforeTax* stateTaxRate;
       double federalTax= salaryBeforeTax* federalTaxRate;
        double totalTaxPay= stateTax+ federalTax;
       double salaryAfterTax= salaryBeforeTax- totalTaxPay;
        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("totalTaxPay = " + totalTaxPay);
        System.out.println("salaryAfterTax = " + salaryAfterTax);




    }
}/*3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52*/
