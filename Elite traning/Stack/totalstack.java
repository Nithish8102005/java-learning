package Stack;

// Stack operations without initialiazing or built in method of stack,linkedList,ArrayList

//import java.util.Stack;
//import java.util.LinkedList;
import java.util.ArrayList;
public class totalstack {
    public static void main(String[] args) {
        //Stack<Integer> s = new Stack<>();
        //LinkedList<Integer> s = new LinkedList<>();
        ArrayList<Integer> s = new ArrayList<>();
        s.add(10);  //s.push(10);
        s.add(20);  //s.push(20);
        s.add(30);  //s.push(30);
        s.add(40);  //s.push(40);
        System.out.println(s);
        System.out.println(s.remove(0)); //s.pop();
        System.out.println(s.remove(1)); //s.pop();
        System.out.println(s.getFirst());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.get(1));
        System.out.println(s); 
    }
}