package BinarySearch;
import java.util.Scanner;

class BinarySearch {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {70, 90, 120, 150, 250};
        int value = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (value == arr[mid]) {
                index = mid;
                break;
            } 
           
            else if (value < arr[mid]) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index: " + index);
        }
    }
}
