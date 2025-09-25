package Stack;
public class Stack {
    int top;
    int size=3;
    int Stack[]=new int[size];

    public Stack() {
        top=-1;
    }
    void push(int d){
        if(top == size-1){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            Stack[top]=d;
            System.out.println(d);
        }
    }
    int pop(){
        if(top==-1){
        System.out.println("Stack Overflow");
        return -1;
        }
        else{
            int d = Stack[top];
            top--;
            System.out.println(d);
            return d;
        }
    }
    int peek(){
        if(top==-1){
        System.out.println("Stack is Empty");
        return -1;
        }
        else{
            return Stack[top];
        }
    }
    int size(){
        return top+1;
    }
    boolean isFull(){
        return top == size - 1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    void display(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        else{
            for(int i = 0;i<=top;i++){
                System.out.println(Stack[i] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isFull());
        System.out.println(s.isEmpty());
        s.display();
    }
}