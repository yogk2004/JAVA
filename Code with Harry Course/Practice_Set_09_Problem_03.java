import java.util.Scanner;

class Cylinder2{
    private double radius;
    private double height;
    public Cylinder2(double inputRadius,double inputHeight){
        radius = inputRadius;
        height = inputHeight;

        // Volume off the cylinder:
        System.out.println("The Volume of the cylinder is: "+Math.PI*radius*radius*height);
        //Total Surface area of the Cylinder
        System.out.println("The Total surface area of the cylinder is: "+2*Math.PI*radius*(height+radius));
        //Curved Surface area of the Cylinder
        System.out.println("The Curved surface area of the cylinder is: "+2*Math.PI*radius*height);
    }
}
public class Practice_Set_09_Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the radius of the cylinder: ");
        double inputRadius = sc.nextDouble();
        System.out.print("Enter the value of the height of the cylinder: ");
        double inputHeight = sc.nextDouble();
        Cylinder2 obj = new Cylinder2(inputRadius,inputHeight);
    }
}
