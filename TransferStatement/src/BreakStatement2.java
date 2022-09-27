public class BreakStatement2 {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){//Outer Loop
            for (int j=0;j<10;j++){//Nested Loop
                if(j == 5)
                    break;
                System.out.println(i+" "+j);
            }//End of nested loop
        }//End of outer loop
    }
}
