import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Collections;

public class K_Largest_element {
	
	public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         for(int i = 0; i < k; i++)
         {
        	 pq.add(arr[i]);
         }
         for(int j = k; j < n; j++)
         {
        	 if(pq.peek()<arr[j])
        	 {
        		 pq.poll();
        		 pq.add(arr[j]);
        	 }
         }
         ArrayList<Integer> al = new ArrayList<Integer>();
         Iterator itr = pq.iterator();
         while(itr.hasNext())
         {
        	 al.add((Integer) itr.next());
         }
         Collections.sort(al,Collections.reverseOrder());
         return al;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("The elements are :");
		for(int i = 0; i < num; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number of largest element needed :");
		int k = sc.nextInt();
		ArrayList<Integer> arrl = new ArrayList<>();
		arrl.addAll(kLargest(arr,num,k));
		System.out.println(arrl);
	}

}
