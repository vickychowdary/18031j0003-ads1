import java.util.*;
import java.lang.*;

public class mainmenu 
{
	public static int hashcode(int j)
	{
		int k=17;
		return (3*j+k)%4;
	}
	public static void main(String... args)
	{
		student details;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number of student you want\n");
		int n= sc.nextInt();
		student[] st=new student[n];
		int[] st1=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter roll number\n");
			int rollnumber=sc.nextInt();
			System.out.println("Enter name\n");
			String name = sc.next();
			System.out.println("Enter total marks\n");
			double totalmarks = sc.nextDouble();
			st[i]= new student(rollnumber,name,totalmarks);
			st1[i]=hashcode(st[i].rollnumber);
		}
		System.out.println("**"+Arrays.toString(st1));
		System.out.println("Enter how many results you want\n");
		int m=sc.nextInt();
		for(int j=0;j<m;j++)
		{
			System.out.println("Enter roll number\n");
			int z=hashcode(sc.nextInt());
			System.out.println("**"+z);
			System.out.println("Enter 1- for name, 2- for total marks\n");
			switch(sc.nextInt())
			{
			case 1: 
				for(int k=0;k<st1.length;k++)
				{
					if(st1[k]==z)
					{
						System.out.println(st[k].rollnumber+" "+st[k].name);
						break;
					}
				}
			case 2: 
				for(int k=0;k<st1.length;k++)
				{
					if(st1[k]==z)
					{
						System.out.println(st[k].rollnumber+" "+st[k].totalmarks);
					}
				}
			}
		}
	}
}
