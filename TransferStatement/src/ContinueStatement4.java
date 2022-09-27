public class ContinueStatement4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++)
            if(i == 50){
                continue;
            }else{
                System.out.println("Printing Number "+i);
                //only 50 will get executed out of the loop.
            }
    }
}
