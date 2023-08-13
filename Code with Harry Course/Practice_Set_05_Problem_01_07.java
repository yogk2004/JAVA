import java.util.Scanner;

public class Practice_Set_05_Problem_01_07 {
    public static void main(String[] args) {
        System.out.print("Enter the size of the pattern: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Question 7:
        /*for (int i = 0;i<n;i++){
            if (i!=0) {
                System.out.println();
            }
            for (int j = n-i; j != 0; j--){
                System.out.print("*");
            }
        }*/
        int i = 0;
        while(i<n) {
            if (i != 0) {
                System.out.println();
            }
            int j = n - i;
            while (j != 0) {
                System.out.print("*");
                j--;
            }
            i++;
        }
    }
}
