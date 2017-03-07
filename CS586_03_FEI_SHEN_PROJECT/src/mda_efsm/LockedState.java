package mda_efsm;

/***
 * 
 * @author fshen4
 * CLASS : LockedState ( STATE_PATTERN )
 *
 */
public class LockedState implements State
{
	MDAEFSM mdaefsm =null;
    
    public LockedState(MDAEFSM mdaefsm) 
    {
        this.mdaefsm =  mdaefsm;
    }  
    
    public void IncorrectPin(int max)
    {
    }
    
    public void CorrectPinBelowMin()
    {
    }
    
    public void CorrectPinAboveMin()
    {
    }
    
    public void BelowMinBalance()
    {
    }
    
    public void AboveMinBalance()
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

	public void Deposit() {
		// TODO Auto-generated method stub
		
	}

	public void Logout() {
		// TODO Auto-generated method stub
		
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
    	System.out.println("\n MDA_EFSM::LockedState::Unlock function ");
    	mdaefsm.setState(mdaefsm.getS1State());
		
	}

	public void IncorrectUnlock() {
		// TODO Auto-generated method stub
    	System.out.println("\n MDA_EFSM::LockedState::IncorrectLock function ");
    	mdaefsm.output.Incorrect_Unlock_Msg();
		
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

	public void Create() {
		// TODO Auto-generated method stub
		
	}
}
