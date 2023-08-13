import java.util.Scanner;

public class Practice_Set_05_Problem_03 {
    public static void main(String[] args) {
        System.out.print("Enter the number whose multiplication table is to be written: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
