package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

     Offer offer1= new Offer();
      offer1.setInfo("London", "Amazon", "SDET", 125000, true, true, true, true);
        //WFH: work from home PTO:

        Offer offer2=new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 100000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
        Offer[] myOffers= {offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer> fullTimeOffers= new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);

        System.out.println(fullTimeOffers.size());
        ArrayList<Offer> localOffer= new ArrayList<>(Arrays.asList(myOffers));
        localOffer.removeIf(p-> !(p.location.equals("London") || p.location.equals("CA")));
      System.out.println(localOffer.size());

      for (Offer each : localOffer) {
        System.out.println(each.companyName+ " : "+ each.salary);

      }


    }
}
