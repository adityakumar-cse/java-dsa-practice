import java.util.Arrays;

public class ArrM_LongestConsecutiveSequenceInAnArray {

    public static int longestCon(int [] arr){
        int n = arr.length;
        if (n == 0) return 0;
        int count = 1;
        int longest = 1;

        Arrays.sort(arr);
        for (int i = 1; i <n; i++) {
            if(arr[i] == arr[i-1]) continue;
            if (arr[i] == arr[i-1]+1){
                count++;
            }
            else {
                count=1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int [] arr = {100, 4, 200, 1, 3, 2};
        int result = longestCon(arr);
        System.out.println(result);
    }
}
// tc - 0(nlogn)