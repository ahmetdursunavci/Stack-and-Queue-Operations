import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class QueueExecution {
	Writing writing = new Writing("queueOut.txt");
	private Queue<Integer> queue;
	private Queue<Integer> helperqueue = new Queue<Integer>();
	
	public QueueExecution(Queue<Integer> queue) {
		this.queue=queue;
	}

	public void RemoveGreaterNumber(int a) {
		String write1 = "After removeGreater "+a+":";
		String write2="";
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(!(queue.isEmpty())) {
			int number =queue.dequeque();
			if(number<=a) {
				arr.add(number);
			}
			}
		
		for(int i = 0 ; i<arr.size() ; i++) {
			write2 += arr.get(i)+" ";
			queue.enqueue(arr.get(i));
		}
		writing.Writing(write1, write2);
		}
	
	public int CalculateDistanceofElements() {
		String write1 = "After calculateDistance:";
		String write2 = "";
		int distance = 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(!(queue.isEmpty())) {
			arr.add(queue.dequeque());
			}
		
		for(int i = 0 ; i<arr.size() ; i++) {
			queue.enqueue(arr.get(i));
			this.helperqueue.enqueue(arr.get(i));
		}
		
		int j = 0;
		
		while(!(helperqueue.isEmpty())) {
		int a = helperqueue.dequeque();
		
		for(int i = 1+j ; i<arr.size() ; i++) {
				if(arr.get(i)-a>=0) {
				distance+=arr.get(i)-a;
				
				}
				else {
					distance+=-(arr.get(i)-a);	
				}
		}
		j++;
	}
		write2 = "Total distance="+distance;
		writing.Writing(write1, write2);
		return distance;
}
	
	public void AddorRemoveElements(int a) {
		Queue<Integer> helperqueue = new Queue<Integer>();
		String write1 ="After addOrRemove "+a+":";
		String write2="";
		if(a>0) {
			for(int i = 0 ; i<a ; i++) {
				int randomnumber=0;
				while(true) {
					randomnumber = new Random().nextInt(50);
					if(randomnumber<=0) {
						
					}
					else {
						break;
					}
				}
				queue.enqueue(new Random().nextInt(50));
				
			}
			}
		else {
			
			for(int i = 0 ; i<-(a) ; i++) {
				if(!(queue.isEmpty())) {
					queue.dequeque();
				}
				
			}
		}
		while(!(queue.isEmpty())) {
			int number = queue.dequeque();
			write2+=number+" ";
			helperqueue.enqueue(number);
		}
		while(!(helperqueue.isEmpty())) {
			queue.enqueue(helperqueue.dequeque());
		}
		writing.Writing(write1, write2);
		
		}
	
	public void  ReverseElements(int a) {
		String write1 = "After reverse "+a+":";
		String write2 ="";
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Queue<Integer> queue2 = new Queue<Integer>();
		int count = 0;
		
		while(!(queue.isEmpty())) {
			if(count<a) {
				arr.add(queue.dequeque());
				count++;
			}
			else {
				queue2.enqueue(queue.dequeque());
			}
			}
		
		for(int j = arr.size()-1 ; j>-1 ; j-- ) {
			write2+=arr.get(j)+" ";
			queue.enqueue(arr.get(j));
		}
	while(!(queue2.isEmpty())) {
		int b = queue2.dequeque();
		write2+=b+" ";
		queue.enqueue(b);
	}
	writing.Writing(write1, write2);
		}
	
	
	public void SortingElements() {
		String write1 = "After sortElements:";
		String write2 = "";
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(!(queue.isEmpty())) {
			arr.add(queue.dequeque());
		}
		Collections.sort(arr);
		for(int i = 0 ; i < arr.size() ; i++) {
			write2+=arr.get(i)+" ";
			queue.enqueue(arr.get(i));
		}
		writing.Writing(write1, write2);
	}
	public int DistinctElements() {
		String write1 ="After distinctElements:";
		String write2 = "";
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(!(queue.isEmpty())) {
			arr.add(queue.dequeque());
			}
		
		for(int i = 0 ; i< arr.size() ; i++) {
			queue.enqueue(arr.get(i));
			set.add(arr.get(i));
		}
		write2="Total distinct element="+set.size();
		writing.Writing(write1, write2);
		return set.size();
		
	}
	public void Writing() {
		File file = new File("queue.txt");
		
	    try(BufferedWriter a = new BufferedWriter(new FileWriter(file))){
	    	while(!(queue.isEmpty())) {
	    		String b =Integer.toString(queue.dequeque());
	    		a.write(b+" ");
	    	
	    	}
	    	a.close();
	    	
	    } 
	    catch (IOException k) {
	        System.out.println("Unable to read file " +file.toString());
	        }
}
}




