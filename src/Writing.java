import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
	private String path;
	public Writing(String path) {
		this.path=path;
	}
	public void Writing(String b,String c) {
		File file = new File(path);
		
	    try(BufferedWriter a = new BufferedWriter(new FileWriter(file,true))){
	    	a.write(b);
	    	a.newLine();
	    	a.write(c);
	    	a.newLine();
	    	a.close();
	    } 
	    catch (IOException k) {
	        System.out.println("Unable to read file " +file.toString());
	        }
}
}
