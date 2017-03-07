package strategy;
import data_store.*;

/* 
 *  CLASS : Make_Withdraw_A1 (STRATEGY PATTERN)
 */
public class Make_Withdraw_A1 extends Make_Withdraw
{
	public void Make_Withdraw(DataStore dataStore)
	{
		((DataStore1)dataStore).Set_Withdraw();
		((DataStore1)dataStore).Compute_Balance_withdraw();
		System.out.println("Account 1:: After Withdraw, Balance is " + ((DataStore1)dataStore).getbalance() );
	}
}