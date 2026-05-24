//================Optimized Approach (Kadane's Algorithm)=====================================
//  tc-> O(n)

//public class ArrM_MaximumSubarraySumInAnArray {
//    public static int maxSubarraySum(int arr[]){
//        int sum = arr[0];
//        int maxSum = arr[0];
//        for (int i = 1; i <arr.length; i++) {
//            if(sum>=0){
//                sum = sum + arr[i];
//            }
//            else {
//                sum  = arr[i];
//            }
//            if(sum>maxSum){
//                maxSum = sum;
//            }
//        }
//        return maxSum;
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,7,4,-3,-7,6,-9,10};
//        System.out.println(maxSubarraySum(arr));
//    }
//}


//=========================Brute Force Approach=======================================================
// tc -> O(n^2)


public class ArrM_MaximumSubarraySumInAnArray {
    public static int maxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,4,-3,-7,6,-9,4,10};
        System.out.println(maxSubarraySum(arr));
    }
}
