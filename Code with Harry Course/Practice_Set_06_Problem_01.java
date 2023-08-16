public class Practice_Set_06_Problem_01 {
    public static void main(String[] args) {
        float [] marks = {23.5f,34.6f,55.3f,59.7f,44.0f};
        float sum = 0.0f;
        for (float element : marks){
            sum+=element;
        }
        System.out.println(sum);
    }
}
