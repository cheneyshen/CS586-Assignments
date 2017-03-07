package strategy;
import data_store.*;

/* 
 *  CLASS : Store_Balance_Account1 (STRATEGY PATTERN)
 */
public class Store_Balance_A1 extends Store_Balance
{
	public void Store_Balance(DataStore dataStore)
	{
		((DataStore1)dataStore).setbalance();
		System.out.println("Account1:: After Storing the Balance, Balance is " + ((DataStore1)dataStore).getbalance() );
	}
}

