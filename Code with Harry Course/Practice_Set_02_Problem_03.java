import java.util.Scanner;

public class Practice_Set_02_Problem_03 {
    public static void main(String[] args) {
        double given_num = 56;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        double enter_number = sc.nextDouble();

        System.out.println("Entered number is greater than the given number: "+(enter_number>given_num));
    }
}