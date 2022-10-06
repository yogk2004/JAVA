public class Problem3 {
    double calfunc(int a, int b,int c,int d,int e){
        double Percentage = (a+b+c+d+e)/5;
        System.out.println(Percentage+"%");
        return Percentage;
    }

    public static void main(String[] args) {
        Problem3 Data1 = new Problem3();

        int Sub1=98;
        int Sub2=97;
        int Sub3=94;
        int Sub4=82;
        int Sub5=90;
        Data1.calfunc(Sub1,Sub2,Sub3,Sub4,Sub5);
    }
}
