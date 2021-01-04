import java.util.*;
import javax.swing.*;

public class Queue
{
    protected LinkedList list;
    
    public Queue() {
        list = new LinkedList();
    }//default
    
    public boolean isEmpty() {
        return list.isEmpty();
    }//method 
    
    public int size() {
        return list.size();
    }//method
    
    public void enqueue(String element) {
        list.addLast(element);
    }
    
    public Object dequeue() {
        return list.removeFirst();
    }
    
    public Object front() {
        return list.getFirst();
    }
    
    public Object rear() {
        return list.getLast();
    }
    
    
}