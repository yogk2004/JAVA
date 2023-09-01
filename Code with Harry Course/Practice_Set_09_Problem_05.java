import java.util.Scanner;

class Sphere{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void areaCal(){
        System.out.println("The surface area of the circle is: "+4*Math.PI*radius*radius);
    }

    public void volumeCal(){
        System.out.println("The volume of the circle is: "+(4/3)*Math.PI*radius*radius*radius);
    }
}
public class Practice_Set_09_Problem_05 {
    public static void main(String[] args) {
        Sphere obj = new Sphere();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the radius of sphere: ");
        double inputRadius = sc.nextDouble();
        obj.setRadius(inputRadius);
        obj.areaCal();
        obj.volumeCal();
    }
}
