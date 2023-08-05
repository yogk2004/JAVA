import java.util.Scanner;

public class Quiz_5 {
    public static void main(String[] args) {
        System.out.print("Enter number of odd numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++ ){
            System.out.println(2*i+1);
        }
    }
}
