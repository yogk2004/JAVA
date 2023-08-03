import java.util.Scanner;

public class Quiz_1 {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int num1 = S.nextInt();
        int num2 = S.nextInt();
        int num3 = S.nextInt();
        System.out.println("Addition of three numbers: "+(num1+num2+num3));
    }
}
