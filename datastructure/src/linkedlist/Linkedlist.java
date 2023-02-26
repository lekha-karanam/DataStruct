package linkedlist;

public class Linkedlist {
	Node head = null;
	public void insert(int data) {
		Node n = new Node();
		n.data= data;
		n.next= null;
		System.out.println("my fist change");
		System.out.println("my branch change");
		if (head==null) {
			head=n;
		}
		else {
			Node n1 = head;
			while(n1.next!=null) {
				n1=n1.next;
			}
			n1.next=n;
		}
	}


	public void show() {
		Node n=head;
		while(n.next!=null) {
			System.out.println(n.data+" ");
			n=n.next;
		}
		System.out.println(n.data+" ");
	}
	

}
