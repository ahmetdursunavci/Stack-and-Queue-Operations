import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	private String path;
	public Input(String path) {
		this.path=path;
	}
	public ArrayList<String> ReadFile(int b) {
		if ( b == 0) {
		File file = new File(path);
		ArrayList<String> a = new ArrayList<String>();
		try {
			int i = 0;
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				a.add(scan.next());
				i++;
			}
			return a;
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	
	}
	else {
		ArrayList<String> a = new ArrayList<String>();
		File file = new File(path);
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				a.add(scan.nextLine());
			}
			return a;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
}
	}
	
}

