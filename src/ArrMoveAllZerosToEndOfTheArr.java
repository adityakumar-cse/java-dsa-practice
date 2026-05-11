//public class ArrMoveAllZerosToEndOfTheArr {
//
//    public static void pushZerosToEnd(int arr[]){
//        int n = arr.length;
//        int temp[] = new int[n];
//
//        int j = 0;  // pointer for temp
//
//        // copy non-zero elements
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != 0) {
//                temp[j] = arr[i];
//                j++;
//            }
//        }
//
//        // remaining elements will be zero automatically
//
//        // copy back to original array
//        for (int i = 0; i < n; i++) {
//            arr[i] = temp[i];
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1, 0, 2, 3, 0, 4, 0, 1};
//
//        pushZerosToEnd(arr);
//
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//    }
//}

//======================================Optimized Approch=========================================================

public class ArrMoveAllZerosToEndOfTheArr {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1) return;

        int nz = 0, z = 0;

        while(nz < n){
            if(nums[nz] != 0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 0, 2, 3, 0, 4, 0, 1};

        ArrMoveAllZerosToEndOfTheArr obj = new ArrMoveAllZerosToEndOfTheArr(); // ✅ fixed
        obj.moveZeroes(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}