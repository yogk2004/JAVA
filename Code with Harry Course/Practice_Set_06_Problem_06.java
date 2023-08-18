public class Practice_Set_06_Problem_06 {
    public static void main(String[] args) {
        int [] arr={1,234,3,4,5};
        int max_num = Integer.MIN_VALUE;
        for(int element: arr){
            if (max_num<element){
                max_num = element;
            }
        }
        System.out.println(max_num);
    }
}
