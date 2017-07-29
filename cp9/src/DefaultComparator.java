public class DefaultComparator<E> extends Comparator<E>{
	public int compare(E a, E b) throws ClassCastException{
		return (Comparator<E>(a).compareTo(b));
	}
}