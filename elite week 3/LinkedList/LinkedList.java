package LinkedList;




public class LinkedList {
    class Node{             
        int data;
        Node next;
        Node(int value){
            data=value;
            next=null;
        }                                               
    }
    Node head = null;

    public void insert(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        System.out.println(value + " inserted ");
    }
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
    }
    Node current =head;
    System.out.println("Linked List: ");
    while(current!=null){
        System.out.print(current.data + " ");
        current=current.next;
    }
    System.out.println();
}
public void delete(int value){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    if(head.data==value){
        head=head.next;
        System.out.println(value + " deleted ");
        return;
    }
    Node current = head;
    while(current.next!=null &&  current.next.data != value){
        current=current.next;
    }
    if(current.next == null){
        System.out.println(value + " not found in the list");
    }
    else{
        current.next=current.next.next;
        System.out.println(value + " deleted ");
    }
}
    
    //Main Method    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        //list.insert(40);
        list.display();

        list.delete(20);
        list.display();
        list.delete(40);
        list.display();
    }
    
    
}