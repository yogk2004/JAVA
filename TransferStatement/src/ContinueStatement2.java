public class ContinueStatement2 {

    public static void main(String[] args) {
        System.out.println("Before Loop");

        for (int i=0;i<10;i++){
            if (i == 5){
                System.out.println("Inside Loop, After Continue");
            continue;
            //No Statement Here...Will Show compiler Error...as already a statement is above continue
        }
            System.out.println("After Loop");
        }
    }
}
