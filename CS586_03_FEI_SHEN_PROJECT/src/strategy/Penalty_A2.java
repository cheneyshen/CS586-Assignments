package strategy;
import data_store.*;

/* 
 *  CLASS : Penalty_A2 (STRATEGY PATTERN)
 */
public class Penalty_A2 extends Penalty
{
	public void Penalty(DataStore dataStore)
	{
		System.out.println("Account 2:: Minimum required balance is $0.But no Penalty is applied.");
	}
}