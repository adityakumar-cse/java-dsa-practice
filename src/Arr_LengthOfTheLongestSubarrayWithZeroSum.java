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

public class Arr_LengthOfTheLongestSubarrayWithZeroSum {
    public static int lengthOfTheLongestSubarrayWithZeroSum(int arr[]){
        int n = arr.length;
        int maxLength = 0;
        int sum = 0;



        return maxLength;
    }
    public static void main (String [] args){
        int[]arr = {9, -3, 3, -1, 6, -5};
        System.out.println(lengthOfTheLongestSubarrayWithZeroSum(arr));
    }
}
