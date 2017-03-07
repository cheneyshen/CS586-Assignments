package strategy;
import data_store.*;

/* 
 *  CLASS : Store_Pin_Account2 (STRATEGY PATTERN)
 */
public class Store_Pin_A2 extends Store_Pin
{
	public void Store_Pin(DataStore dataStore)
	{
		((DataStore2)dataStore).setPIN();
		System.out.println("Account2:: After Storing the PIN, PIN is " + ((DataStore2)dataStore).PIN );
	}
}

