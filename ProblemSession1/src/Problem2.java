public class Problem2 {

    double MeterFunc(double a){
        double b = a*1000;
        System.out.println(b);
        return b;
    }

    double FeetFunc(double a){
        double c = a*3281;
        System.out.println(c);
        return c;
    }

    double InchesFunc(double a){
        double d = a*39370;
        System.out.println(d);
        return d;
    }

    double CentiFunc(double a){
        double e = a*100000;
        System.out.println(e);
        return e;
    }

    public static void main(String[] args) {
        Problem2 Data1 = new Problem2();

        Double Distance = (double)1000;

        Data1.MeterFunc(Distance);
        Data1.CentiFunc(Distance);
        Data1.FeetFunc(Distance);
        Data1.InchesFunc(Distance);
    }
}
