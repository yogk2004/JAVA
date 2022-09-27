public class MultipleObjects2 {

    int b;

    public static void main(String[] args) {
        MultipleObjects2 obj1 = new MultipleObjects2();
        MultipleObjects2 obj2 = new MultipleObjects2();

        obj1.b=100;
        obj2.b=200;
        System.out.println("Value of obj1 is "+obj1.b);
        System.out.println("Value of obj2 is "+obj2.b);
        obj2 = obj1;
        /*
        Here, the obj2 pointing towards the earlier data pack in heap memory
        is cleared after declaring obj1=obj2 and the earlier one delete by the
        garbage collector and the obj2 will point towards the obj1's data pack.
         */
        //1 object cannot point towards multiple data pack heap memory.
        System.out.println("Value of obj2 is "+obj2.b);

        obj2=null;//Here, Garbage Collector will destroy the object.
        System.out.println(obj2.b);//Null Point Exception
    }
}
