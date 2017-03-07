package strategy;
import data_store.*;

/* 
 *  CLASS : Make_Withdraw_A2 (STRATEGY PATTERN)
 */
public class Make_Withdraw_A2 extends Make_Withdraw
{
	public void Make_Withdraw(DataStore dataStore)
	{
		((DataStore2)dataStore).Set_Withdraw();
		((DataStore2)dataStore).Compute_Balance_withdraw();
		System.out.println("Account 2:: After Withdraw, Balance is " + ((DataStore2)dataStore).getbalance() );
	}
}