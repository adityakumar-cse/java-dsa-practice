//==================================Brute force================================================
//public class Arr_LongestSubarrayWithGivenSumKPositives {
//    public static int longestSubarrayWithGivenSumK(int arr[], int k){
//        int maxLength = 0;
//        int count = 0;
//        for (int i = 0; i <arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j <arr.length ; j++) {
//                sum = sum + arr[j];
//                if(sum == k){
//                  maxLength = Math.max(maxLength, j-i+1);
//                }
//            }
//        }
//        return  maxLength;
//    }
//    public static void main(String [] args){
//        int arr[] = {1,2,3,4,5,6,7};
//        int k = 6;
//        System.out.println(longestSubarrayWithGivenSumK(arr, k));
//    }
//}

//==================================Optimized Approach================================================
public class Arr_LongestSubarrayWithGivenSumKPositives {
    public static int longestSubarrayWithGivenSumK(int arr[], int k){
        int maxLength = 0;
        int sum = 0;
        int j = 0;
        for (int i = 0; i <arr.length; i++) {
           sum += arr[i];

           while(sum>k){
               sum -= arr[j];
               j++;
           }
           if(sum == k){
               maxLength = Math.max(maxLength, i-j+1);
            }
        }
        return  maxLength;
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7};
        int k = 6;
        System.out.println(longestSubarrayWithGivenSumK(arr, k));
    }
}
