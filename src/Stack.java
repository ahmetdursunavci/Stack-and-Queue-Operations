import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unchecked")
public class Stack<E>  {
	public ArrayList<E> mydatastr = new ArrayList<E>();
	public Stack(List<E> a) {
		this.mydatastr=(ArrayList) a ;
	}
	public Stack() {}
	public void push(E a) {
		mydatastr.add(0,a);
		
	}
	public int size() {
		return mydatastr.size();
	}
	public E pop() {
		if(isEmpty()) {
			System.out.println("your stack is empty");
			return null;
		}
		else {
		E a = mydatastr.get(0);
		mydatastr.remove(0);
		return a;
		}
	}
	
	public boolean isEmpty() {
		return this.mydatastr.isEmpty();
	}
	public E peek() {
		if(isEmpty()) {
			System.out.println("your stack is empty");
			return null;
		}
		else {
		return mydatastr.get(0);
		}
	}
	

}

