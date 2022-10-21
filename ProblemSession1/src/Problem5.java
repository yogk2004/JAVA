public class Problem5 {
    void RectangleFunc(double a, double b){
        System.out.println("Area Of Rectangle:- "+(a*b));
        System.out.println("Perimeter Of Square:- "+(2*(a+b)));
    }

    void CircleFunc(double r){
        System.out.println("Area Of Circle:- "+3.14*r*r);
        System.out.println("Permeter Of Rectangle:- "+6.28*r);
    }

    public static void main(String[] args) {
        Problem5 CreateObj = new Problem5();
        CreateObj.RectangleFunc(56,68);
        System.out.println("---------------------------------------");
        CreateObj.CircleFunc(67);
    }
}
