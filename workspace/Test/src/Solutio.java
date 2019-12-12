
import java.util.Scanner;
public class Solutio {
	
            static boolean isAnagram(String a, String b) {
            	int c=1,d=0;
            	StringBuilder temp=new StringBuilder(b);
            	if(a.length()==b.length())
	        {
	        	for(int i=0;i<a.length();i++)
	        	{
	        	for(int j=0;j<temp.length();j++)
	        	{
	        		System.out.println(c);
	        		if(a.charAt(i)==temp.charAt(j))
	        		{
	        			temp.setCharAt(j,'$');
	        			System.out.println(temp);
                        break;        		
	        	    }
	        		d=j;
	        }
	        	if(d==temp.length()+1)
        			c=0;
	        	
	        	}
	        	
	    }
            	else
            		c=0;
            	if(c==1)
        	   return true;
           else
        	   return false;
            }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

