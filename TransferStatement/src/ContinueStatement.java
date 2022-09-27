public class ContinueStatement {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){

            if(i %2==0)//(i %2==0) means remainder '0' when i is divided by 2
                continue;

            System.out.println(i);
        }
    }
}
