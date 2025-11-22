package Sort;

// basic program of Insertion Sort ASSIGNMENT

import java.util.Scanner;

public class Insertiona {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = arr[i];   // current element to be inserted
            int j = i - 1;

            // shift larger elements one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place the key at its correct position
            arr[j + 1] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
