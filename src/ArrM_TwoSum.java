import java.util.HashMap;

public class ArrM_TwoSum {
    public static int[] twoSumCheck(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};

    }
    public static void main(String[] args) {
        int arr[] ={2,6,5,8,11};
        int[] result = twoSumCheck(arr, 14);
        System.out.println(result[0]+ " "+result[1]);
    }
}