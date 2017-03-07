package strategy;
import data_store.*;

/* 
 *  CLASS : Make_Deposit_A2 (STRATEGY PATTERN)
 */
public class Make_Deposit_A2 extends Make_Deposit
{
	public void Make_Deposit(DataStore dataStore)
	{
		((DataStore2)dataStore).Set_Deposit();
		((DataStore2)dataStore).Compute_Balance_deposit();
		System.out.println("Account 2:: After Deposit, Balance is " + ((DataStore2)dataStore).getbalance() );
	}
}