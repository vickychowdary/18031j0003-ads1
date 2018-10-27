import java.util.*;

public class screen 
{
	student details;
	String name;
	Scanner d=new Scanner(System.in);
	public screen(String name)
	{
		details=new student();
		this.name=name;
		details= createProfile();
	}
	private student createProfile() 
	{
		System.out.println("Enter your birth date\n");
		int date = d.nextInt();
		System.out.println("Enter your birth month\n");
		int month=d.nextInt();
		System.out.println("Enter your birth year\n");
		int year=d.nextInt();
		System.out.println("Enter marks of Subject1\n");
		int s1=d.nextInt();
		System.out.println("Enter marks of Subject2\n");
		int s2=d.nextInt();
		System.out.println("Enter marks of Subject3\n");
		int s3=d.nextInt();
		int total=s1+s2+s3;
		details.setDate(date);
		details.setMonth(month);
		details.setYear(year);
		details.setS1(s1);
		details.setS2(s2);
		details.setS3(s3);
		details.setTotal(total);
		database.save(details);
		System.out.println(details.toString());
		return details;
	}
}
