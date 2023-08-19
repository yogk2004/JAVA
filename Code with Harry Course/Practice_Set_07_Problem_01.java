import java.util.Scanner;

public class Practice_Set_07_Problem_01 {
    static void print_table(int num){
        for(int i = 1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number to print it's table: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print_table(num);
    }
}
