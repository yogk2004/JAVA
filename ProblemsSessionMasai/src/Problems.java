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
        int sum=0;
        for(int i=1;i<=num6;i++){
            if(i%2==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }

    public static void oddSumbelowN(int num7){
        int sum2=0;
        for(int i=1;i<=num7;i++){
            if(i%2!=0){
                sum2+=i;
            }
        }
        System.out.println(sum2);
    }

    public static void modeof10(int num8){
        int i=num8%10;

        for(int a=1;a<=i;a++){
            System.out.println(a);
        }
    }
    public static void divisibleByK(int num9,int k){
        int sum=0;

        for(int i=1;i<=num9;i++){
            if(i%k==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static void masaiDivisors(int left,int right,int k){
        int count=0;
        for(int i=left;i<=right;i++){
            if(i%k==0){
                count+=1;
            }
        }
        System.out.println(count);
    }

    public static void findSumOfMultiple(int X,int Y,int K){
        int sum=0;

        for(int i=1;i<=K;i++){
            if((X*i)%Y==0){
                sum+=(X*i);
            }
        }
        System.out.println(sum);
    }
    public static void fizzBuzz(int num10){
        for(int i=1;i<=num10;i++) {
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void divisibleByK2(int num11,int k){
        for(int i=1;i<=num11;i++){
            if(i%k==0){
                System.out.println(i);
            }
        }
    }
    public static void identifyThePrimeNumbers(int num12){
        if(num12==2){
            System.out.println("Yes");
        }else{
            for(int i=2;i<=(num12/2);i++){
                if(num12%i==0){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
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
        evenSumBelowN(10);
        System.out.println("--------------------------------------------");
        oddSumbelowN(10);
        System.out.println("--------------------------------------------");
        modeof10(17);
        System.out.println("--------------------------------------------");
        divisibleByK(17,3);
        System.out.println("--------------------------------------------");
        masaiDivisors(15,72,6);
        System.out.println("--------------------------------------------");
        findSumOfMultiple(3,5,10);
        System.out.println("--------------------------------------------");
        fizzBuzz(28);
        System.out.println("--------------------------------------------");
        divisibleByK2(7,2);
        System.out.println("--------------------------------------------");
        identifyThePrimeNumbers(13);
        System.out.println("--------------------------------------------");
    }
}
