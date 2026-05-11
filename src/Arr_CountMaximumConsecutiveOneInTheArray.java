public class Arr_CountMaximumConsecutiveOneInTheArray {
    public static int countMaxZero(int arr[]){
       int count = 0;
       int maxcount = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
            }
            else {
                count = 0;
            }
            maxcount = Math.max(count, maxcount);
        }
        return maxcount;
    }

    public static void main (String [] agrs){
        int arr[] = {1,1,0,1,1,1,0};
        System.out.println(countMaxZero(arr));
    }
}
