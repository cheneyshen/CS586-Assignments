package strategy;
import data_store.*;

/* 
 *  CLASS : Display_Balance_A1 (STRATEGY PATTERN)
 */
public class Display_Balance_A1 extends Display_Balance
{
	public void Display_Balance(DataStore dataStore)
	{
		System.out.println("Account 1:: Balance is " + ((DataStore1)dataStore).getbalance() );
	}
}
