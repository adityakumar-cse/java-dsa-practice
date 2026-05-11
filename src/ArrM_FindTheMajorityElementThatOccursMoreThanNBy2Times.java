import java.util.Arrays;
public class ArrM_FindTheMajorityElementThatOccursMoreThanNBy2Times {
    public static void main(String[] args) {

        int arr[] = {1,1,2,2,1,1,2,2,2,1,2};

        int n = arr.length;
        Arrays.sort(arr);

        int freq = 1;
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                freq = 1;
                ans = arr[i];
            }
            // check every time
            if (freq>n/2) {
                System.out.println("Majority Element: " + ans);
                return;
            }
        }
        // final check (important)
        if (freq>n/2) {
            System.out.println("Majority Element: " + ans);
        }
    }
}