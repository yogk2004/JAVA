import java.util.Scanner;

public class Practice_Set_01_Problem_01 {
    public static void main(String[] args) {
        System.out.println("Enter five numbers: ");
        Scanner temp = new Scanner(System.in);
        int num1 = temp.nextInt();
        int num2 = temp.nextInt();
        int num3 = temp.nextInt();
        int num4 = temp.nextInt();
        int num5 = temp.nextInt();

        System.out.println("The Average Value of the number is: "+((num1+num2+num3+num4+num5)/5));
    }
}
