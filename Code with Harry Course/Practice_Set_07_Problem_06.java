import java.util.Scanner;

public class Practice_Set_07_Problem_06 {
    static void avg_value(int ...numbers){
        int sum=0;
        int count=0;
        for(int num: numbers){
            sum+=num;
            count+=1;
        }
        System.out.println("The average value of the given numbers is: "+sum/count);
    }
    public static void main(String[] args) {
        avg_value(5,5,5,5);
    }
}
