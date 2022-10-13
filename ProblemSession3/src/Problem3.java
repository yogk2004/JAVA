import java.sql.SQLOutput;

public class Problem3 {
    public static void main(String[] args) {
        int Year = 100;
        if (Year % 4 == 0) {

            if (Year % 100 == 0) {

                if (Year % 400 == 0) {
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        }else{
                System.out.println("Not a Leap Year");
            }
        }
}

