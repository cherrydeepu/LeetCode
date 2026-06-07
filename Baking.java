import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int normalCost=100*N;
		int bribeCost=K+60*N;
		System.out.println(Math.min(normalCost, bribeCost));

	}
}
