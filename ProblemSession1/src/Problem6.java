public class Problem6 {
    public static void main(String[] args) {
        int x = 1189;
        int y = 841;
        for(int i=0; i<=8; i++){
            System.out.println("A"+i);
            if(x >= y){
                x = x/2;
                System.out.println("Length : "+x+" | Breadth : "+y);
            }else {
                y = y/2;
                System.out.println("Length : "+x+" | Breadth : "+y);
            }
        }
    }
}
