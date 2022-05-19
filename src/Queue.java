import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@SuppressWarnings("unchecked")
public class Queue<E>{
	ArrayList<E> queuearr = new ArrayList<E>();
	public Queue(List<E> list) {
		this.queuearr=(ArrayList) list;
	}
	public Queue() {}
	public void enqueue(E object) {
		queuearr.add(object);
	}
	public E dequeque() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return null;
		}
		else {
		E removedelement = this.queuearr.get(0);
		queuearr.remove(0);
		return removedelement;
		}
	}
	public E peek() {
		if(queuearr.isEmpty()) {
			System.out.println("queue is empty");
			return null;
		}
		else {
		return queuearr.get(queuearr.size()-1);
		}
	}

	public boolean isEmpty() {
		return queuearr.isEmpty();
	}

}
