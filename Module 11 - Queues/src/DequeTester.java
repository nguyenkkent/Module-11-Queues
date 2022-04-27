
public class DequeTester {

	public static void main(String[] args) {
		
		ListDeque<Integer> deque = new ListDeque<Integer>();
		
		deque.addToFront(1);
		deque.addToBack(4);
		System.out.println(deque.isEmpty());
		deque.addToFront(deque.getBack());
		System.out.println(deque.getFront());
		System.out.println(deque.getBack());
//	
	}

}
