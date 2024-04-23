
public class Stringtostringbuilder 
{
	public static void main(String[] args) 
	{
		String name[]={"My", "Name", "is", "Ranu", "Soni","."};
		StringBuilder sb = new StringBuilder();
		sb.append(name[0]);
		sb.append(" "+name[1]);
		sb.append(" "+name[2]);
		sb.append(" "+name[3]);
		sb.append(" "+name[4]);
		sb.append(name[5]);
		System.out.println(sb.toString());
		}

	

	}


