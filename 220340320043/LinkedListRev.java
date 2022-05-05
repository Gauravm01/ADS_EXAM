public class LinkedListRev{
	static LinkedList head;
	static class LinkedList{
	
	int value;
	LinkedList next;
	
	LinkedList(int num){
	
	value = num;
	next = null;
	}
	
	}
	
	LinkedList reverse(LinkedList node){
	
	LinkedList prev =null;
	LinkedList nod =node;
	LinkedList next = null;
	
	while(nod!=null){
	next =nod.next;
	nod.next=prev;
	prev=nod;
	nod =next;
	}
	node=prev;
	return node;
	}
	
	void Display(LinkedList nde){
		while(nde!=null){
		System.out.println(nde.value);
		nde=nde.next;
		}
	}
	
	public static void main(String... args){
	
	LinkedListRev obj =new LinkedListRev();
	
	obj.head=new LinkedList(2);
	
	obj.head.next= new LinkedList(4);
	
	obj.head.next.next= new LinkedList(4);
	
	obj.head.next.next.next= new LinkedList(4);
	
	obj.head.next.next.next.next= new LinkedList(3);
	
	obj.head.next.next.next.next.next= new LinkedList(2);
	
	obj.head.next.next.next.next.next.next= new LinkedList(5);
	
	
	
	
	System.out.println("The Linked List before Reversal is : ");
	
	obj.Display(head);
	head =obj.reverse(head);
	System.out.println("\n");
	System.out.println("The Linked List After Reversal is : ");
	obj.Display(head);
	
	
	}
}
