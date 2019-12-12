
public class reverse {
	public static void main(String[] arg)
	{
		String A="appa",b="";
		for(int i=A.length()-1;i>-1;i--)
		{
			b=b+A.charAt(i);
		}
		System.out.println(b);
		if(A.compareTo(b)==0)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
}
