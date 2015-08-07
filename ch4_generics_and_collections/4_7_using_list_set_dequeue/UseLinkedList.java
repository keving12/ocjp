import java.util.*;

public class UseLinkedList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        
        list.offer("Java");
        list.push("e");
        list.add(1, "Guru");
        list.remove("e");
        
        // Fails to compile as reference type of list is of type List and methods push and offer don't exist here, only in the LinkedList implementation
        
        System.out.println(list);
    
    }
}