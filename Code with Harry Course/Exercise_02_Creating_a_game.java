import java.util.Random;
import java.util.Scanner;

public class Exercise_02_Creating_a_game {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 1;
        int won = 0;
        int lost = 0;
        while(i<6) {
            int n = random.nextInt(3);
            System.out.println("Round " + i+"-");
            System.out.print("Enter your choice in Rock, Paper, Scissor: ");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();

            if ((choice.equals("Rock") && n == 0)||(choice.equals("Paper") && n == 1)||(choice.equals("Scissor") && n == 2)) {
                System.out.println("The game is a Tie.");
                System.out.println("Rematching Round "+i+"-");
                continue;
            }else if((choice.equals("Rock") && n == 1)||(choice.equals("Paper") && n ==2)||(choice.equals("Scissor") && n == 0)){
                System.out.println("You Lost the game!");
                lost+=1;
            }else{
                System.out.println("You won the game!");
                won+=1;
            }
            i++;
        }
        if (won > lost){
            System.out.println("You won the series!");
        }else if (lost > won){
            System.out.println("You lost the series!");
        }
    }
}