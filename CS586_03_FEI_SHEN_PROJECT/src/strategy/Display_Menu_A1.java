package strategy;
import data_store.*;

/* 
 *  CLASS : Display_Menu_A1 (STRATEGY PATTERN)
 */
public class Display_Menu_A1 extends Display_Menu
{
	public void Display_Menu()
	{
		System.out.println("Account 1:: Transaction Menu " );
		System.out.println("   1:: Balance " );
		System.out.println("   2:: Deposit " );
		System.out.println("   3:: Withdraw " );	
		System.out.println("   4:: Lock " );		
		System.out.println("   5:: Logout " );	
	}
}

