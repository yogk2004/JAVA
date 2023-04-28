public class Main {
    public static void printTriangle(){
        // base i =10
        // mid i = 5
        for(int i=0; i<10; i++){
            StringBuilder strb = new StringBuilder();
            for(int j=0; j<10; j++){
                strb.append("*");
            }
            System.out.println(strb);
        }
    }
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Main.printTriangle();
    }
}