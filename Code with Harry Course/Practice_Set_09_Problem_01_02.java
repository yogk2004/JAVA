import java.util.Scanner;
class Cylinder{
    private double radius;
    private double height;

    void setRadius(double inputRadius){
        radius = inputRadius;
    }
    void setHeight(double inputHeight){
        height = inputHeight;
    }
    double getRadius(){
        return radius;
    }
    double getHeight(){
        return height;
    }
    double volume(){
        return (Math.PI*radius*radius*height);
    }
    double totalSurfaceArea(){
        return (2*Math.PI*radius*(height+radius));
    }
    double curvedSurfaceArea(){
        return (2*Math.PI*radius*height);
    }
}

public class Practice_Set_09_Problem_01_02 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double inputRadius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double inputHeight = sc.nextDouble();

        obj.setRadius(inputRadius);
        obj.setHeight(inputHeight);

        //Printing all required things:
        System.out.println("The radius of the cylinder is: "+obj.getRadius());
        System.out.println("The height of the cylinder is: "+obj.getHeight());
        System.out.println("The volume of the cylinder is: "+obj.volume());
        System.out.println("The total surface area of the cylinder is: "+obj.totalSurfaceArea());
        System.out.println("The curved surface area of the cylinder is: "+obj.curvedSurfaceArea());


    }
}
