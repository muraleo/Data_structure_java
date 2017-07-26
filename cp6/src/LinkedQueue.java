public class LinkedQueue<E> implements Queue<E>{
	private SinglyLinkedList<E> list = new SinglyLinkedList<E>();
	public LinkedQueue(){};
	public int size(){return list.size();}
	public boolean isEmpty(){return list.isEmpty();}
	public void enqueue(E e){list.addTail(e);}
	public E dequeue(){return list.removeFirst();}
	public E first(){return list.first();}
}