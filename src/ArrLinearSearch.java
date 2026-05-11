//public class ArrLinearSearch {
//    public static int linearSearch(int arr[], int num) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == num) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6};
//
//        int result = linearSearch(arr, 3);
//        if (result != -1) {
//            System.out.print("Element found at index : " + result);
//        } else {
//            System.out.println("-1");
//        }
//    }
//}

import java.util.Scanner;

//=========================Scanner======================================
public class ArrLinearSearch {
    public static int linearSearch(int arr[], int num) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter element: ");
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to Search: ");
        int num = sc.nextInt();
        int result = linearSearch(arr, num);
        if (result != -1) {
            System.out.print("Element found at index : " + result);
        } else {
            System.out.println("-1");
        }
}
}
