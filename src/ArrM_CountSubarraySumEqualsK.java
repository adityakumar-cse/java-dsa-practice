public class ArrM_CountSubarraySumEqualsK {

    public static int sssFjj(int nums[], int k){
        int n = nums.length;
        int count = 0;
        int sum = 0;
        for (int i = 0; i <n; i++) {
            if (nums[i] == k) count ++;

            if (sum != k){
                sum = sum + nums[i];
            } else if (sum == k) {
                count++ ;
                sum = 0;
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int [] nums = {3, 1, 2, 4};
        int k = 6;
    }
}
