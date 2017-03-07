package strategy;
import data_store.*;

/* 
 *  CLASS : Store_ID_Account2 (STRATEGY PATTERN)
 */
public class Store_ID_A2 extends Store_ID
{
	public void Store_ID(DataStore dataStore)
	{
		((DataStore2)dataStore).setID();
		System.out.println("Account2:: After Storing the ID, ID is " + ((DataStore2)dataStore).ID );
	}
}


