// this is left rotation

//public class Arr_rotateArrByKEle {
//    public static void rotateOne(int arr[]){
//        int n = arr.length;
//        int temp = arr[0];
//        for (int i = 1; i <n; i++) {
//            arr[i-1] = arr[i];
//        }
//        arr[n-1] = temp;
//    }
//    public static void noOfRotate(int arr[], int k){
//        k = k% arr.length;
//        if (k<0){
//            k=k+ arr.length;
//        }
//        for (int i = 0; i <k ; i++) {
//            rotateOne(arr);
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        noOfRotate(arr, 1);
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//
//    }
//}
//======================Optimized approch======================================
// this is left rotation
public class Arr_rotateArrByKEle {
    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void noOfRotate(int arr[], int k){
        k = k% arr.length;
        if (k<0) {
            k = k + arr.length;
        }
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.print("Before rotation = ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        noOfRotate(arr, 3);
        System.out.print("After rotating array = ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
