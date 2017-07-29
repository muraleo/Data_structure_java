import java.util.*;
public interface Tree<E> extends Iterable<E>{
	Position<E> root();
	Position<E> parent(Position<E> p) throws IllegalArgumentException;
	Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException;
	int numChildren(Position<E> p) throws IllegalArgumentException;

	//query method
	boolean isInternal(Position<E> p) throws IllegalArgumentException;
	boolean isExternal(Position<E> p) throws IllegalArgumentException;
	boolean isRoot(Position<E> p) throws IllegalArgumentException;

	int size();
	boolean isEmpty();
	Iterator<E> iterator();	
	Iterator<Position<E>> positions();
}