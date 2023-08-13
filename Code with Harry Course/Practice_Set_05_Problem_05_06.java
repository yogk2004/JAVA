import java.util.Scanner;

public class Practice_Set_05_Problem_05_06 {
    public static void main(String[] args) {
        System.out.print("Enter the number to find its factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 1;
        if(num!=0){
            for (int i = 1; i <= num; i++) {
                ans *= i;
            }
        }
        System.out.println("The factorial of the number is: "+ans);
    }
}
