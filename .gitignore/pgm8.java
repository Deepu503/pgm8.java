/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,N,sum=0;
		Scanner Sc=new Scanner(System.in);
		N=Sc.nextInt();
		for(i=0;i<N;i++)
		{
			sum+=i;
			System.out.println("sum="+sum);
		}
	}
}
