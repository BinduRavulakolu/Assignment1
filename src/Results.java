import java.util.Scanner;
public class Results {

	public static void main(String[] args) {
		
		int A,B,C;
		System.out.println("Enter the marks of sub A");
		Scanner in=new Scanner(System.in);
		A=in.nextInt();
		System.out.println("Enter the marks of sub B");
//		Scanner inp=new Scanner(System.in);
		B=in.nextInt();
		System.out.println("Enter the marks of sub C");
//		Scanner input=new Scanner(System.in);
		C=in.nextInt();
		if(A>=60&&B>=60&&C>=60)
		{
			System.out.println("passed");
		}
		else if((A>=60&&B>=60)||(B>=60&&C>=60)||(A>=60&&C>=60))
		{
			System.out.println("Promoted");
		}
		else if((A<=60||B<=60||C<=60)||(A<60&&B<60&&C<60))
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("wrong");
		}
		in.close();
	}

}
