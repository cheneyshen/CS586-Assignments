package strategy;
import data_store.*;

/* 
 *  CLASS : Store_ID_Account1 (STRATEGY PATTERN)
 */
public class Store_ID_A1 extends Store_ID
{
	public void Store_ID(DataStore dataStore)
	{
		((DataStore1)dataStore).setID();
		System.out.println("Account1:: After Storing the ID, ID is " + ((DataStore1)dataStore).ID );
	}
}


