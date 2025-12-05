public class queu1{
    int[] queue;
    int front = -1, rear = -1, size;

    publicqueu1 size) {
        this.size = size;
        queue = new int[size];
    }

    public void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;                                          
        } else  {
            if (front == -1) front = 0;
            rear++;
            queue[rear] = x;
            System.out.println(x + " inserted");
        }
    }
    public int dequeue(){
           if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removed = queue[front];
        front++;
        return removed;
    }
        

    public void display() {
    if (front == -1 || front > rear) {
        System.out.println("Queue is empty");
    } else {
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }
}


        

    public static void main(String[] args) {
        Main q = new Main(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display()
        System.out.println("removed" + " "+q.dequeue());
        q.display();
    }
}