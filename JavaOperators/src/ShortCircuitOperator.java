public class ShortCircuitOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        if ((a++ == 10) | (b++ == 10)){
            System.out.println(a+" "+b);
        }
        int c = 120;
        int d = 15;

        if((c++ == 120 || d++ == 15)){
            System.out.println(c+" "+d);
        }
    }
}

