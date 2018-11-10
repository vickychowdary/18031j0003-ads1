
import java.util.Hashtable;
import java.util.Scanner;

class Student
{
	String name;
	double marks;
	public Student(String name, double marks)
	{
		this.name=name;
		this.marks=marks;
	}
}
public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Hashtable<Integer,Student> hst = new Hashtable<Integer,Student>();
		String s = sc.nextLine();
		int m = Integer.parseInt(s);
		for(int i=0;i<m;i++)
		{
			String k1 = sc.nextLine();
			String []a = k1.split(",");
			Student st = new Student(a[1],Double.parseDouble(a[2]));
			hst.put(Integer.parseInt(a[0]), st);
		}
		String k2 = sc.nextLine();
		int n = Integer.parseInt(k2);
		for(int i=0;i<n;i++)
		{
			String out = sc.nextLine();
			String []b=out.split(" ");
			if(!hst.containsKey(Integer.parseInt(b[1])))
			{
				System.out.println("Student doesn't exists...");
			}
			else if(Integer.parseInt(b[2])==1)
			{
				Student st1 = hst.get(Integer.parseInt(b[1]));
				System.out.println(st1.name);
			}
			else if(Integer.parseInt(b[2])==2)
			{
				Student st1 = hst.get(Integer.parseInt(b[1]));
				System.out.println(st1.marks);
			}
		}

	}

}
