import java.util.HashMap;
import java.util.Map;

public class HashMapHighestOccEle {
    public int mostFreqElement(int arr[]) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // count frequency of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int result = arr[0];

        // find element with highest frequency
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 6, 4, 4, 3, 3, 6, 5, 5, 2};

        HashMapHighestOccEle obj = new HashMapHighestOccEle();
        int ans = obj.mostFreqElement(arr);

        System.out.println("Most frequent element: " + ans);
    }
}