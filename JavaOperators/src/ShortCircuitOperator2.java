public class ShortCircuitOperator2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        if ((a++ != 10 & b++ != 10)){}
            System.out.println(a+" "+b);

        int c = 20;
        int d = 20;

        if ((c++ != 20 && b++ != 20)){}
        System.out.println(c+" "+d);
    }
}
