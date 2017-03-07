package strategy;
import data_store.*;

/* 
 *  CLASS : Store_Balance_Account2 (STRATEGY PATTERN)
 */
public class Store_Balance_A2 extends Store_Balance
{
	public void Store_Balance(DataStore dataStore)
	{
		((DataStore2)dataStore).setbalance();
		System.out.println("Account2:: After Storing the Balance, Balance is " + ((DataStore2)dataStore).getbalance() );
	}
}

