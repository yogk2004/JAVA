import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        System.out.println("Enter marks of 5 subjects (out off 100): ");
        Scanner temp = new Scanner(System.in);
        int marks1 = temp.nextInt();
        int marks2 = temp.nextInt();
        int marks3 = temp.nextInt();
        int marks4 = temp.nextInt();
        int marks5 = temp.nextInt();

        System.out.println("Percentage of the student: "+((marks1+marks2+marks3+marks4+marks5)/5));
    }
}
