public class ContinueStatement3 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++) {

            for (int j = 0; j < 5; j++) {

                //System.out.println(i+" "+j);
                //We can do this up here but there is no use of continue then...as it will get
                //printed for 2 despite writing condition as it is written Earlier

                if (j == 2) {
                    continue;
                    //Here, After Continue Statement an additional Statement do no give error
                    //as there is no statement above of continue.
                }
                System.out.println(i +" "+ j);

            }
        }
    }
}
