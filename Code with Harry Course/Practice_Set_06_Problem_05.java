public class Practice_Set_06_Problem_05 {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5};
//        int [] rev_arr={0,0,0,0,0};
//        for(int i=0;i<arr.length;i++){
//            rev_arr[i] = arr[arr.length-i-1];
//            System.out.print(rev_arr[i]+" ");
        int [] simple_arr = {1,2,3,4,5,6,7};
        int temp;
        int div = simple_arr.length/2;
        for(int i = 0;i<div;i++){
            temp=simple_arr[i];
            simple_arr[i]=simple_arr[simple_arr.length-i-1];
            simple_arr[simple_arr.length-i-1]=temp;
        }
        for(int elements: simple_arr){
            System.out.print(elements+" ");
        }
    }
}
