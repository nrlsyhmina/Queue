import javax.swing.*;
import java.util.LinkedList; 
import java.util.Queue;

public class TestInt
{
    public static void main(String[] args) 
    { 
        Queue<Integer> qList
            = new LinkedList<>(); 
  
        // Adds elements {0, 1, 2, 3, 4} to 
        // the queue
        int sum =0;
        for (int i = 1; i <= 5; i++) 
        {
            sum+=i;
            qList.add(i);
        }
        
        int avg = sum/5;
            
            
        
  
        // Display contents of the queue. 
        System.out.println("Elements of queue "
                           + qList + "Average of queue " + avg); 
  
        
    } 
}