import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		int date,month,year;
		String  string="xxx";
		Scanner inp=new Scanner(System.in);
		date=Integer.parseInt(inp.next());
		month=Integer.parseInt(inp.next());
		year=Integer.parseInt(inp.next());
		switch(month)
		{
		case 1: string="Jan";
		break;
		case 2: string="Feb";
		break;
		case 3: string="mar";
		break;
		case 4: string="Aprl";
		break;
		case 5: string="May";
		break;
		case 6: string="jun";
		break;
		case 7: string="jul";
		break;
		case 8: string="aug";
		break;
		case 9: string="sep";
		break;
		case 10: string="oct";
		break;
		case 11: string="nov";
		break;
		case 12: string="Dec";	
		break;
		default: System.out.println("wrong entered date "+string);
		}
		System.out.println(+date +"/"+string+"/"+year);
		inp.close();
	}
	

}
