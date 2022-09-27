public class AdditionFunction2 {
    public int add(int x, int y){
        return x+y;
}

    public static void main(String[] args) {

        AdditionFunction2 number1 = new AdditionFunction2();
        int c = number1.add(34, 69);
        System.out.println(c);
        number1 = null;

        AdditionFunction2 number2 = new AdditionFunction2();
        c = number2.add(57, 74);//Reassigning of Variable "c"
        System.out.println(c);
        number2 = null;

        AdditionFunction2 number3 = new AdditionFunction2();
        c = number3.add(89, 99);//Reassigning of Variable "c"
        System.out.println(c);
        number1 = null;
    }
}
