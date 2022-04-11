package currency_denomination;

import java.util.Scanner;

public class Question_two 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of currency denominations");
	int noofDenomination=sc.nextInt();
	int currencyDenomination[]=new int[noofDenomination];
	System.out.println("Enter the values of array");
	for(int i=0;i<noofDenomination;i++) {
		currencyDenomination[i]=sc.nextInt();
	}
	
	
	System.out.println("Enter the amount you want to pay");
	int pay_amount=sc.nextInt();
	
	int coins=findMinCoins(currencyDenomination,noofDenomination, pay_amount);
	System.out.println( "Your payment approach in order to give min no of notes will be "+coins);
	
}
private static  int findMinCoins(int[]coins, int m,int V)
{
	// base case
    if (V == 0) 
    	return 0;
   
    // Initialize result
    int res = Integer.MAX_VALUE;
   
    // Try every coin that has smaller value than V
    for (int i=0; i<m; i++)
    {
      if (coins[i] <= V)
      {
          int sub_res = findMinCoins(coins, m, V-coins[i]);
   
          // Check for INT_MAX to avoid overflow and see if
          // result can minimized
          if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
             res = sub_res + 1;
      }
    }
    return res;
}
}
