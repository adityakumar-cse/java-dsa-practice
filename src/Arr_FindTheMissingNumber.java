public class Arr_FindTheMissingNumber {
   // public static int missingNumber(int arr[]){
//        int n = arr.length +1;
//        int totalSum = 0;
//        int arrSum = 0;
//
//           totalSum = n*(n+1)/2;
//
//        for (int i = 0; i < arr.length; i++) {
//            arrSum = arrSum + arr[i];
//        }
//        return totalSum - arrSum;

        public static int missingNumber(int arr[]){
            int n = arr.length + 1;
            long totalSum = 0;
            long arrSum = 0;

            totalSum = (long) n * (n + 1) / 2;

            for (int i = 0; i < arr.length; i++) {
                arrSum = arrSum + arr[i];
            }
            return (int) (totalSum - arrSum);
        }

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        System.out.println(missingNumber(arr));

    }
}
