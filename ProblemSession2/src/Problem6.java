public class Problem6 {
    void FuncX (double vel, double temp){
    double wcf = 35.74+0.6215*temp+(0.4275-(35.75*vel));
        System.out.println(wcf);
    }

    public static void main(String[] args) {

        Problem6 obj1 = new Problem6();

        obj1.FuncX(65.6,74.5);
    }
}
