import java.util.Scanner;

public class Practice_Set_04_Problem_03 {
    public static void main(String[] args) {
        System.out.print("Enter your income (in terms of Lakhs. Ex: 5.6 which means 5.6 Lakhs): ");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        if (income<2.5){
            System.out.println("No income tax to be paid!");
        }else if (income<5.0){
            System.out.println("Your income tax to be paid is: "+((income*5)/100)+" Lakhs");
        }else if (income<10.0){
            System.out.println("Your income tax to be paid is: "+((income*2)/10)+" Lakhs");
        }else{
            System.out.println("Your income tax to be paid is: "+((income*3)/10)+" Lakhs");
        }
    }
}
