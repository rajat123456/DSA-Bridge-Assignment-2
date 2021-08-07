// Merge 2 Sorted Linked Lists into one single Linked List

public class Q4
{
	public static void main(String[] args) {
		
		Node head1=new Node(10);
		Node q=new Node(30);    // List 1: 10->30->60->NULL
		Node r=new Node(60); 
		
		head1.next=q;
	    q.next=r;
		
		Node head2=new Node(20);
		Node z=new Node(50);    // List 2: 20->50->70->NULL
		Node x=new Node(70); 
		
		head2.next=z;
		z.next=x;
		
		
		Node res=null;
	    
	    // merge 2 LLs into 1 List
	    res=merge(head1, head2, res);
	
		// printing LL
		while(res!=null)
		{
		    System.out.print(res.data+" ");
		    res=res.next;
		}
		
}
        
        static Node merge(Node n1, Node n2, Node res)
        {
            // resultant list's head
            Node head=null;
            
            while(n1!=null && n2!=null)
            {
                if(n1.data<=n2.data)
                {
                    if(res==null)
                    {
                      res=new Node(n1.data);
                      head=res;
                    }
                    
                    else
                    {
                      res.next=n1;
                      res=res.next;
                    }
                    
                    n1=n1.next;
                }
                
                else if(n2.data<n1.data)
                {
                    if(res==null)
                    {
                     res=new Node(n2.data);
                     head=res;
                    }
                    
                    else
                    {
                      res.next=n2;
                      res=res.next;
                    }
                    
                    n2=n2.next;
                }
            }
            
            // if n2 list left and n1 is empty, append n2
            if(n1==null && n2!=null)
            {
                res.next=n2;
            }
            
            // if n1 list left and n2 is empty, append n1
            else if(n2==null && n1!=null)
            {
                res.next=n1;
            }
            
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
