import java.util.Scanner;

public class Practice_Set_04_Problem_04 {
    public static void main(String[] args) {
        System.out.print("Enter the Day Number: ");
        Scanner sc = new Scanner(System.in);
        int day_num = sc.nextInt();
        switch (day_num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
