import java.util.*;
public class mainmenu 
{	
	public static void main(String... args)
	{
		int i=0,n;
		String name;
		screen sc;
		student s;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter how many students you want\n");
	    n=a.nextInt();
		while(i<n)
		{
			System.out.println("Enter student name\n");
			name=a.next();
			//System.out.println("---"+name);
			sc=new screen(name);
			i++;
		}
		s=new student();
		System.out.println(s.toString());
		
	}
}
