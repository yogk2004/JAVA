import java.util.Scanner;

public class Practice_Set_03_Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>",name);
        System.out.println(letter);
    }
}
