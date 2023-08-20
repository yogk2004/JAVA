import java.util.Scanner;

public class Practice_Set_07_Problem_05 {
    static int print_terms(int n){
        if(n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }// Here we can write above to if/else-if statement as:
        // if (n==1 || n==2){
        // return n-1;
        // }
        else{
            return print_terms(n-1)+print_terms(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to print n number of terms of Fibonacci Sequence: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" term of the Fibonacci Series: "+print_terms(i));
        }
    }
}
