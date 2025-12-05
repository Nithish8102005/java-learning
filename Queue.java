public class Queue {
 
    int[] queue;
    int front = -1;
    int rear = -1;
    int size = 5;
    public Queue (){
        this.size = size;
        queue = new int[size];
    }
    public void Enqueue(int x){
        if(rear == size - 1){
            System.out.println("Queue is Full");
        } else {
            if(front == -1){
                front = 0;
            }
            rear++;
            queue[rear] = x;
            System.out.println(x + " is inserted into the Queue");
        }
    }
    public void display(){
        if(front == -1 || +front > rear){
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue elements are:");
            for(int i = front; i <= rear; i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue ();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.display();
    }
}