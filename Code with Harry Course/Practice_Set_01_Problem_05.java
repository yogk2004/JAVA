import java.util.Scanner;

public class Practice_Set_01_Problem_05 {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("The number entered is a Integer: "+sc.hasNextInt());
        // "hasNextInt()" operator helps to check the number entered is a integer or not.
    }
}
