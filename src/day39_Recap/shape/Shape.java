package day39_Recap.shape;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name can not be null");
            System.exit(1); //1 means something went wrong, 0 means nothing went wrong.
        }
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {  //we modify constructor writing this.name as setName(name)
       setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }



}
