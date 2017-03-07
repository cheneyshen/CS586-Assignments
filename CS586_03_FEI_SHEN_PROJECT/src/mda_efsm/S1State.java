package mda_efsm;

/***
 * 
 * @author fshen4
 * CLASS : S1State ( STATE_PATTERN )
 *
 */
public class S1State implements State
{
	MDAEFSM mdaefsm =null;
    
    public S1State(MDAEFSM mdaefsm) 
    {
        this.mdaefsm =  mdaefsm;
    }
    
    public void BelowMinBalance()
    {
    	mdaefsm.setState(mdaefsm.getOverdrawnState());
    }
    
    public void AboveMinBalance()
    {
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
		
	}

	public void Withdraw() {
		// TODO Auto-generated method stub
		
	}

	public void WithdrawBelowMinBalance() {
		// TODO Auto-generated method stub
    	mdaefsm.output.Penalty();
    	mdaefsm.setState(mdaefsm.getOverdrawnState());
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

	public void Create() {
		// TODO Auto-generated method stub
		
	}
}
