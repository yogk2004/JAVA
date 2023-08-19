import java.util.Scanner;

public class Practice_Set_07_Problem_03_10 {
    //Question 3
    static int sum_func(int num){
        if (num==1){
            return 1;
        }else{
            return (num+sum_func(num-1));
        }
    }
    //Question 10
    static int sum_func2(int num){
        int sum = 0;
        for(int i = 1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of integer to calculate its sum upto it: ");
        int integer = sc.nextInt();
        int result = sum_func(integer);
        int result2 = sum_func2(integer);
        System.out.println("The sum of the "+integer+" natural numbers is (Using recursive approach): "+result);
        System.out.println("The sum of the "+integer+" natural numbers is (Using the iterative approach): "+result2);
    }
}
