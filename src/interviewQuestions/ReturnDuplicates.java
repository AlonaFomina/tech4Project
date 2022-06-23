package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReturnDuplicates {
    public static int[] dupArr(int[] arr){
        Set<Integer> noDupSet = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] == arr[j]) noDupSet.add(arr[i]);
            }
        }
        int [] newArr = new int[noDupSet.size()];
        int index = 0;
        for(Integer i : noDupSet) newArr[index++] = i;

        return newArr;
    }



    public static int [] duplicates(int [] nums){
        Arrays.sort(nums);
        HashSet<Integer>noD = new HashSet<>();

        for(int i=0;i<nums.length-1;i++)if(nums[i]==nums[i+1])noD.add(nums[i]);

        int[] result = new int[noD.size()];
        int i = 0;
        for(Integer dup : noD) result[i++] = dup;

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(dupArr(new int[]{2, 3, 2, 5, 6, 7, 8, 3})));
        System.out.println(Arrays.toString(duplicates(new int[]{2, 3, 2, 5, 6, 7, 8, 3})));
    }
}
