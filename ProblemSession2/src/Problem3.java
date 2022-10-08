import com.sun.jdi.PathSearchingVirtualMachine;

public class Problem3 {
    int Side1;
    int Side2;
    int Side3;

    void FunX(int Side1,int Side2,int Side3){
        int sum = (Side1+Side2+Side3)/2;

        double a = (sum*(sum-Side1)*(sum-Side2)*(sum-Side3));
        double Result = Math.sqrt(a);
        System.out.println(Result);
    }

    public static void main(String[] args) {
        Problem3 obj1 = new Problem3();
        obj1.FunX(3,4,5);
    }
}

