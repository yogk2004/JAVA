import java.util.Scanner;

class circle{
    int radius;
    void area(){
        System.out.println("The area of the circle is: "+(3.14*radius*radius));
    }
    void perimeter(){
        System.out.println("The perimeter of the circle is: "+(2*3.14*radius));
    }
}
public class Practice_Set_08_Problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle obj = new circle();
        System.out.print("The radius of the circle is: ");
        obj.radius = sc.nextInt();
        obj.area();
        obj.perimeter();
    }
}
