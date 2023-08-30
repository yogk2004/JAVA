import java.util.Scanner;

class Employee{
    //Defining Properties or Attributes:
    int Salary;
    String name;
    //Defining Methods
    int getSalary(){
        return Salary;
    }
    String getName(){
        return name;
    }
    void setName(){
        Scanner sc = new Scanner(System.in);
        sc.name = sc.nextLine();
    }
}

public class Practice_Set_08_Problem_01 {
    public static void main(String[] args) {

    }
}
