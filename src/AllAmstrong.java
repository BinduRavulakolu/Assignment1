
public class AllAmstrong {

	public static void main(String[] args) {
		//int m,a,x=0;// TODO Auto-generated method stub
for(int i=100;i<=1000;i++)
{
	int number=i;
	int digit=0;
	int sum=0;
	 while(number>0)
	    {
	    digit=number%10;
	    sum=sum+(digit*digit*digit);
	    number=number/10;
		}
	 if(i==sum)
	 {
		 System.out.println(+i);
	 }
	
}


	}
}
