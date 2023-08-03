import java.util.Scanner;

public class Practice_Set_01_Problem_04 {
    public static void main(String[] args) {
        System.out.println("Enter value of kilometers: ");
        Scanner kilo_value = new Scanner(System.in);
        double kilometer = kilo_value.nextDouble();
        System.out.println("The conversion to miles is: "+(kilometer/1.609));
    }
}
