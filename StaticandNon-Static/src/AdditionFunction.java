public class AdditionFunction {
    public int add(int x, int y){
        int i = x + y;
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {

        AdditionFunction number1 = new AdditionFunction();
        number1.add(20, 30);
        number1 = null;

        AdditionFunction number2 = new AdditionFunction();
        number2.add(58, 75);
        number2 = null;

        AdditionFunction number3 = new AdditionFunction();
        number3.add(74, 99);
        number3 = null;
    }
}
