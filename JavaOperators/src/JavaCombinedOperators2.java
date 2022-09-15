public class JavaCombinedOperators2 {
    public static void main(String[] args) {
        int a = 10;

        System.out.println((--a + --a)*(++a - --a)+(++a + a++));
        //Method ((9+8)*(9-8)+(9+9))=35
    }
}
