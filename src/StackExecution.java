import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class StackExecution {
	Writing writing = new Writing("stackOut.txt");
	private Stack<Integer> stack;
	private Stack<Integer> helperstack1 = new Stack<Integer>();
	
	public StackExecution(Stack<Integer> stack) {
		this.stack=stack;
	}
	
	public void RemoveGreaterNumber(int a) {
		Stack<Integer> helperstack = new Stack<Integer>();
		String writing1 = "After removeGreater "+a+":";
		String writing2="";
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(!(stack.isEmpty())) {
			int number =stack.pop();
			if(number<=a) {
				arr.add(number);
			}
			}
		for(int i = arr.size()-1 ; i>-1 ;  i-- ) {
			stack.push(arr.get(i));
			helperstack.push(arr.get(i));
		}
		while(!(helperstack.isEmpty())) {
			writing2+=helperstack.pop()+" ";
		}
		writing.Writing(writing1, writing2);
		
	}
	
	public int CalculateDistanceofElements() {
		String write1 = "After calculateDistance:";
		int distance = 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(!(stack.isEmpty())) {
			arr.add(stack.pop());
			}
		
		for(int i = arr.size()-1 ; i>-1 ; i--) {
			stack.push(arr.get(i));
			this.helperstack1.push(arr.get(i));
		}
		
		int j = 0;
		
		while(!(helperstack1.isEmpty())) {
		int a = helperstack1.pop();
		
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
		String write2 = "Total distance="+distance;
		writing.Writing(write1, write2);
		return distance;
}
	public void AddorRemoveElements(int a) {
		Stack<Integer> helperstack = new Stack<Integer>();
		String writing1 ="After addOrRemove "+a+":";
		String writing2 ="";
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
				stack.push(randomnumber);
			}
			}
		else {
			
			for(int i = 0 ; i<-(a) ; i++) {
				if(!(stack.isEmpty())) {
					stack.pop();
				}
				
			}
		}
		while(!(stack.isEmpty())) {
		int number = stack.pop();
		writing2 += number+" ";
		helperstack.push(number);
		}
		while(!(helperstack.isEmpty())) {
			stack.push(helperstack.pop());
		}
			


		writing.Writing(writing1, writing2);
		}
	public void  ReverseElements(int a) {//kontrol et bir kez dahaaaa
		Stack<Integer> stackreverse = new Stack<Integer>();
		String writing1 = "After reverse "+a+":";
		String writing2 ="";
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		while(!(stack.isEmpty())) {
			arr.add(stack.pop());
			}
		for(int i = a; i<arr.size() ; i++) {
			stack2.push(arr.get(i));
			}
	while(!(stack2.isEmpty())) {
		int b = stack2.pop();
		stackreverse.push(b);
		stack.push(b);
	}
	for(int j = 0 ; j<a ; j++ ) {
		stack.push(arr.get(j));
		stackreverse.push(arr.get(j));
	}
	while(!(stackreverse.isEmpty())) {
		writing2 += stackreverse.pop()+" ";
	}
	writing.Writing(writing1, writing2);
		}
	
	
	public void SortingElements() {
		Stack<Integer> helperstack = new Stack<Integer>();
		String writing1 = "After sortElements:";
		String writing2 = "";
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(!(stack.isEmpty())) {
			arr.add(stack.pop());
			}
		
		Collections.sort(arr);
		for(int i=arr.size()-1 ; i >-1 ; i--) {
			helperstack.push(arr.get(i));
			stack.push(arr.get(i));
		}
		while(!(helperstack.isEmpty())) {
			writing2+=helperstack.pop()+" ";
		}
		writing.Writing(writing1, writing2);
		
	}
	
	public int DistinctElements() {
		String writing1 ="After distinctElements:";
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(!(stack.isEmpty())) {
			arr.add(stack.pop());
			}
		
		for(int i = arr.size()-1 ; i>-1 ; i--) {
			stack.push(arr.get(i));
			set.add(arr.get(i));
		}
		String writing2="Total distinct element="+set.size();
		writing.Writing(writing1, writing2);
		return set.size();
		
	}
	public void Writing() {
		File file = new File("stack.txt");
		
	    try(BufferedWriter a = new BufferedWriter(new FileWriter(file))){
	    	while(!(stack.isEmpty())) {
	    		a.write(Integer.toString(stack.pop())+" ");
	    	}
	    	
	    	a.close();
	    } 
	    catch (IOException k) {
	        System.out.println("Unable to read file " +file.toString());
	        }
}
}
