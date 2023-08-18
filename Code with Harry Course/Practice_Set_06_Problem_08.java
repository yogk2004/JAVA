public class Practice_Set_06_Problem_08 {
    public static void main(String[] args) {
        boolean sorted_Status = true;
        int [] arr = {12, 124, 127, 341, 425, 5324, 55556};
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    sorted_Status = false;
                    break;
                }
            }
        }
        if (sorted_Status){
            System.out.println("The Array is sorted");
        }else {
            System.out.println("The Array is not sorted");
        }
    }
}
