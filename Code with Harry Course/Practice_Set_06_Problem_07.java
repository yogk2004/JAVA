public class Practice_Set_06_Problem_07 {
            public static void main(String[] args) {
                int[] arr = {155, 234, 3, 4, 1};
                int max_num = arr[0]; //int max_num = Integer.MAX_VALUE;
                for (int element : arr) {
                    if (max_num > element) {
                        max_num = element;
                    }
                }
                System.out.println(max_num);
    }
}
