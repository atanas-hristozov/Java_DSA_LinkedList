import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        System.out.println(linkedList);
        linkedList.offer("1");
        linkedList.offer("2");
        linkedList.offer("3");
        linkedList.poll();
        System.out.println(linkedList);
        linkedList.add(0,"D");
        System.out.println(linkedList);
        linkedList.remove("2");
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("B"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("0");
        System.out.println(linkedList);
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        System.out.println(first + " " + last);
        System.out.println(linkedList);
    }
}