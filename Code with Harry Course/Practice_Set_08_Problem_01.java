import java.util.Scanner;

class Employee1{
    //Defining Properties or Attributes:
    int Salary;
    String Name;
    //Defining Methods
    int getSalary(){
        return Salary;
    }
    String getName(){
        return Name;
    }
    void setName(String input){
        //Do not take input in another class
        //Scanner sc = new Scanner(System.in);
        Name = input;
    }
}

public class Practice_Set_08_Problem_01 {
    public static void main(String[] args) {
        // Making an object for the class we define above
        Scanner obj2 = new Scanner(System.in);
        //Taking inputs for the name
        System.out.print("Enter name: ");
        String name = obj2.nextLine();
        System.out.print("Enter Salary: ");
        int salary = obj2.nextInt();
        Employee1 obj = new Employee1();

        //Calling first method:
        //Initializing other class variable using methods
        obj.setName(name);
        //Initializing other class variable directly
        obj.Salary = salary;

        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }
}