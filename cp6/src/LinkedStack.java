public class LinkedStack<E> implements Stack<E>{
	private SinglyLinkedList<E> list = new SinglyLinkedList<E>();
	//constructor
	public LinkedStack(){};

	//access method
	public int size(){return list.size();}
	public boolean isEmpty(){return list.isEmpty();}

	//update method
	public void push(E e){list.addFirst(e);}
	public E pop(){return list.removeFirst();}
	public E top(){return list.first();}
}