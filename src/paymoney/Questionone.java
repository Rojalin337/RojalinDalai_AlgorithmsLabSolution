package paymoney;

import java.util.Scanner;

public class Questionone {
  private int[] transaction_arr;
  Scanner sc=new Scanner(System.in);

	public Questionone() {
		transaction_arr=create_Arr();
		compare_target(transaction_arr);
	}
	   
	private int[] create_Arr() 
	{
		System.out.println("Enter the size of Transaction array");
		
		int arr_size=sc.nextInt();
		int arr[]=new int[arr_size];
		System.out.println("Enter the values of array");
		for(int i=0;i<arr_size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}  
	private void compare_target(int a[])
	{
		System.out.println("Enter the total  no. of Target that need to be achieved");
		int sum=0;
		int targ=sc.nextInt();
		while(targ--!=0) 
		{
		System.out.println("Enter the value of Target");
		int num=sc.nextInt();
		for(int j=0;j<a.length;j++) {
			sum+=a[j];
			if(sum>num)
			{
			  System.out.println("Target is achieved after "+(j+1)+" transaction");
			   break;
			}
			}
		if(sum<num)
			System.out.println("Given target is not achieved");
		
		}
		
	}
}
		
		