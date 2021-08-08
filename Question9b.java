// Priority Queues Using Arrays

public class Main
{
    static PQUsingArray pq=new PQUsingArray();
    static int front=0;
    
	public static void main(String[] args) {
		
		insert(10);
		insert(20);
        insert(30);
		insert(40);
		
		System.out.print(pq.arr[0]+" ");
		for(int q=1;q<pq.arr.length/2;q++)
		{
		    System.out.print(pq.arr[2*q+1]+" ");
		    System.out.print(pq.arr[2*q+2]+" ");
		}
		
		System.out.println();
		
		remove();
		remove();
		remove();
		
		System.out.print(pq.arr[0]+" ");
		for(int q=1;q<pq.arr.length/2;q++)
		{
		    System.out.print(pq.arr[2*q+1]+" ");
		    System.out.print(pq.arr[2*q+2]+" ");
		}
		
	}
	
	static void insert(int value)
	{
	    pq.arr[front]=value;
	    ++front;
	    
	    upheapify(front-1);
	}
	
	static void upheapify(int val)
	{
	    if(val==0)
	    return;
	    
	    int parent=(val-1)/2;
	    
	    if(pq.arr[parent]<pq.arr[val])
	    {
	      swap(parent, val);
	      upheapify(parent);
	    }
	}
	
	static void remove()
	{
	    if(front==0)
	    {
	      System.out.println("Underflow");
	      return;
	    }
	    
	    swap(0, front);
	    --front;
	    downheapify(0);
	}
	
	static void downheapify(int val)
	{
	    int min=val;
	    int left=2*val+1;
	    int right=2*val+2;
	    
	    if(left<front && pq.arr[left]<pq.arr[min])
	    min=left;
	    
	    if(right<front && pq.arr[right]<pq.arr[min])
	    min=right;
	    
	    if(min!=val)
	    {
	      swap(min, val);
	      downheapify(min);
	    }
	}
	
	static void swap(int parent, int val)
	{
	    int temp=pq.arr[parent];
	    pq.arr[parent]=pq.arr[val];
	    pq.arr[val]=temp;
	}
}

class PQUsingArray
{
    int[]arr;
    
    PQUsingArray()
    {
        arr=new int[5];
    }
}
