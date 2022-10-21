public class Problems {
    public static void printMasaiSchool(int num1){
        for(int a=1;a<=num1;a++){
            System.out.println("Masai School");
        }
    }

    public static void loop1toN(int num2){
        for(int b=1;b<=num2;b++){
            System.out.println(num2);
        }
    }

    public static void fromAtoB(int min,int max){
        for(int c=min;c<=(max-1);c++){
            System.out.println(c);
        }
    }

    public static void multiplicationTableN(int num3){
        for(int i=1;i<=10;i++){
            System.out.println(num3*i);
        }
    }

    public static void moveTwoAhead(int num4){
        for(int i=1;i<=num4;i++){
            if(i%2==0){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }

    public static void moveTwoAhead2(int num5){
        for(int i=1;i<=num5;i++){
            if(i%2!=0){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }

    public static void evenSumBelowN(int num6){
        
    }

    public static void main(String[] args) {
        printMasaiSchool(10);
        System.out.println("--------------------------------------------");
        loop1toN(10);
        System.out.println("--------------------------------------------");
        fromAtoB(5,10);
        System.out.println("--------------------------------------------");
        multiplicationTableN(9);
        System.out.println("--------------------------------------------");
        moveTwoAhead(10);
        System.out.println("--------------------------------------------");
        moveTwoAhead2(10);
        System.out.println("--------------------------------------------");
    }
}
