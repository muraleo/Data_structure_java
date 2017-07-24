public class CircularlyLinkedList<E>{ // remember <E> at class name
	public static class Node<E>{
		private E element;
		private Node<E> next;

		public Node(E e, Node<E> n){
			element = e;
			next = n;
		}

		public void setNext(Node<E> n){
			next = n;
		}
		public E getElement(){
			return element;
		}
		public Node<E> getNext(){
			return next;
		}
	}

	//instance variable of CircularlyLinkedList class
	private Node<E> tail=null;
	private int size = 0;
	public CircularlyLinkedList(){};

	//access method
	public int size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public E first(){
		if(isEmpty()) return null;
		return tail.getNext().getElement();
	}
	public E last(){
		if(isEmpty()) return null;
		return tail.getElement();
	}

	//update method
	public void rotate(){
		if(tail!=null) tail = tail.getNext();
	}
	public void addFirst(E e){
		if(isEmpty()){
			//this is wrong
			//tail.setNext(new Node<>(e, tail));
			tail = new Node<>(e, null);
			tail.setNext(tail);
		}else{
			tail.setNext(new Node<>(e, tail.getNext()));
		}
		size++;
	}
	public void addLast(E e){ //will change tail
		addFirst(e);
		tail = tail.getNext();
	}
	public E removeFirst(){
		if(isEmpty()) return null;
		E answer = tail.getNext().getElement();
		tail.setNext(tail.getNext().getNext());
		size--;
		if(isEmpty()) tail = null;
		return answer;
	}
}