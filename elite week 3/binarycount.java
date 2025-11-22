
import java.util.Scanner;

public class binarycount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n > 0) {
            if((n&1)==1){
                count++;
                n = n >> 1;
            } else {
                n = n >> 1; 
            }
        }
    }
}
