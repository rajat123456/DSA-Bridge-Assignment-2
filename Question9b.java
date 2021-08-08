// Priority Queue (MAX) Implementation

import java.util.*;
public class Main
{
    static PQUsingArray pq=new PQUsingArray();
    
    public static void main(String[] args) {
		
		// insert into PQ
		insert(10);     //          40
		insert(20);    //         /   \
        	insert(30);   //        20    30
		insert(40);  //        / \    / \
		            //        10  n  n   n
		
		for(int q=0;q<pq.al.size();q++)
		{
		    System.out.print(pq.al.get(q)+" ");
		}
		
		System.out.println();
		
		// iremove from PQ
		remove();
		remove();
		remove();
		
		for(int q=0;q<pq.al.size();q++)
		{
		    System.out.print(pq.al.get(q)+" ");
		}
		
	}
	
	static void insert(int value)
	{
	    // directly added in the end
	    pq.al.add(value);

        // upheapify from last index till its correct position	    
	    upheapify(size()-1);
	}
	
	static void upheapify(int val)
	{
	    if(val==0)
	    return;
	    
	    int parent=(val-1)/2;
	    
	    if(pq.al.get(parent)<pq.al.get(val))
	    {
	      swap(parent, val);
	      upheapify(parent);
	    }
	}
	
	static void remove()
	{
	    if(size()==0)
	    {
	      System.out.println("Underflow");
	      return;
	    }
	    
	    // swap 0th index node with last node
	    swap(0, size()-1);
	    
	    // removing that last node
	    pq.al.remove(size()-1);
	    
	    // downheapify that 0th index node
	    downheapify(0);
	}
	
	static void downheapify(int val)
	{
	    int max=val;
	    int left=2*val+1;
	    int right=2*val+2;
	    
	    // checking that the left index exist or not
	    if(left<size() && (pq.al.get(left)>pq.al.get(max)))
	    max=left;
	    
	    // checking that the right index exist or not
	    if(right<size() && (pq.al.get(right)>pq.al.get(max)))
	    max=right;
	    
	    // if minimum valud index & original index not same then swap them
	    if(max!=val)
	    {
	      swap(val, max);
	      
	      // downheapify on that swapped index
	      downheapify(max);
	    }
	}
	
	static void swap(int parent, int val)
	{
	    int temp=pq.al.get(parent);
	    pq.al.set(parent,pq.al.get(val));
	    pq.al.set(val,temp);
	}
	
	static int size()
	{
	    return pq.al.size();
	}
}

class PQUsingArray
{
    ArrayList<Integer>al;
    
    PQUsingArray()
    {
        al=new ArrayList<>();
    }
}
