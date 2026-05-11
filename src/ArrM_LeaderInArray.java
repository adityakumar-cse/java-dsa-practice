public class ArrM_LeaderInArray {
    public static void leadersInArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
public static void main (String args[]){
    int arr[] = {2,4,3,2,6,4,7,4};
    leadersInArray(arr);
}
}
