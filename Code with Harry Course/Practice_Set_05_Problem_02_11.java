import java.util.Scanner;

public class Practice_Set_05_Problem_02_11 {
    public static void main(String[] args) {
        System.out.print("Enter number of even numbers to sum: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum+=2*n;
            i++;
        }
        System.out.println("The sum of "+n+" even numbers is: "+sum);

//      Question 11:
/*      System.out.print("Enter number of even numbers to sum: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum+=2*i;
        }
        System.out.println("The sum of "+n+" even numbers is: "+sum);*/
    }
}
