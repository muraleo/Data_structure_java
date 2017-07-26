public class ArrayQueue<E> implements Queue<E>{
	public static final int CAPACITY = 1000;
	private E[] data;
	private int f = 0;
	private int sz = 0;

	//constructor
	public ArrayQueue(){this(CAPACITY);}
	public ArrayQueue(int capacity){
		data = (E[]) new Object[capacity];
	}

	//access method
	public int size(){return sz;}
	public boolean isEmpty(){return sz==0;}
	public void enqueue(E e) throws IllegalStateException{ //throws
		if(sz == data.length) throw new IllegalStateException("Queue is full"); //throw
		data[(f+1)%data.length] = e;
		sz++;
	}

	public E first(){
		if(isEmpty()) return null;
		return data[f];
	}

	public E dequeue(){
		if(isEmpty()) return null;
		E answer = data[f];
		data[f] = null;
		f = (f+1)%data.length;
		sz--;
		return answer;
	}
}