// Implement Queue Using Stack

/*
 * @author rajatrawat
 */
 
public class Q7 {
    
    // keep track of elements
    static int rear=-1;
    static int front=-1;
    
    public static void main(String[]args)
    {
        
        StackUsingArray stk=new StackUsingArray();
        
        
        // push into stack
        push(1, stk);
        push(2, stk);
        push(3, stk);
        push(4, stk);
        
        System.out.println("Size of Stack: "+size(stk));
        
        // print entire stack
        print(stk);
        
        pop(stk);
        System.out.println("Size of Stack: "+size(stk));
        
        // print entire stack
        print(stk);
        
        pop(stk);
        
        System.out.println("Size of Stack: "+size(stk));
        
        // print entire stack
        print(stk);
        
        push(6, stk);
        
        System.out.println("Size of Stack: "+size(stk));
        
        // print entire stack
        print(stk);
        
        pop(stk);
        
        System.out.println("Size of Stack: "+size(stk));
        
        // print entire stack
        print(stk);
        
       
    }
    
    static void push(int value, StackUsingArray stk)
    {
        if(front==-1)
        front++;
        
        rear++;
        
        if(rear==stk.arr.length)
        {
         System.out.println("Overflow");
         return;
        }
        
       stk.arr[rear]=value;
       
    }   
    
    
    // pop function
    static void pop(StackUsingArray stk)
    {
      
      // for removing, copy contents of array to left from front+1 index to rear    
      for(int q=front+1;q<=rear;q++)
      {
          stk.arr[q-1]=stk.arr[q];
      }
    
        // decrementing rear, bcz 1 element is removed now
        --rear;
    }
   
   
   // size function
    static int size(StackUsingArray stk)
    {
       return rear+1;   
    }
    
        
    // print function
    static void print(StackUsingArray stk)
    {
        
        if(rear==-1)
        {
            System.out.println("Stack is Empty");
        }
        
        else
        {
        
          System.out.print("Contents of Stack: ");
        
          for(int q=front; q<=rear; q++)
           {
             System.out.print(stk.arr[q]+" ");
           }
        
          System.out.println();
        }
        
    }
    
}

//StackUsingArray class with 1 property: integer array
class StackUsingArray
{
  int[]arr=new int[4];
}
