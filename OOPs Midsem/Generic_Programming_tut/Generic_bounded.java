package Generic_Programming_tut;

class Generic_bounded<T extends Number> {
    public void display_info(T [] input_array){
        for (T ele:input_array) {
            System.out.println(input_array+" ");
        }
    }
}
