// Reverse a Linked List Using Stack

public class Q2b
{
	public static void main(String[] args) {
		
		Node head=new Node(10);
		Node q=new Node(20); 
		Node r=new Node(30);    // 10->20->30->40->NULL
		Node s=new Node(40); 
		
		head.next=q;
		q.next=r;
		r.next=s;
		
		// if LL is empty
		if(head==null)
		{
	    	System.out.println("Empty LL");
	    	return;
		}
		
		StackUsingArray st=new StackUsingArray(4);
		
		Node temp=head;
		
		// Inserting nodes in Stack
	    while(temp!=null)
	    {
	        push(temp, st);
	        temp=temp.next;
	    }
		
		// Reversing LL
		temp=reverse(st);
		
		// printing LL
		while(temp!=null)
		{
		    System.out.print(temp.data+" ");
		    temp=temp.next;
		}
		
}
        
        static void push(Node temp, StackUsingArray st)
        {
            if(st.top+1==st.arr.length)
            return;
            
            ++st.top;
            st.arr[st.top]=temp;
            
        }
        
        static Node reverse(StackUsingArray st)
        {
            Node popped=st.arr[st.top];
            Node head=popped;
            
            while(st.top!=0)
            {
              --st.top;
              popped.next=st.arr[st.top];
              popped= st.arr[st.top];
            }
            
            popped.next=null;
            
            return head;
            
        }

}

// Stack Using Array
class StackUsingArray
{
    Node[]arr;
    // defined top here only
    int top;
    
    StackUsingArray(int val)
    {
        arr=new Node[val];
        top=-1;
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
