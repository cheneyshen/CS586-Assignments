package strategy;
import data_store.*;

/* 
 *  CLASS : Penalty_A1 (STRATEGY PATTERN)
 */
public class Penalty_A1 extends Penalty
{
	public void Penalty(DataStore dataStore)
	{
		((DataStore1)dataStore).setPenalty();
		System.out.println("Account 1:: Minimum required balance is $500. So Penalty is applied.");
		System.out.println("Account 1:: After a Penalty of 20$, Balance is " + ((DataStore1)dataStore).balance );
	}
}