package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {
        Tester tester1= new Tester("Ali",12345, "SDET", 48000);
        Tester tester2= new Tester("Aliye",43,"QA",142000);
        Tester tester3=new Tester("Alex",44,"SE",135000);
        Tester tester4= new Tester("Lala", 23,"SDET",115000);

        Tester [] testers= {tester2,tester3,tester4};

        Developer developer1= new Developer("Selin", 132, "Java Developer", 150000);
        Developer developer2= new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4= new Developer("Sinem", 13, "Senior Developer",200000);

        Developer [] developers= {developer2,developer3,developer4};

        ScrumTeam scrum= new ScrumTeam("Bahar", "Naciye", "Hanife",14);
        scrum.addTester(tester1);
        scrum.addTDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        for(Tester eachTester: scrum.testersList){
            System.out.println(eachTester.name+ " :"+ eachTester.salary);
        }
        System.out.println("------------------------------------------------------");


        for (Developer eachDeveloper : scrum.devs){
            System.out.println(eachDeveloper.name+ " : "+ eachDeveloper.salary);
        }
        scrum.removeTester(44);
        System.out.println(scrum);



    }
}
