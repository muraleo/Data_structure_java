public abstract class AbstractTree<E> implements Tree<E>{
	//basic functionality of Tree class
	public boolean isInternal(Position<E> p){return numChildren(p)>0;}
	public boolean isExternal(Position<E> p){return numChildren(p)==0;}
	public boolean isEmpty(){return size()==0;}
	public boolean isRoot(Position<E> p){return p==root();}
}