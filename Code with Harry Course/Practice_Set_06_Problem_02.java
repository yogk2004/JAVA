import java.util.Scanner;

public class Practice_Set_06_Problem_02 {
    public static void main(String[] args) {
        int [] arr_find = {1,2,3,4,5};
        Scanner temp = new Scanner(System.in);
        boolean Flag = true;
        int num = temp.nextInt();
        for(int i = 0;i<arr_find.length;i++){
            if (num == arr_find[i]){
                System.out.println("Match found! The required number is at "+(i+1)+" position in the array.");
                Flag = false;
                break;
            }
        }
        if (Flag == true){
            System.out.println("The number is not present in the array.");
        }

    }
}
