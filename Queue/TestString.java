import java.util.LinkedList; 
import java.util.Queue;
public class TestString
{
    public static void main(String[] args) 
    { 
         //exercise 
        Queue<String> qList = new LinkedList<>(); 
        
        // Adds elements {0, 1, 2, 3, 4} to 
        // the queue
        
         qList.add("Ali");
         qList.add("Abu");
         qList.add("Mas");
         qList.add("Biskut");
         qList.add("Pizza");
         
        qList.remove();
        
        
        
         int len =0;
        while (qList.size() != 0)
        {
           
            String temp = qList.remove();
            len = len + temp.length();
            
        } 
        System.out.println("Queue String length is " + len); 
    }
}
