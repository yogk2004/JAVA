public class MultipleObjects {

    int x = 10;

    public static void main(String[] args) {

        MultipleObjects obj1 =new MultipleObjects();

        obj1.x = 50;//Value only changed in the Heap Memory not the Harddisk .class File
        System.out.println(obj1.x);//50

        //Second Object Creation on same Variable in same class
        MultipleObjects obj2 =new MultipleObjects();
        System.out.println(obj2.x);//10
    }
}
