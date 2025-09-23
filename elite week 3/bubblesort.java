// basic program of bubble sort
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        for(int j = 0; j < arr.length-1;j++){
            for(int k=0;k<arr.length-1-j;k++){
                if(arr[k]>arr[k+1]){
                    int temp = arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        System.out.print("After Sorting array is :");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}