public class Arr_FindTheNumberThatAppearsOnceAndTheOtherNumbersTwice {
    public static int findNumber(int arr[]){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result^arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,4,4,1,5};
        System.out.println(findNumber(arr));
    }
}
