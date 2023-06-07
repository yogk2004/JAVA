public class ConditionalStatement1 {

    public static void main(String[] args) {
        int i = 10;
        int j;
// hello
        if(i==10){
            j=20;
        }
        else{
            j=30;
        }
        System.out.println(j);

        int a = 20;
        int b;

        if (--a==20){
            b=48;
        }
        else if(++a==20){
            b=69;
        }
        else
        {
            b=40;
        }
        System.out.println(b);
    }
}
