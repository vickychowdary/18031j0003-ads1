import java.io.*;

public class student implements Serializable
{
	public int rollnumber;
	public String name;
	public double totalmarks;

	public student(int roolnumber, String name, double totalmarks) 
	{
		this.rollnumber = roolnumber;
		this.name = name;
		this.totalmarks = totalmarks;
	}

	public String toString() {
		return "student [roolnumber=" + rollnumber + ", name=" + name + ", totalmarks=" + totalmarks + "]";
	}
}
