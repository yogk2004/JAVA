package Generic_Programming_tut;

import java.util.ArrayList;

class Generic_class_method<T> {
    //Both ways are Correct
    // No space between <T> and Arraylist should be there.
    ArrayList <T> list1  = new ArrayList<>();
    ArrayList<T> list2 = new ArrayList<T>();
    Generic_class_method(T input1, T input2){
        list1.add(input1);
        list2.add(input1);
        list1.add(input2);
        list2.add(input2);
    }
    public void display(){
        System.out.println(list1);
        System.out.println(list2);
    }
    //Generic class
    public <T> void generic_array (T []array){
        for (T element:array) {
            System.out.print(element+" ,");
        }
        System.out.println("");
    }
}
