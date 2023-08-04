import java.util.Scanner;

public class Practice_Set_03_Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.indexOf("  ")!=-1){
            System.out.println("The String has double spacing in between them.");
        }else{
            System.out.println("The String has no double spacing.");
        }
        if (str.indexOf("   ")!=-1){
            System.out.println("The String has triple spacing in between them.");
        }else{
            System.out.println("The String has no triple spacing.");
        }
    }
}
