package account;

import mda_efsm.MDAEFSM;
import data_store.DataStore;
import data_store.DataStore2;

/*
 * CLASS : Account2 Implementation for collecting parameters
 * from the UI through Driver.java and invoking right event in MDA-EFSm
 */

public class Account2 
{
	
	/* Pointer to MDA-EFSM */
	MDAEFSM mdaefsm = null;
	/* Pointer to DataStore */
	DataStore dataStore = null;	
	
	public Account2(MDAEFSM mdaefsm,DataStore dataStore) 
	{
        this.mdaefsm = mdaefsm;
        this.dataStore = dataStore;
        this.create();
    }

	public void create()
	{
		mdaefsm.create();
    }
    public void OPEN(int p, int y, int a)
    {
    	((DataStore2)dataStore).temp_PIN = p;
    	((DataStore2)dataStore).temp_ID = y;
    	((DataStore2)dataStore).temp_balance = a;
    	mdaefsm.Open();
    }
    
    public void PIN(int x)
    {
    	if( x == ((DataStore2)dataStore).temp_PIN )
    	{
			mdaefsm.CorrectPinAboveMin();
    	}
    	else
    	{
    		mdaefsm.IncorrectPin(2);
    	}
    }
    
    public void DEPOSIT(int d)
    {
    	((DataStore2)dataStore).temp_deposit = d;
    	mdaefsm.Deposit();
    }
    
    public void WITHDRAW(int w)
    {
    	((DataStore2)dataStore).temp_withdraw = w;

    	if(((DataStore2)dataStore).balance > 0)
    	{
    		mdaefsm.Withdraw();
    		mdaefsm.AboveMinBalance();
    	}
    	else
    		mdaefsm.NoFunds();
    }
    
    public void BALANCE()
    {
    	mdaefsm.Balance();
    }
    
    public void LOGIN(int y)
    {
    	if (y == ((DataStore2)dataStore).ID)
    	{
    		mdaefsm.Login();
    	}
    	else
    		mdaefsm.IncorrectLogin();
    }
    
    public void LOGOUT()
    {
    	mdaefsm.Logout();
    }
    
    public void suspend()
    {
    	mdaefsm.Suspend();
    }
    
    public void activate()
    {
    	mdaefsm.Activate();
    }
    
    public void close()
    {
    	mdaefsm.Close();
    }
}