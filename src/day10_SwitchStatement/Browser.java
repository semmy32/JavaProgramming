package day10_SwitchStatement;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

      String browserName= "Chrome";
      String result= "";
      boolean validBrowser= browserName == "Chrome" || browserName == "Safari" || browserName == "Edge"
              || browserName == "Firefox" || browserName == "Opera";
      if (validBrowser) {
          if (browserName =="Chrome"){
              result= "Chrome Browser is selected";
          }
          else if (browserName== "Edge"){
              result= "Edge Browser is selected";
          } else if(browserName=="Firefox"){
              result= "Firefox Browser is selected";
          }else if (browserName== "Opera"){
              result= "Opera Browser is selected";}
              else {
                  result= "Safari Browser is selected";
          }
      }
      else {
          System.out.println("Invalid Browser Name"); }
        System.out.println(result);

        System.out.println("---------------------------------------");

        if(validBrowser){
        Scanner input= new Scanner(System.in);
            System.out.println("Write browser name");
        browserName=input.next();
        System.out.println(browserName+ " Browser is selected");}
        else {
            System.out.println("Invalid Browser Name");}






    }
}
