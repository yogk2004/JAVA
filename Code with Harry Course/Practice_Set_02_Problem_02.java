public class Practice_Set_02_Problem_02 {
    public static void main(String[] args) {
        //Encrypting a grade
        char grade = 'B';
        grade = (char)(grade+8); // As, char+int is int in resultant. So, we use typecasting.
        System.out.println("The Encrypted grade is: "+grade);

        //Decrypting a grade
        grade = (char)(grade-8);
        System.out.println("The Decrypted grade is: "+grade);
    }
}
