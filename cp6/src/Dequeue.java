public interface Dequeue<E>{
	//access method
	int size();
	boolean isEmpty();
	E first();
	E last();

	//update method
	void addFirst(E e);
	void addLast(E e);
	E removeFirst();
	E removeLast();
}