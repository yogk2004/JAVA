/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
public class questionLab3
{
    public static void checkPair(int len, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int countPair = 0;
        for(Map.Entry entry : map.entrySet()){
            if(Integer.parseInt(String.valueOf(entry.getValue())) > 1){
                countPair += ((Integer.parseInt(String.valueOf(entry.getValue()))) *
                        (Integer.parseInt(String.valueOf(entry.getValue()))-1)) / 2;
            }
        }
        System.out.println("-x-x-x-x-x-x-x-x-");
        System.out.println(countPair);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] nums = new int[len];
        for(int i=0; i<len; i++){
            nums[i] = in.nextInt();
        }
        checkPair(len, nums);
    }
}
