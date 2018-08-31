import java.util.Scanner;
public class Interest {

	public static void main(String[] args) {
		double p,t,r,si,ci,x;
		System.out.println("Enter the principle amount");
		Scanner in=new Scanner(System.in);
		p=in.nextDouble();
		System.out.println("Enter the time");
		t=in.nextDouble();
		System.out.println("Enter the rate of interest");
		r=in.nextDouble();
		x=(p*t*r);
		si=x/100;
		System.out.println("the simple interest would be"+si);
		ci=p*Math.pow(1.0+r/100.0,t)-p;
		System.out.println("the coumpound interest would be"+ci);
		in.close();
	} 

}
