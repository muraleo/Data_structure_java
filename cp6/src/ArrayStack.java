public class ArrayStack<E> implements Stack<E>{
	//instance variable	
	public static final int CAPACITY = 1000;
	private E[] data;
	private int t = -1;

	//constructors
	public ArrayStack(){this(CAPACITY);}
	public ArrayStack(int capacity){
		data = (E[]) new Object[capacity];
	}

	//access method
	public int size(){return t+1;}
	public boolean isEmpty(){return t==(-1);}
	public void push throw IllegalStateException(E e){
		if(siez() == CAPACITY) throw IllegalStateException("Stack is full!");
		data[++t] = e;
	}
	public E pop(){
		if(isEmpty()) return null;
 		return data[t--];
	}
	public E top(){
		if(isEmpty()) return null;
		return data[t];
	}

	public static void main(String[] args){
		//java generic cannot use primitive type, need to replace 
		//by corresponding wrapper object class
		ArrayStack<Integer> as = new ArrayStack<Integer>();
		as.push(1);
		as.push(2);
		System.out.println(as.pop());
		System.out.println(as.pop());
		System.out.println(as.top());
	}
}