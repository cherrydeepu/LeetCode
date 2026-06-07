import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int R=s.nextInt();
		int B=s.nextInt();
		int t=Math.min(R,B);
		int skill=R+2*B+2*t;
		System.out.println(skill);

	}
}
