class employee{
    //Defining Attributes
    String name;
    int ID;
    int salary;
    //Defining Functions/ Methods:
    public void printInfo(){
        System.out.println("My ID number is: "+ID);
        System.out.println("My name is: "+name);
        System.out.println("My salary is: "+salary+" LPA");
    }
}

public class OOPs_Practice_Code {
    public static void main(String[] args) {
        // Instantiating a new Employee Object
        employee yogesh = new employee();
        employee john = new employee();

        //Setting attributes for yogesh:
        yogesh.name = "Yogesh Kumar";
        yogesh.ID = 45;
        yogesh.salary = 20;

        //Setting attributes for yogesh:
        john.name = "John Clark";
        john.ID = 56;
        john.salary = 50;

        //Calling the methods for printing the attributes:
        yogesh.printInfo();
        System.out.println("");
        john.printInfo();
    }
}