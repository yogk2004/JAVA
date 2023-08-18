public class Practice_Set_06_Problem_03 {
    public static void main(String[] args) {
        float [] marks = {45.5f,68f,95f,54f};
        float sum = 0.0f;
        for(float element : marks){
            sum += element;
        }
        float avg = sum/((marks.length));
        System.out.println("The average marks from the array is: "+avg);
    }
}
