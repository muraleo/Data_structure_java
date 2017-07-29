public abstract class AbstractPriorityQueue<K, V> implements PriorityQueue<K, V>{
	//Nested priority class
	protected static class PQEntry<K, V> implements Entry<K,V>{
		//instance variable
		private K k;
		private V v;

		//constructor
		public PQEntry(K key, V value){
			k = key;
			v = value;
		}

		//access method
		public K getKey(){return key;}
		public V getValue(){return value;}

		//update method
		protected void setKey(K key){k = key;}
		protected void setValue(V value){v = value;}
	}//end of PQEntry inner class

	//instance variable of AbstractPriorityQueue
	private Comparator<K> comp;

	//constructor
	protected AbstractPriorityQueue(Comparator<K> c){comp = c;}
	protected AbstractPriorityQueue(){this(new DefaultComparator<K>());}

	//method for comparing two entries according to key
	protected int compare(Entry<K, V> a, Entry<K, V> b){
		return comp.compare(a.getKey(), b.getKey());
	}

	//Determine whether key is valid
	protected boolean checkKey(K key) throws IllegalArgumentException{
		try{
			return (comp.compare(key, key)==0);
		}catch(ClassCastException e){
			throw new IllegalArgumentException("Incompatible key");
		}
	}

	//Test whether priority queue is empty
	public boolean isEmpty(){return size==0;}
}