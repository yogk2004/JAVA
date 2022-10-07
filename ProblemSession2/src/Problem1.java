public class Problem1 {

    void funcX(int a){
        int b = a%10;
        int c = ((a%100)-b)/10;
        int d = ((a%1000)-(a%100))/100;
        int e = ((a%10000)-(a%1000))/1000;
        int f = ((a%1000000)-(a%10000))/10000;
        int g = b+c+d+e+f;

        System.out.println(g);
    }
    public static void main(String[] args) {
        Problem1 obj1 = new Problem1();

        int h = 56789;
        obj1.funcX(h);

    }
}
