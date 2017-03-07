package strategy;
import data_store.*;

/* 
 *  CLASS : Make_Deposit_A1 (STRATEGY PATTERN)
 */
public class Make_Deposit_A1 extends Make_Deposit
{
	public void Make_Deposit(DataStore dataStore)
	{
		((DataStore1)dataStore).Set_Deposit();
		((DataStore1)dataStore).Compute_Balance_deposit();
		System.out.println("Account 1:: After Deposit, Balance is " + ((DataStore1)dataStore).getbalance() );
	}
}