public interface Queue<E>{
	//access method
	int size();
	E first();
	boolean isEmpty();

	//update method
	void enqueue(E e);
	E dequeue();
}