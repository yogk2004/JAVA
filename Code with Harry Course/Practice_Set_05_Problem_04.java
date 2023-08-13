import java.util.Scanner;

public class Practice_Set_05_Problem_04 {
    public static void main(String[] args) {
        System.out.print("Enter the number whose multiplication table is to be written in reverse order: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 10;i>0;i--){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
