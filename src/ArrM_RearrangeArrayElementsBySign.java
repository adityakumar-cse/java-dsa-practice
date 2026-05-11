import java.util.Arrays;

public class ArrM_RearrangeArrayElementsBySign {
    public static int[] rearrangeArray(int [] arr){
        int n = arr.length;
        int[] ans = new int [n];

        int pos = 0;
        int neg = 1;
        for (int i = 0; i <n; i++) {
            if (arr[i]>0){
                ans[pos] = arr[i];
                pos += 2;
            }
            else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }
    public static void main (String [] args){
        int[] arr = {1,4,-6,-5};
        int obj[] = rearrangeArray(arr);
        System.out.println(Arrays.toString(obj));
    }
}
