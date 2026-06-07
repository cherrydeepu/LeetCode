import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		int Y=s.nextInt();
		int Z=s.nextInt();
		int australiaTotal=X+Z;
		System.out.println(Math.max(0,australiaTotal-Y+1));

	}
}
