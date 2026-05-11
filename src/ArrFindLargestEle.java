public class ArrFindLargestEle {
    public static void largestElement(int largestEle){
        System.out.println("Largest Element is " + largestEle);
    }

    public static void main(String[] args) {
        int arr[] = {2,5,3,7,0,9};
        int largestEle = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>largestEle) {
               largestEle = arr[i];
           }
        }
        largestElement(largestEle);
    }
}
