import java.util.Scanner;

public class Practice_Set_01_Problem_03 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner name_temp = new Scanner(System.in);
        String name = name_temp.nextLine();
        System.out.println("Hello "+ name + ", have a good day.");
    }
}
