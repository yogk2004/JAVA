public class Quiz_7 {
    public static void main(String[] args) {
        // Printing the element of the array is decrementing order:
        // Declaration and Memory Allocation array.
        String[] name = new String [5];
        name[0] = "Harshit";
        name[1] = "Yogesh";
        name[2] = "Devansh";
        name[3] = "Naman";
        name[4] = "Rameshwaram";
        for(int i=(name.length)-1;i>=0;i--){
            System.out.println((i+1)+" element of the array is: "+name[i]);
        }
    }
}
