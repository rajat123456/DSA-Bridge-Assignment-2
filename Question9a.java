// Heaps Uisng Arrays

/*
 * @author rajatrawat
 */
 
import java.util.*; 
public class Main {
    
    public static void main(String[]args)
    {
        // array which store all elements of heap
        int []arr=new int[7];
        
       // creating heap    
       create(arr);
       
       // printing heap
       print(arr);
        
    }
    
    static void create (int []arr)
    {
        Scanner sc=new Scanner(System.in);
        
        // root element
        arr[0]=sc.nextInt();
        
        for(int q=0;q<(arr.length-1)/2;q++)
        {
            // left child= (parent_index * 2) + 1
            arr[2*q+1]=sc.nextInt();
            // right child= (parent_index * 2) + 2
            arr[2*q+2]=sc.nextInt();
        }
    }
   
    // print function
    static void print(int[] arr)
    {
        // printing root node value
        System.out.print(arr[0]+" ");
        
        for(int q=0;q<(arr.length-1)/2;q++)
        {
            // print left child
            System.out.print(arr[2*q+1]+" ");
            // print right child
            System.out.print(arr[2*q+2]+" ");
        }
        
    }
    
}
