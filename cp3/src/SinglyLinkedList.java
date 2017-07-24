public class SinglyLinkedList<E>{
	public static class Node<E>{
		private Node<E> next;		//indicate next node
		private E element;		//denote value of this node

		public Node(E e, Node<E> n){	//constructor
			element = e;
			next = n;
		}

		public E getElement(){return element;}	//get current node's value
		public Node<E> getNext(){return next;}	//return next node
		public void setNext(Node<E> n){next = n;}	//set next node
	}

	//instance variable of singly linked list class
	private Node<E> head;	//head node
	private Node<E> tail;		//tail node
	private int size;		//size of linked list
	public SinglyLinkedList(){};	//constructor which did nothing

	//access method
	public int size(){return size;}	//return list size
	public boolean isEmpty(){return size == 0;}
	public Node<E> first(){return head;}
	public Node<E> last(){return tail;}

	//update method
	public void addFirst(E e){
		head = new Node<>(e, head);
		if(isEmpty()){
			tail = head;
		}
		size++;
	}

	public void addTail(E e){
		Node<E> newest = new Node<>(e, null);

		if(isEmpty()){
			head = newest;
		}
		else{
			tail.setNext(newest);
		}
		tail = newest;
		size++;
	}

	public E removeFirst(){
		if(isEmpty()){
			return null;
		}
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if(isEmpty()) tail = null;
		return answer;
	}
}