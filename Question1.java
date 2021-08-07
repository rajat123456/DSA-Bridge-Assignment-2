// Detecting Loop in a Link List & Finding the Starting node of the Loop

public class Q1
{
	public static void main(String[] args) {
		
		Node head=new Node(10);
		Node q=new Node(20); //      10-> 20-> 30->40
		Node r=new Node(30); //     /|\             |
		Node s=new Node(40); //      |______________|    
		
		head.next=q;
		q.next=r;
		r.next=s;
		s.next=s;
		
		Node ans=isloop(head);
		
		if(ans==null)
		System.out.println("Loop Not Exist");
		
		else
		System.out.println("Loop Exist, and starting node of loop is: "+ans.data);
		
	}
	
	static Node isloop(Node head)
	{
	    // if only 1 node exist in LL
	    if(head.next==null)
	    return null;
	    
	    Node slow=head, fast=head;
	    boolean flag=false;
	    
	    while(fast!=null && fast.next!=null)
	    {
	        // fast hops twice and slow hop once in 1 iteration
	        fast=fast.next.next;
	        slow=slow.next;
	        
	        // if control comes here, then it means loop exist, hence making flag=true
	        if(fast==slow)
	        {
	          flag=true; 
	          break;
	        }
	    }
    
        // flag= false means loop no exist, return null	    
	    if(flag==false)
	    return null;
	    
	    // control comes here, if loop exist, and this block of code is finding starting node of loop
	    // setting one reference to head node & leaving other as it is 
	    fast=head;
	    
	    while(fast!=slow)
	    {
	        // here moving both 1 by 1
	        fast=fast.next;
	        slow=slow.next;
	    }
	    
	    // starting node of loop returns from here
	    return fast;
	    
	}
}


class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    
}
