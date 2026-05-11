public class ArrCheckIfArrayIsSortedAndRotated {
    public static boolean check(int arr[]){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[(i + 1) % n]){
                count++;
            }
        }
        return count <= 1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        boolean result = check(arr);
        if(result){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}