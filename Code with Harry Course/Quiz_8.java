public class Quiz_8 {
    static int recursive(int num){
        if (num==0||num==1){
            return 1;
        }else{
            return num*recursive(num-1);
        }
    }
    public static void main(String[] args) {
        //Initializing the variable:
        int x=5;
        int answer = recursive(5);
        System.out.println(answer);
    }
}
