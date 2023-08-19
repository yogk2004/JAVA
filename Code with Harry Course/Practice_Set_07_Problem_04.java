import java.util.Scanner;

public class Practice_Set_07_Problem_04 {
    static void pattern_printing(int size){
        for(int i = size;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of the pattern: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        pattern_printing(size);
    }
}
