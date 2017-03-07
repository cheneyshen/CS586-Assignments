package strategy;
import data_store.*;

/* 
 *  CLASS : Display_Balance_A2 (STRATEGY PATTERN)
 */
public class Display_Balance_A2 extends Display_Balance
{
	public void Display_Balance(DataStore dataStore)
	{
		System.out.println("Account 2:: Balance is " + ((DataStore2)dataStore).getbalance() );
	}
}