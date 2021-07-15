import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Rain_Water {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of elements :");
		int n = sc.nextInt();
		System.out.println("Enter the elements :");
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int res = 0;
		for(int i =1;i<n-1;i++)
		{
			int left = arr[i];
			for(int j=0;j<i;j++)
			{
				left = Math.max(left,arr[j]);
			}
			int right = arr[i];
			for(int j=i+1;j<n;j++)
			{
				right = Math.max(right, arr[j]);
			}
			res+= Math.min(left,right)-arr[i];
		}
		System.out.println("The volume :"+res);
	}

}
