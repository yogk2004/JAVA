/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

import java.util.*;
public class QuestionLab2
{
    public static void generateSequence(int num){
        // int[] ans = new int[num];
        int N = 1;
        while(num > 0){
            if(((2*(N))+3) % 5 != 0){
                System.out.print(((2*(N))+3)+" ");
                N += 1;
                num -= 1;
            }else{
                N += 1;
            }
        }
    }

    public static void generateRoot(int num){
        for(int i=1; i<num; i++){
            if(num < 0){
                System.out.println(-1);
                return;
            }
            if(num == 0){
                System.out.println(0);
                return;
            }
            if((i * i) == num){
                System.out.println(i);
                return;
            }
            if((i * i) > num && ((i-1) * (i-1)) < num){
                System.out.println(i-1);
                return;
            }
        }
    }

    public static void generateAtila(int num){
        // A(x) = A(x-1) + A(x-2)


    }

    public static void coPrime(int num1, int num2){
        List<Integer> list1 = new ArrayList<>();
        for(int i=2; i<=num1; i++){
            if((num1 % i ) == 0){
                list1.add(i);
            }
        }

        List<Integer> list2 = new ArrayList<>();
        for(int i=2; i<=num2; i++){
            if((num2 % i ) == 0){
                list2.add(i);
            }
        }

        // System.out.println(list1);
        // System.out.println(list2);
        for(int i=0; i<list1.size(); i++){
            for(int j=0; j<list2.size(); j++){
                if(list1.get(i) == list2.get(j)){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }

    public static void coPrime2(int num1, int num2){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=2; i<=num1; i++){
            if((num1 % i ) == 0){
                if(map.get(i) == null)
                    map.put(i, 1);
                else
                    map.put(i, map.get(i)+1);
            }
        }
        for(int i=2; i<=num2; i++){
            if((num2 % i ) == 0){
                if(map.get(i) == null)
                    map.put(i, 1);
                else
                    map.put(i, map.get(i)+1);
            }
        }
        // System.out.println(map);
        for(Map.Entry entry : map.entrySet()){
            if(Integer.parseInt(String.valueOf(entry.getValue())) > 1){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        return;
    }

    public static void saReGaMa(String str){
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count += 1;
                if(count > max){
                    max = count;
                }
            }else{
                count = 0;
            }
        }
        System.out.println(max+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// 		int num1 = in.nextInt();
// 		int num2 = in.nextInt();
// 		generateSequence(num);
// 		generateRoot(num);
// 		generateAtila(num);
// 		coPrime(num1, num2);
// 		coPrime2(num1, num2);
        String str = in.next();
        saReGaMa(str);
    }
}

