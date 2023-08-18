import java.util.Scanner;

public class Practice_Set_06_Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix_1={{1, 2, 3}, {4, 5, 6}};
        int [][] matrix_2 = {{2, 6, 13}, {3, 7, 1}};
        int [][] answer_final = {{0, 0, 0}, {0, 0, 0}};
        for(int i=0;i<matrix_1.length;i++){
            for(int j=0;j<(matrix_1[i]).length;j++){
                answer_final[i][j]=matrix_1[i][j]+matrix_2[i][j];
                System.out.print(answer_final[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
