package Stack;

import java.util.Scanner;

public class Main {
    int size = 100; 
    int top;
    int[] stack;

    Main() {
        top = -1;
        stack = new int[size];
    }

    void push(int d) {
        if (top < size - 1) {
            top++;
            stack[top] = d;
        }
    }

    int pop() {
        if (top == -1) {
            return -1;
        } else {
            int d = stack[top];
            top--;
            return d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        Main s = new Main();

        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            if (type == 1) {       
                int x = sc.nextInt();
                s.push(x);
            } else if (type == 2) { 
                System.out.println(s.pop());
            }
        }
    }
}