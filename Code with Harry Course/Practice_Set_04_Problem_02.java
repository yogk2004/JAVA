import java.util.Scanner;

public class Practice_Set_04_Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total marks of each paper: ");
        int total_marks = sc.nextInt();
        System.out.print("Enter the marks obtained in three subjects: ");
        float marks1 = sc.nextFloat();
        float marks2 = sc.nextFloat();
        float marks3 = sc.nextFloat();
        if (marks1 / total_marks < 0.33 || marks2 / total_marks < 0.33 || marks3 / total_marks < 0.33) {
            System.out.println("You failed to pass subject cutoff!");
            if ((marks1 + marks2 + marks3) / (3 * total_marks) < 0.4) {
                System.out.println("You failed to pass the total cutoff!");}
        }else if ((marks1 + marks2 + marks3) / (3 * total_marks) < 0.4) {
            System.out.println("You failed to pass the total cutoff!");
        } else {
            System.out.println("Congratulations! You passed!");
        }
    }
}
