package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {


    public String PO, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devs = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }
    public void addTester(Tester tester){testersList.add(tester);}
    public void addTesters( Tester [] testers ){ testersList.addAll(Arrays.asList(testers));}
    public void addTDeveloper(Developer developer){
        devs.add(developer);
    }
    public void addDevelopers( Developer [] developers){ devs.addAll(Arrays.asList(developers));}
    public  void removeTester(int employeeID){testersList.removeIf(p-> p.employeeID== employeeID);}
    public  void removeDeveloper(int employeeID){devs.removeIf(p-> p.employeeID== employeeID);}

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of devs=" + devs.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}

