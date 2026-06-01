//========================Brute force==================================
//public class Arr_LengthOfTheLongestSubarrayWithZeroSum {
//    public static int lengthOfTheLongestSubarrayWithZeroSum(int arr[]){
//        int n = arr.length;
//        int maxLength = 0;
//
//
//        for (int i = 0; i <n; i++) {
//            int sum = 0;
//            for (int j = i; j <n; j++) {
//                sum += arr[j];
//                if(sum==0){
//                    maxLength = Math.max(maxLength, j - i +1);
//                }
//            }
//        }
//        return maxLength;
//    }
//    public static void main (String [] args){
//        int[]arr = {9, -3, 3, -1, 6, -5};
//        System.out.println(lengthOfTheLongestSubarrayWithZeroSum(arr));
//    }
//}

//=======================Optimized Approach===================================

import java.util.HashMap;

public class Arr_LengthOfTheLongestSubarrayWithZeroSum {
    public static int lengthOfTheLongestSubarrayWithZeroSum(int arr[]){
        int n = arr.length;
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <n; i++) {
            sum+=arr[i];
            if(sum == 0) {
                maxLength = i + 1;
            }
                if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            }
            else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
    public static void main (String [] args){
        int[]arr = {9, -3, 3, -1, 6,7, -5};
        System.out.println(lengthOfTheLongestSubarrayWithZeroSum(arr));
    }
}
