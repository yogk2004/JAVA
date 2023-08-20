import java.util.Scanner;

public class Practice_Set_07_Problem_09 {
    static int convert(int celsius){
        return (celsius * 9/5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value of the temperature in celsius: ");
        int celsius = sc.nextInt();
        int fahrenheit = convert(celsius);
        System.out.println(fahrenheit+"°F");
    }
}
