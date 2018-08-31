import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args)
	{
		int number,value,sum=0,digit;
//	System.out.println("......");
	Scanner in=new Scanner(System.in);
	number=in.nextInt();
    value=number;
	    while(number>0)
	    {
	    digit=number%10;
	    sum=sum+(digit*digit*digit);
	    number=number/10;
		}
	    if(sum==value)
	    {
	    	System.out.println("amstrong number");
	    }
	    else
	    {
	    	System.out.println("not amstrong");
	    }
	    in.close();
	    }
	}

