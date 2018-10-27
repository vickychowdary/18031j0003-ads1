import java.io.*;
import java.util.*;



public class database 
{
	public static void save(student details)
	{
		Vector<student> v=new Vector<student>();
		File f=new File("studentsdata.txt");
		try {
			if(f.exists());
			{
				FileInputStream fi= new FileInputStream("studentsdata.txt");
				ObjectInputStream fr=new ObjectInputStream(fi);
				 v=(Vector<student>) fr.readObject();
				 fr.close();
			}
		}catch (Exception e) 
		{
				e.printStackTrace();
		}
	}
}
