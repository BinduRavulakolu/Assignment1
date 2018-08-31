import java.io.*;

public class ReverseString {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("give the input");
		String s=in.readLine();
		String word[]=s.split(" ");
        String last="";
        for(int i=0;i<word.length;i++)
        {
        	String rev="";
        	for(int j=word[i].length()-1;j>=0;j--)
        	{
        		rev+=word[i].charAt(j);
        	}
        	last+=rev+" ";
        	}
	System.out.println("the reverse string is "+last);
	}
}
