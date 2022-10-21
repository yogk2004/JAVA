public class Problem4 {
    double ConvFuncToCelsius(double a){
        double b = (((a - 32)*5)/9);
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        Problem4 CallFunc = new Problem4();

        CallFunc.ConvFuncToCelsius(345);
    }
}
