import java.util.Scanner;

public class Practice_Set_04_Problem_05 {
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%100==0){
            if (year%400==0){
                System.out.println("The year "+year+" is a leap year.");
            }else{
                System.out.println("The year "+year+" is not a leap year.");
            }
        }else if(year%4==0){
            System.out.println("The year "+year+" is a leap year.");
        }else{
            System.out.println("The year "+year+" is not a leap year.");
        }
    }
}
