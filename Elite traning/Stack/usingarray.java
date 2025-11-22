package Stack;
import java.util.Scanner;
public class usingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            if (type == 1) {      
                int x = sc.nextInt();
                s.push(x);
            } else if (type == 2) { 
                if (!s.isEmpty()) {
                    System.out.println(s.pop());
                } else {
                    System.out.println(-1); 
                }
            }
        }
    }
}
}
