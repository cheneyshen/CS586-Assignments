package account;
import mda_efsm.MDAEFSM;
import data_store.DataStore;
import data_store.DataStore1;


/*
 * CLASS : Account1 Implementation for collecting parameters
 * from the UI through Driver.java and invoking right event in MDA-EFSM
 */

public class Account1 
{
	
	/* Pointer to MDA-EFSM */
	MDAEFSM mdaefsm = null;
	/* Pointer to DataStore */
	DataStore dataStore = null;	
	
	public Account1(MDAEFSM mdaefsm,DataStore dataStore) 
	{
        this.mdaefsm = mdaefsm;
        this.dataStore = dataStore;
        this.create();
    }

	public void create()
	{
		mdaefsm.create();
    }

    public void open(String p, String y, float a)
    {
    	// store p, y and a in temp data store
    	((DataStore1)dataStore).temp_PIN = p;
    	((DataStore1)dataStore).temp_ID = y;
    	((DataStore1)dataStore).temp_balance = a;
    	mdaefsm.Open();
    }
    
    public void pin( String x )
    {
    	if( x.equals(((DataStore1)dataStore).temp_PIN ) )
    	{
    		if( ((DataStore1)dataStore).temp_balance <= 500 )
    			mdaefsm.CorrectPinBelowMin();
    		else
    			mdaefsm.CorrectPinAboveMin();
    	}
    	else
    	{
    		mdaefsm.IncorrectPin(3);
    	}
    }
    
    public void deposit(float d)
    {
    	((DataStore1)dataStore).temp_deposit = d;
    	mdaefsm.Deposit();
    	
    	if( ((DataStore1)dataStore).temp_balance > 500 )
    	{
    		mdaefsm.AboveMinBalance();
    	}
    	else
    	{
    		mdaefsm.BelowMinBalance();
    	}
    }
    
    public void withdraw(float w)
    {
    	((DataStore1)dataStore).temp_withdraw = w;
    	mdaefsm.Withdraw();
    	
    	if( ((DataStore1)dataStore).balance > 500 )
    	{
    		mdaefsm.AboveMinBalance();
    	}
    	else
    	{
    		mdaefsm.WithdrawBelowMinBalance();
    	}
    }
    
    public void balance()
    {
    	mdaefsm.Balance();
    }
    
    public void login(String y)
    {
    	if (y.equals(((DataStore1)dataStore).temp_ID))
    	{
    		mdaefsm.Login();
    	}
    	else
    	{
    		mdaefsm.IncorrectLogin();
    	}
    }
    
    public void logout()
    {
		mdaefsm.Logout();
    }
    
    public void lock(String x)
    {
    	if( x.equals(((DataStore1)dataStore).temp_PIN ) )
    		mdaefsm.Lock();
    	else
    		mdaefsm.IncorrectLock();
    }
    
    public void unlock(String x)
    {
    	if( x.equals(((DataStore1)dataStore).temp_PIN ) )
    	{
    		mdaefsm.Unlock();
    	
    		if( ((DataStore1)dataStore).balance > 500 )
    		{
    			mdaefsm.AboveMinBalance();
    		}
    		else
    		{
    			mdaefsm.BelowMinBalance();
    		}
    	}
    	else
    		mdaefsm.IncorrectUnlock();
    }

}
