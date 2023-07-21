package CircleLinkedList;

public interface ListInterface<E> {
	public void add(int index, E x);
	public void append(E x);
	public E remove(int index);
	public boolean removeStudent(E x);
	public E get(int index);
	public void set(int index, E x);
	public int indexOf(int index, E x);
	public int size();
	public boolean isEmpty();
	public void clear();
}
