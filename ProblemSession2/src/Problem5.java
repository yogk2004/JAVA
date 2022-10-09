public class Problem5 {
    void Func1(double Lati1, double Lati2, double Long1, double Long2) {
        double D = 3963 * ((Math.sin(Lati1) * Math.sin(Lati2)) + (Math.cos(Lati1) * Math.cos(Lati2)) * (Math.cos(Long2 - Long1)));
        System.out.println(D);
    }

    public static void main(String[] args) {
        Problem5 obj1 = new Problem5();

        obj1.Func1(54,67,42,67);
    }

}
