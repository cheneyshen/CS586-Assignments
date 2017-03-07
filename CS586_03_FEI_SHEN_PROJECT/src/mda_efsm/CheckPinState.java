package mda_efsm;

/***
 * 
 * @author fshen4
 * CLASS : CheckPinState ( STATE_PATTERN )
 *
 */
public class CheckPinState implements State
{
    MDAEFSM mdaefsm =null;
    
    public CheckPinState(MDAEFSM mdaefsm) 
    {
        this.mdaefsm =  mdaefsm;
    }  

    
    public void IncorrectPin(int max)
    {
    	if( mdaefsm.attempts < max )
    	{
    		mdaefsm.attempts++;
    		mdaefsm.output.Incorrect_Pin_Msg();
    	}
    	else if( mdaefsm.attempts >= max )
    	{
    		mdaefsm.output.Incorrect_Pin_Msg();
    		mdaefsm.output.Too_Many_Attempts_Msg();
    		mdaefsm.setState(mdaefsm.getIdleState());
    	}
    }
    
    public void CorrectPinBelowMin()
    {
    	mdaefsm.output.Display_Menu();
    	mdaefsm.setState(mdaefsm.getOverdrawnState());
    }
    
    public void CorrectPinAboveMin()
    {
    	mdaefsm.output.Display_Menu();
    	mdaefsm.setState(mdaefsm.getReadyState());
    }

	public void Open() {
		// TODO Auto-generated method stub
		
	}

	public void Login() {
		// TODO Auto-generated method stub
		
	}

	public void IncorrectLogin() {
		// TODO Auto-generated method stub
		
	}

	public void Deposit() {
		// TODO Auto-generated method stub
		
	}

	public void Logout() {
		// TODO Auto-generated method stub
    	mdaefsm.setState(mdaefsm.getIdleState());
	}

	public void Balance() {
		// TODO Auto-generated method stub
		
	}

	public void Withdraw() {
		// TODO Auto-generated method stub
		
	}

	public void WithdrawBelowMinBalance() {
		// TODO Auto-generated method stub
		
	}

	public void NoFunds() {
		// TODO Auto-generated method stub
		
	}

	public void Lock() {
		// TODO Auto-generated method stub
		
	}

	public void IncorrectLock() {
		// TODO Auto-generated method stub
		
	}

	public void Unlock() {
		// TODO Auto-generated method stub
		
	}

	public void IncorrectUnlock() {
		// TODO Auto-generated method stub
		
	}

	public void Suspend() {
		// TODO Auto-generated method stub
		
	}

	public void Activate() {
		// TODO Auto-generated method stub
		
	}

	public void Close() {
		// TODO Auto-generated method stub
		
	}


	public void BelowMinBalance() {
		// TODO Auto-generated method stub
		
	}


	public void AboveMinBalance() {
		// TODO Auto-generated method stub
		
	}


	public void Create() {
		// TODO Auto-generated method stub
		
	}
}
