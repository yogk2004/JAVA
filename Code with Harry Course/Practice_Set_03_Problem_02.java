import java.util.Scanner;

public class Practice_Set_03_Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str.replace(" ","_");
        System.out.println(str2);
    }
}
