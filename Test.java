import java.io.FileInputStream;

class Test 
 {
public static void main(String[] args) 
{
	//FileInputStream fis=new FileInputStream("d:/abc.txt");
	try
	{
		Class.forName("com.mysql.jdbc.driver");
	}
	catch(Exception e)
	{
System.out.println(e);
	}

}
 }
