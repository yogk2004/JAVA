import java.util.Scanner;

public class Quiz_4 {
    public static void main(String[] args) {
        System.out.print("Enter values to print all natural numbers till that number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
