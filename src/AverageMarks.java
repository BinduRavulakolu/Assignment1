import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		int s1A,s1B,s1C,s2A,s2B,s2C,s3A,s3B,s3C;
		double x,y,z,s,t,u;
		int a,b,c,p,q,r;
		System.out.println("");
		Scanner i=new Scanner(System.in);
		System.out.println("Enter the marks of student1");
		s1A=Integer.parseInt(i.next());
		s1B=Integer.parseInt(i.next());
		s1C=Integer.parseInt(i.next());
		System.out.println("Enter the marks of student2");
		s2A=Integer.parseInt(i.next());
		s2B=Integer.parseInt(i.next());
		s2C=Integer.parseInt(i.next());
		System.out.println("Enter the marks of student3");
		s3A=Integer.parseInt(i.next());
		s3B=Integer.parseInt(i.next());
		s3C=Integer.parseInt(i.next());
		x=(s1A+s1B+s1C)/3;
		y=(s2A+s2B+s2C)/3;
		z=(s3A+s3B+s3C)/3;
		System.out.println("The avg marks of student1 in all subjects are"+x);
		System.out.println("The avg marks of student2 in all subjects are"+x);
		System.out.println("The avg marks of student3 in all subjects are"+x);
		System.out.println(".........");
		a=s1A+s1B+s1C;
		b=s2A+s2B+s2C;
		c=s3A+s3B+s3C;
		System.out.println("The tot marks of student1 in all subjects are"+a);
		System.out.println("The tot marks of student2 in all subjects are"+b);
		System.out.println("The tot marks of student3 in all subjects are"+c);
		System.out.println(".........");
		p=s1A+s2A+s3A;
		q=s1B+s2B+s3B;
		r=s1C+s2C+s3C;
		System.out.println("The tot marks of all students in sub1 are "+p);
		System.out.println("The tot marks of all students in sub1 are "+q);
		System.out.println("The tot marks of all students in sub1 are "+r);
		System.out.println(".........");
		s=(s1A+s2A+s3A)/3;
		t=(s1B+s2B+s3B)/3;
		u=(s1C+s2C+s3C)/3;
		System.out.println("The Avg marks of all students in sub1 are "+s);
		System.out.println("The Avg marks of all students in sub1 are "+t);
		System.out.println("The Avg marks of all students in sub1 are "+u);
		
		
	}
	

}
