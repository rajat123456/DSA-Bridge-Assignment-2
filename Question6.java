// Linked List is Palindrome ?

public class Q6
{
	public static void main(String[] args) {
		
		Node head=new Node(10);
		Node q=new Node(20);    // List 1: 10->20->30->30->20->10->NULL
		Node r=new Node(30);   // List 1: 10->20->10->NULL
		Node s=new Node(30);
		Node t=new Node(20);
		Node u=new Node(10);
		
		head.next=q;
	    q.next=r;
	    r.next=s;
	    s.next=t;
	    t.next=u;
		
		if(head==null)
		{
		        System.out.println("No");
	            return;
		}
		
		else if(head.next==null)
		{
		        System.out.println("Yes");
	            return;
		}
		
		Node mid=null;
		Node sechalf=null;
	    
	    // find mid of LL 
	    mid=findmid(head);
	    Node track=mid.next;
	    mid.next=null;
	    
	    // reverse the second half of LL
	    sechalf=reverse(track);
	    
	    while(head!=null && sechalf!=null)
	    {
	        if(head.data!=sechalf.data)
	        {
	            System.out.println("No");
	            return;
	        }
	        
	        head=head.next;
	        sechalf=sechalf.next;
	    }
	
	    System.out.print("Yes");
		 
		
}
        
        static Node findmid(Node head)
        {
            Node slow=head;
            Node fast=head;
            
            while(fast.next!=null && fast.next.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }
            
            return slow;
            
        }
        
        static Node reverse(Node head)
        {
            Node cur=head;
            Node prev=null;
            Node aft=head;
            
            while(cur!=null)
            {
                aft=cur.next;
                cur.next=prev;
                prev=cur;
                cur=aft;
                
            }
            
            return prev;
        }
}

// Linked list Node class
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
