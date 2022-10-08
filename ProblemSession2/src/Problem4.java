public class Problem4 {

    void FuncX(double x , double y){
        double r = Math.sqrt((x*x)+(y*y));
        double angle= Math.atan(y/x);
        System.out.println(r+","+angle);
    }

    public static void main(String[] args) {
        Problem4 obj1 = new Problem4();

        obj1.FuncX(3,4);
    }
}