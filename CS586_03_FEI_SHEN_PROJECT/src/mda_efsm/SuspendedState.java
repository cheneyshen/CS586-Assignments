package mda_efsm;

/***
 * 
 * @author fshen4
 * CLASS : S2State ( STATE_PATTERN )
 *
 */
public class SuspendedState implements State
{
	MDAEFSM mdaefsm =null;
    
    public SuspendedState(MDAEFSM mdaefsm) 
    {
        this.mdaefsm =  mdaefsm;
    }
    
    public void BelowMinBalance()
    {
    }
    
    public void AboveMinBalance()
    {
    }
    
    public void lock()
    {
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

	public void IncorrectPin(int max) {
		// TODO Auto-generated method stub
		
	}

	public void CorrectPinBelowMin() {
		// TODO Auto-generated method stub
		
	}

	public void CorrectPinAboveMin() {
		// TODO Auto-generated method stub
		
	}

	public void Deposit() {
		// TODO Auto-generated method stub
		
	}

	public void Logout() {
		// TODO Auto-generated method stub
		
	}

	public void Balance() {
		// TODO Auto-generated method stub
    	mdaefsm.output.Display_Balance();
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
    	mdaefsm.setState(mdaefsm.getReadyState());
	}

	public void Close() {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	public void Create() {
		// TODO Auto-generated method stub
		
	}
    
}
