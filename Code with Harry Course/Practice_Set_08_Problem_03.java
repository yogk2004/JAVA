import java.util.Scanner;

class Square{
    int side;
    public void area_print(){
        System.out.println("The area of the square is: "+(side*side));
    }
    public void permimeter_print(){
        System.out.println("The perimeter of the square is: "+(4*side));
    }
}

public class Practice_Set_08_Problem_03 {
    public static void main(String[] args) {
        Square sq = new Square();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the side of the square: ");
        int side_input = sc.nextInt();
        sq.side = side_input;
        sq.area_print();
        sq.permimeter_print();
    }
}
