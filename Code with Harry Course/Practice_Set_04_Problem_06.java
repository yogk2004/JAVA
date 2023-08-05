import java.util.Scanner;

public class Practice_Set_04_Problem_06 {
    public static void main(String[] args) {
        System.out.print("Enter the url of the website: ");
        Scanner sc = new Scanner(System.in);
        String web_type = sc.nextLine();
        if(web_type.endsWith(".com")){
            System.out.println("Commercial Website");
        }else if(web_type.endsWith(".org")){
            System.out.println("Organisation Website");
        }else if(web_type.endsWith(".in")){
            System.out.println("Indian Website");
        }
    }
}
