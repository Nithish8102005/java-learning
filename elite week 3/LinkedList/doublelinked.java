package LinkedList;

public class doublelinked {
    class Node{             
        int data;
        Node next;
        Node prev;
        Node(int value){
            data=value;
            next=null;
            prev=null;
        }                                               
    }
    Node head = null;
    //Insert at end
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
            newNode.prev=current;
        }
        System.out.println(value + " inserted ");
    }
    public void insertAtBeginning(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        System.out.println(value + " inserted at beginning");
    }
    // delete by value
    public void delete(int value){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.data==value){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            System.out.println(value + " deleted ");
            return;
        }
        Node current = head;
        while(current!=null &&  current.data != value){
            current=current.next;
        }
        if(current == null){
            System.out.println(value + " not found in the list");
        }
        else{
            if(current.next!=null){
                current.next.prev=current.prev;
            }
            if(current.prev!=null){
                current.prev.next=current.next;
            }
            System.out.println(value + " deleted ");
        }
    }
}
