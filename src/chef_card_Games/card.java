package chef_card_Games;

import java.util.Scanner;

public class card {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)throws java.lang.Exception {
		int i,j;
		
		
		int test_cases = sc.nextInt();
		for(i=0;i<test_cases;i++)
		{
				
			int chef_point=0;
			int morty_point=0;
			
			
			int n = sc.nextInt();
			for(j=0;j<n;j++)
			{int modulo=0,sum_chef=0,sum_morty=0;
			
			int chef_card_digit = sc.nextInt();
			int morty_card_digit = sc.nextInt();
				while(chef_card_digit>0)    
				{    
				modulo=chef_card_digit%10;    
				sum_chef=sum_chef+modulo;    
				chef_card_digit=chef_card_digit/10;    
				}    
			
				while(morty_card_digit>0)    
				{    
				modulo=morty_card_digit%10;    
				sum_morty=sum_morty+modulo;    
				morty_card_digit=morty_card_digit/10;    
				}   
				
				if(sum_chef == sum_morty)
				{
					chef_point++;
					morty_point++;
				}
				else if(sum_chef > sum_morty)
				{
					chef_point++;
				}
				else {
					
					morty_point++;
				}
			}
			
			if(chef_point == morty_point)
			{
				System.out.println("2 "+chef_point);
			}
			else if(chef_point > morty_point)
			{
				System.out.println("0 "+chef_point);
			}
			else {
				System.out.println("1 "+morty_point);
			}
		}	
	}
}
