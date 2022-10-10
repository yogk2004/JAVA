import java.sql.SQLOutput;

public class Problem9 {
    void FuncX(int A){
        int B = A/100;
        int LeftOf100 = A%100;

        int C = LeftOf100/50;
        int LeftOf50 = A%50;

        int D = LeftOf50/10;
        int LeftOf10 = A%10;

        int E = LeftOf10/5;
        int LeftOf5 = A%5;

        int F = LeftOf5/2;
        int LeftOf2 = LeftOf5%2;

        int G = LeftOf2/1;

        System.out.println("Minimum No. Of Notes Of 1,2,5,10,50,100:- "+(B+C+D+E+F+G));
    }

    public static void main(String[] args) {
        Problem9 obj = new Problem9();
        obj.FuncX(578);
    }
}
