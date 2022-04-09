package day23_CustomMethods;

public class WarmUpTask1 {
    public static void main(String[] args) {
        nameInitials("Semra", "Genc");
        System.out.println("**********************************************");
        domain("semra.kavasgenc@gmail.com");
        System.out.println("----------------------------------------");
        String[] emails = {"josh@yahoo.com", "semmy@gmail.com", "Ali.Genc@hotmail.com", "Uzaylı_Musti@nasa.com"};
        for (String email : emails) {
            domain(email);
        }
        nameOfMonth(8);
    }

    public static void nameInitials(String firstName, String lastName) {
        String ch1 = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println(ch1);

    }

    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "january" : (number == 2) ? "february" : (number == 3) ? "march" : (number == 4) ? "april"
                    : (number == 5) ? "may" : (number == 6) ? "june" : (number == 7) ? "july"
                    : (number == 8) ? "august" : (number == 9) ? "september" : (number == 10) ? "october" : (number == 11) ? "november" : "december";
        } else {
            name = "Invalid";}
        System.out.println("Month name = "+name);
    }


}