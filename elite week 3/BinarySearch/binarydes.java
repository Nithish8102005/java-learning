// binary search for sorted array for descending order
package BinarySearch;
import java.util.Scanner;
public class binarydes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the element to be searched : ");
        int value = scan.nextInt(); // storing the number in key
        int left = 0; int right = arr.length-1;int index=-1;
        while(left<=right){
           int mid =((left+right)/2);
        if(value==arr[mid]){
            index=mid;
            break;
        }
        else if(value > arr[mid]){
            right = mid - 1;
        }
        else{
            left = mid + 1;
        }
    }
        if(index==-1){
            System.out.print("!Element Not found");
        }
        else{
            System.out.print("index of "+value+" element is :"+index);
        }

    }
}