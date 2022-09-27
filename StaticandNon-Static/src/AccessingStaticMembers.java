import java.sql.SQLOutput;

public class AccessingStaticMembers {

    static int x = 36;

    public static void func1(){
        System.out.println("Inside Function");
    }
    public static void func2(){
        System.out.println("----------------");
    }

    public static void main(String[] args) {

        //by using Directly
        func2();
        System.out.println(x);
        func1();
        func2();

        //by using ClassName
        System.out.println(AccessingStaticMembers.x);
        AccessingStaticMembers.func1();
        AccessingStaticMembers.func2();


        //using by an object
        AccessingStaticMembers d1 = new AccessingStaticMembers();
        System.out.println(d1.x);
        d1.func1();
        d1.func2();

    }
}
