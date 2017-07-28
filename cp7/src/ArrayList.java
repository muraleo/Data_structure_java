public class ArrayList<E> implements List<E>{
	public final static int CAPACITY = 18;
	//instance variable
	private int size = 0;
	private E[] data;

	//constructor has no <E>
	public ArrayList(){this(CAPACITY);}
	public ArrayList(int capacity){
		data = (E[]) new Object[capacity];
	}

	//access method
	public int size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public E get(int i) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		return data[i];
	}
	public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException{
		checkIndex(i, size+1); // size+1
		if(size == CAPACITY) throw new IllegalStateException("List is full.");
		for(int k = size-1;k>=i;k--){
				data[k+1] = data[k];
			}
		data[i] = e;
		System.out.println(data[i]);
		size++;
	}
	public E set(int i, E e) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	public E remove(int i) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		E temp = data[i];
		for(int k = i; k<size-1; k++){
			//System.out.println("size: "+size()+" i is: "+i);
			data[k] = data[k+1];
		}
		data[size-1] = null; //for garbage collection
		size--;
		return temp;
	}

	//utility method
	public void checkIndex(int i, int n) throws IndexOutOfBoundsException{
		//remember new!
		if(i<0 || i>=n) throw new IndexOutOfBoundsException("illegal index: "+i);
	}

	//resize method for dynamic array
	protected void resize(int capacity){
		E[] temp = (E []) new Object[capacity];
		for(int i=0; i<size; i++){
			temp[i] = data[k];
		}
		data = temp;
	}
}