import java.util.Scanner;

class Rectangle{
    int length;
    int breath;
    public void area(){
        System.out.println("The area of the rectangle is: "+(length*breath));
    }
    public void perimeter(){
        System.out.println("The perimeter of the rectangle is: "+(4*(length+breath)));
    }
}
public class Practice_Set_08_Problem_04 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the length of the rectangle: ");
        rec.length = sc.nextInt();
        System.out.print("Enter the value of the breath of the rectangle: ");
        rec.breath = sc.nextInt();
        rec.area();
        rec.perimeter();
    }
}
