import java.security.PrivilegedExceptionAction;
import java.util.Scanner;

class rectangle{
    private double length;
    private double breath;
    rectangle(){
        length = 5;
        breath = 6;
    }
    public rectangle(double inputLength,double inputBreath){
        length = inputLength;
        breath = inputBreath;
    }
    void print(){
        System.out.println("The area of the rectangle is: "+length*breath);
        System.out.println("The perimeter of the rectangle is: "+2*(length+breath));
    }
}
public class Practice_Set_09_Problem_04 {
    public static void main(String[] args) {
        // Constructor 1 calling --
        System.out.println("Constructor 1 working: ");
        rectangle obj = new rectangle();
        obj.print();

        System.out.println("");

        //Constructor 2 calling --
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the length of the rectangle: ");
        double inputLength = sc.nextDouble();
        System.out.print("Enter the value of the breath of the rectangle: ");
        double inputBreath = sc.nextDouble();
        rectangle obj2 = new rectangle(inputLength,inputBreath);
        obj2.print();
    }
}
