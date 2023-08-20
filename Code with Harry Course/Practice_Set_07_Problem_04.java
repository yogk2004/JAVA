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
    static void pattern_printing_rec(int size){
        if (size>0){
            for (int i = 0; i < size; i++) {
                System.out.print("*");
            }
            System.out.println("");
            pattern_printing(size - 1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of the pattern: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Pattern printed from the iterative approach: ");
        pattern_printing(size);
        System.out.println("Pattern printed from the recursive approach: ");
        pattern_printing_rec(size);
    }
}
