import java.util.Random;
import java.util.Scanner;

class Game{
    private int numberOfGuesses;
    private int genNum;
    private int inputNum;

    // Constructor to generate a Random number:
    Game(){
        Random obj = new Random();
        genNum = obj.nextInt(1,100);
    }
    //Method to generate a random number
    //int randNumGen(){
    //Using random prebuilt library in java
    //Random obj = new Random();
    //int genNum = obj.nextInt(100);
    //return genNum;
    //}

    //Setter of the numberOfGuesses variable
    void setNumberOfGuesses(int numUpdate){
        numberOfGuesses=numUpdate;
    }
    //Getter of the numberOfGuesses variable
    int getNumberOfGuesses(){
        return numberOfGuesses;
    }
    void setInputNum(int input){
        inputNum = input;
    }

    boolean isCorrectNumber(){
        if(inputNum==genNum){
            return true;
        }else{
            return false;
        }
    }
    boolean greatTell(){
        if(inputNum>genNum){
            return true;
        }else{
            return false;
        }
    }

}
public class Exercise_03_OOPs_Concept_Guessing_number {
    public static void main(String[] args) {
        /*
        RULES OF THE GAMES: Create a class game which contains these methods
        1.) Constructor to generate the random number.
        2.) takeUserInput() to take user input of number
        3.) isCorrectNumber() to detect whether the number entered by the user is true
        4.) getter and setter for numberOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done!
         */
        Game obj1 = new Game();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number between 1 to 100 (both exclusive): ");
        int input = sc.nextInt();
        while(true){
            if(input<100 && input>0){
                break;
            }else{
                System.out.print("Input out of range! Enter any number between 0 to 100 (both exclusive): ");
                input = sc.nextInt();
            }
        }
        while(true) {
            obj1.setInputNum(input);
            if (obj1.isCorrectNumber()){
                System.out.println("Congratulations! You won the game!");
                System.out.println("Number of attempts: "+obj1.getNumberOfGuesses());
                break;
            }else{
                obj1.setNumberOfGuesses(obj1.getNumberOfGuesses()+1);
                if(obj1.greatTell()){
                    System.out.println("You have entered a bigger number!");
                }else{
                    System.out.println("You have entered a smaller number!");
                }
                System.out.print("Again enter any number between 1 to 100 (both exclusive): ");
                input = sc.nextInt();
                while(true){
                    if(input<100 && input>0){
                        break;
                    }else{
                        System.out.print("Input out of range! Enter any number between 0 to 100 (both exclusive): ");
                        input = sc.nextInt();
                    }
                }
            }
        }
    }
}
