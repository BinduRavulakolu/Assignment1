import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mod,add=0,value,number;
		System.out.println("Enter your data");
		Scanner inp=new Scanner(System.in);
	    value=inp.nextInt();
        number=value;
	
			while(value>0)
			{
			mod=value%10;
			add=add*10+mod;
			value=value/10;
			}
			if(number==add)
		{
				System.out.println("yes palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
				}
		
inp.close();
	}

}
