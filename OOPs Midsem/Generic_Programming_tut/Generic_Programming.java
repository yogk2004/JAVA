package Generic_Programming_tut;
public class Generic_Programming {
    public static void main(String[] args) {


        //Simple Genric class:
        Generic_class_method<String> list_set1 = new Generic_class_method<>("Hello1","Hello2");
        list_set1.list2.add("buffalo");
        list_set1.display();


        //Generic Method
        String []array = {"fsubf","sfsf","afsfs"};
        list_set1.generic_array(array);


        //Generic Type parameter bounded
        Integer[] array1 = {1,23,456};
        String[] array2 = {"Hello World", "Hello Java"};
        Double[] array3 = {1234.434,2432.4454};
        Generic_bounded<Number> object1 = new Generic_bounded<>();
        Generic_bounded<Integer> object2 = new Generic_bounded<>();
        object1.display_info(array1); //allowed
        //object2.display_info(array3); // not allowed as array 3 is of Double and i have cut the object1 into Integer only
        object1.display_info(array3); // allowed as the array is of Number class
        //object1.display_info(array2); // not allowed as the Number does not include String object

        //Generic Wildcard and their bounded

    }
}
