public class ArrM_MaximumSubarraySumInAnArray_K_SlidingWindow {
    static int maximumSubarraySlidingWindow(int arr[], int k){
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;
        for (int i = 0; i <k; i++) {
            wSum += arr[i];
        }
        for (int i = k; i<arr.length; i++){
            wSum = wSum - arr[i-k] + arr[i];
            mSum = Math.max(mSum, wSum);
        }
        return mSum;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,3,5,8,7};
        int k = 4;
        System.out.println(maximumSubarraySlidingWindow(arr,k));
    }
}
