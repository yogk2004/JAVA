public class Problem2 {
    void funcX(int a) {
        int b = a % 10;
        int c = ((a % 100) - b) / 10;
        int d = ((a % 1000) - (a % 100)) / 100;
        int e = ((a % 10000) - (a % 1000)) / 1000;
        int f = ((a % 1000000) - (a % 10000)) / 10000;
        int H = (b * 10000) + (c * 1000) + (d * 100) + (e * 10) + f;

        System.out.println(H);
    }

    public static void main(String[] args) {
        Problem2 obj2 = new Problem2();
        obj2.funcX(87945);
    }
}
