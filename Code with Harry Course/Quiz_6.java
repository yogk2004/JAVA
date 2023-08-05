import java.util.Scanner;

public class Quiz_6 {
    public static void main(String[] args) {
        System.out.print("Enter number to print natural number upto it in reverse order: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i>0;i--){
            System.out.println(i);
        }
    }
}
