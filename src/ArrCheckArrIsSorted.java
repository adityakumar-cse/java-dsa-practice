public class ArrCheckArrIsSorted {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8};
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is NOT Sorted");
        }
    }
}
