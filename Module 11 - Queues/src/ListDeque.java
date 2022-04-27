import java.util.*;


public class ListDeque<T> implements DequeInterface<T>{

	private List<T> list;
	
	public ListDeque() {
		list = new ArrayList<T>();	
	}
	
	
	public void addToFront(T newEntry) {
		if (list.size()==0)
			list.add(newEntry);
		else
			list.add(0,newEntry);		
	}

	public void addToBack(T newEntry) {
		list.add(newEntry);
		
	}

	public T removeFront() {
		if (isEmpty())
			throw new EmptyQueueException();
		else
			return list.remove(0);			
	}

	public T removeBack() {
		if (isEmpty())
			throw new EmptyQueueException();
		else
			return list.remove(list.size()-1);		
	}

	public T getFront() {
		if (isEmpty())
			throw new EmptyQueueException();
		else
			return list.get(0);		
	}

	public T getBack() {
		if (isEmpty())
			throw new EmptyQueueException();
		else
			return list.get(list.size()-1);	
	}

	public boolean isEmpty() {
		return (list.size() == 0);
	}

	public void clear() {
		list.clear();	
	}	


}

