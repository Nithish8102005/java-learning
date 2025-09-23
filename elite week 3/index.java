// using index we need to find a element; user input at runtime input index output element

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a no of inputs : ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the index of the element to be searched : ");
        int index = scan.nextInt(); 
        if(index >=0 && index<=arr.length){
            System.out.print("element at the given index is : "+arr[index]);
        }
        else if(index>arr.length){
            System.out.print("!Invalid Index");
        }
    }
}