import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args){
		ArrayList<String> input = new Input(args[0]).ReadFile(1);

		
		ArrayList<String> b = new Input("queue.txt").ReadFile(0);
		ArrayList<String> a = new Input("stack.txt").ReadFile(0);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = a.size()-1 ; i>-1 ; i--) {
			stack.push(Integer.valueOf(a.get(i)));
			}
		
		Queue<Integer> queue = new Queue<Integer>();
		
		for(String s : b) {
			queue.enqueue((int)Integer.valueOf(s));
			}
		StackExecution stex = new StackExecution(stack);
		QueueExecution quex = new QueueExecution(queue);
		
		for(int i = 0 ; i < input.size() ; i++) {
			String[] arr = input.get(i).split(" ");
			if(arr[0].equals("Q")) {
				if(arr[1].equals("removeGreater")) {
					quex.RemoveGreaterNumber(Integer.parseInt(arr[2]));
				}
				else if(arr[1].equals("calculateDistance")) {
					quex.CalculateDistanceofElements();
				}
				else if(arr[1].equals("sortElements")) {
					quex.SortingElements();
				}
				else if(arr[1].equals("distinctElements")) {
					quex.DistinctElements();
				}
				else if(arr[1].equals("addOrRemove")) {

					quex.AddorRemoveElements(Integer.parseInt(arr[2]));
				}
				else {
					quex.ReverseElements(Integer.parseInt(arr[2]));
				}
				}
			else {
				if(arr[1].equals("removeGreater")) {
					stex.RemoveGreaterNumber(Integer.parseInt(arr[2]));
				}
				else if(arr[1].equals("calculateDistance")) {
					stex.CalculateDistanceofElements();
				}
				else if(arr[1].equals("sortElements")) {
					stex.SortingElements();
				}
				else if(arr[1].equals("distinctElements")) {
					stex.DistinctElements();
				}
				else if(arr[1].equals("addOrRemove")) {
					stex.AddorRemoveElements(Integer.parseInt(arr[2]));
				}
				else {
					stex.ReverseElements(Integer.parseInt(arr[2]));
				}
			}
			
			}

		stex.Writing();
		quex.Writing();
		}

}
