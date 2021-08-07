// Reverse a Linked List using Recursion

public class Q2a
{
	public static void main(String[] args) {
		
		Node head=new Node(10);
		Node q=new Node(20); 
		Node r=new Node(30);    // 10->20->30->40->NULL
		Node s=new Node(40); 
		
		head.next=q;
		q.next=r;
		r.next=s;
		
		// making a previous node
		Node prev=null;
		
		// passing previous also, so that when we reach to last node, it can point to its previous
		Node ans=rev(head, prev);
		
        
        while(ans!=null)
        {
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
		
	}
	
	static Node rev(Node head, Node prev)
	{
	    // base case
	    if(head==null)
	    return head;
	    
	    // recursion, with next head=head.next and next prev=current head
	    Node ans=rev(head.next, head);
	    head.next=prev;

        // this will make our last node as head
	    if(ans!=null)
	    head=ans;
	    
	    return head;
    
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
