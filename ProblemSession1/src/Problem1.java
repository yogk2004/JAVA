public class Problem1 {


    double CalFuc (int RameshBasicSalary) {
        //double a = (RameshBasicSalary * (0.4)) + (RameshBasicSalary * (0.2)) + RameshBasicSalary;
        double a = RameshBasicSalary*(1.6);
        return a;
    }

    public static void main(String[] args) {
        Problem1 callfunc = new Problem1();

        double GrossSalary = callfunc.CalFuc(80000);
        System.out.println(GrossSalary);
    }
}
