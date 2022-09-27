public class CreatingObject {
    int x = 50;//Instance Variable, Non-Static Variable

    void func1() {
        System.out.println("Inside Non-Static Function");//Non-Static Function
    }

    public static void main(String[] args) {
        int y = 10;//Local Variable,Static Variable

        System.out.println(y);//10
        //Object Creation
        CreatingObject d1 = new CreatingObject();
        //Using of Non-Static Variable after Object Creation
        System.out.println(d1.x);
        //Using of Non-Static Function after Object Creation
        d1.func1();
    }
}
