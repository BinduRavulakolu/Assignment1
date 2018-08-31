import java.util.Scanner;
public class ArrayList {
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException{
		int expected,flag=0;
		Scanner in = new Scanner(System.in);
 
		System.out.print("Enter how many numbers do you want: ");
		int n = Integer.parseInt(in.nextLine());
 
		
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter the number " + (i+1) + " : ");
			array[i] = in.nextInt();
		}
	//	for (int i = 0; i < array.length; i++) {
		//}
		System.out.println("Enter the value to be searched");
		expected=in.nextInt();
		for (int i=0;i<=array.length;i++) {
			if(expected==array[i])
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
				break;
			}
		}
			if(flag==1) 
			{
				System.out.println("yes it is matched with searched");
			}
			else
			{
				System.out.println("No it is not matched with searched");
			}
		}
	
}