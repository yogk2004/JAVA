public class Problem7 {
    void FuncX(double angle){
        System.out.println("Sin Value:- "+Math.sin(angle));
        System.out.println("Cos Value:- "+Math.cos(angle));
        System.out.println("Tan Value:- "+Math.tan(angle));
        System.out.println("Cosec Value:- "+(1/Math.sin(angle)));
        System.out.println("Sec Value:- "+(1/Math.cos(angle)));
        System.out.println("Cot Value:- "+(1/ Math.tan(angle)));
    }

    public static void main(String[] args) {
        Problem7 obj1 = new Problem7();

        obj1.FuncX(3.14);
    }
}
