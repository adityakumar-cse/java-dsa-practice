public class ArrSecondLargestEle {
    public static void secondLargestElement(int secondLargest){
        System.out.println("Largest Element is " + secondLargest);
    }

    public static void main(String[] args) {
        int arr[] = {2,5,3,7,0,9};
        int largestEle = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largestEle){
                secondLargest = largestEle;
                largestEle = arr[i];
            }
            else if (arr[i]>secondLargest && arr[i] != largestEle){
                secondLargest = arr[i];
            }
        }
        secondLargestElement(secondLargest);
    }
}
