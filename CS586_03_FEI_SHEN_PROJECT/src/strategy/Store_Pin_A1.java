package strategy;
import data_store.*;

/* 
 *  CLASS : Store_Pin_Account1 (STRATEGY PATTERN)
 */
public class Store_Pin_A1 extends Store_Pin
{
	public void Store_Pin(DataStore dataStore)
	{
		((DataStore1)dataStore).setPIN();
		System.out.println("Account1:: After Storing the PIN, PIN is " + ((DataStore1)dataStore).PIN );
	}
}


