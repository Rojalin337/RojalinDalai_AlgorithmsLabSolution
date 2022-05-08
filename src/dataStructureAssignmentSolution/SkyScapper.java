package dataStructureAssignmentSolution;

import java.util.Arrays;
import java.util.Scanner;

public class SkyScapper {
	
	public void printFloor() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int f=sc.nextInt();
		
		int [] f_size=new int[f];
		for (int i=0;i<f;i++)
		{
			
			System.out.println("enter the floor size given on day :"+(i+1));
			f_size[i]=sc.nextInt();
		}
		System.out.println("The order of construction is as follows");
	
			int arr[] =Arrays.copyOf(f_size, f);
			Arrays.sort(arr);
			for(int k=arr.length-1;k>=0;k--) 
			{
				for(int j=0;j<f_size.length;j++)
				{
					
					if(arr[k]==f_size[j])
					    {
						System.out.println("Day:"+(j+1));
						System.out.println(f_size[j]);
						break;
					    }
					else
						{
						System.out.println( " ");
						
						}
				
			}
			}
			
	}	
				
public static void main(String[] args) 
{
   SkyScapper s=new SkyScapper();	
	s.printFloor();
	
}
}
