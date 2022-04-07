/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i=0,t=0 , n=0,gasoline=0;
		int arr[];
		Scanner cin = new Scanner(System.in);
		t=cin.nextInt();
		while(t-->0)
		{
		    n=cin.nextInt();
		    arr=new int[n];
		    for(i=0;i<n;i++)
		    {
		        arr[i]=cin.nextInt();
		    }
		    for(i=0;i<n;i++)
		    {
		        gasoline+=arr[i];
		        if(gasoline<i+1)
		            {    
		                System.out.println(i);
		                break;
		            }
		    }
		    if(i==n)
		        System.out.println(gasoline);
		  gasoline=0;
		}
	}
}