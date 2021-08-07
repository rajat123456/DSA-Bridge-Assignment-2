// Delete a node from Linked List, without any head reference

public class Q3
{
	public static void main(String[] args) {
		
		Node head=new Node(10);
		Node q=new Node(20); 
		Node r=new Node(30);    // 10->20->30->40->NULL
		Node s=new Node(40); 
		
		head.next=q;
		q.next=r;
		r.next=s;
	
	    // removing that node(here in this case, 30) without head reference
	    remove(r);
	
		// printing LL
		while(head!=null)
		{
		    System.out.print(head.data+" ");
		    head=head.next;
		}
		
}
        
        static void remove(Node n)
        {
            // if LL has only 1 node, then can't be deleted
            if(n==null || n.next==null)
            {
                System.out.println("LL has only 1 node");
                return;
            }
            
            Node temp=n.next;
            // making content of current node = content of its next node
            n.data=n.next.data;
            
            // freeing that next node
            n.next=n.next.next;
            temp.next=null;
            temp=null;
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
