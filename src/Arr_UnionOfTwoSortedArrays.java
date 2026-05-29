
//=============================Brute Force==============================================
import java.util.Arrays;
import java.util.HashSet;

public class Arr_UnionOfTwoSortedArrays {
    public static int[] unionOfTwoSortedArrays(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2= arr2.length;
        HashSet<Integer>union = new HashSet<>();
        for (int i = 0; i <n1; i++) {
                union.add(arr1[i]);
        }
        for (int i = 0; i <n2; i++) {
                union.add(arr2[i]);
        }
         int[] result = new int[union.size()];
        int index = 0;
       for (int num : union){
           result[index] = num;
           index++;
       }
            return result;
    }
    public  static void main(String [] args){
        int arr1[] = {1,2,2,3,4,4,4,5};
        int arr2[] = {2,2,3,4,4,4,5,6,7};
        int [] ans = unionOfTwoSortedArrays(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
}
