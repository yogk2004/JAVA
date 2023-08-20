import java.util.Scanner;

public class Practice_Set_07_Problem_02_08 {
    static void pattern_printing(int size){
        for(int i = 1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern_printing2(int size){
        if (size>0){
            pattern_printing2(size - 1);
            for (int i = 0; i < size; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of the pattern: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Pattern printed by iterative approach: ");
        pattern_printing(size);
        System.out.println("Pattern printed by recursive approach: ");
        pattern_printing2(size);
    }
}
