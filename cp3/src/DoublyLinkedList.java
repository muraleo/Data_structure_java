public class DoublyLinkedList<E>{
	public static class Node<E>{
		private E element;
		private Node<E> prev;
		private Node<E> next;

		public Node(E e, Node<E> p, Node<E> n){
			element = e;
			prev = p;
			next = n;
		}

		//access method
		public E getElement(){return element;}
		public Node<E> getPrev(){return prev;}
		public Node<E> getNext(){return next;}

		//update method
		public void setPrev(Node<E> p){
			prev = p;
		}
		public void setNext(Node<E> n){
			next = n;
		}
	}

	//instance variables of DoublyLinkedList
	private Node<E> header;
	private Node<E> trailer;
	private int size;
	public DoublyLinkedList(){
		header = new Node(null, null, null);
		trailer = new Node(null, header, null);
		header.setNext(trailer);
	}

	//access method
	public int size(){return size();}
	public boolean isEmpty(){return size==0;}
	public E first(){
		if(isEmpty()) return null;
		return header.getNext().getElement();
	}
	public E last(){
		if(isEmpty()) return null;
		return trailer.getPrev().getElement();
	}

	//update method
	public void addFirst(E e){
		//header.setNext(new Node<E>(e, header, header.getNext()));
		addBetween(e, header, header.getNext());
	}

	public void addLast(E e){
		addBetween(e, trailer.getPrev(), trailer);
	}

	public E removeFirst(){
		if(isEmpty()) return null;
		return remove(header.getNext());
	}

	public E removeLast(){
		if(isEmpty()) return null;
		return remove(trailer.getPrev());
	}

	//help method
	public void addBetween(E e, Node<E> predecessor, Node<E> successor){
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		--size;
	}

	public E remove(Node<E> n){
		n.getPrev().setNext(n.getNext());
		n.getNext().setPrev(n.getPrev());
		size--;
		return n.getElement();
	}
}