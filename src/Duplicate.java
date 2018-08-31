import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Duplicate {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("write a string");
		String input=in.readLine();
	        String output = new String();
	        char c;

	        for (int i = 0; i < input.length(); i++) {
	        	// System.out.println("....");
	        	 c=input.charAt(i);
	        	 if(c!=' ')
	        	 {
	        		 output=output+c;
	        		 input=input.replace(c, ' ');
	        	 }
	            
	                }
	        

	        System.out.println(output);

	    }

	}

