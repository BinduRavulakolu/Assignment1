import  java.io.*;
import java.util.Scanner;
public class Cui {

	public static void main(String[] args) {
String user="Bindu";
String pass="!@bvyshu";
Scanner in = new Scanner(System.in);
System.out.println("Enter username and password");

int flag=0;
for(int i=0;i<3;i++)
{
	String u=in.nextLine();
	String p=in.nextLine();

if(user.equals(u)&&pass.equals(p))
{
	System.out.println("Welcome" +user);
    System.out.println("enter again");
	flag++;
}
}
if(flag==3)
{
	System.out.println("Welcome");
}
else
	{

		System.out.println("no");
		}
}
}
