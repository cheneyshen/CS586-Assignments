package mda_efsm;

/***
 * 
 * @author fshen4
 * CLASS : StartState ( STATE_PATTERN )
 *
 */
public class StartState implements State
{
	MDAEFSM mdaefsm =null;
    
    public StartState(MDAEFSM mdaefsm) 
    {
        this.mdaefsm =  mdaefsm;
    }

	public void Open() {
		// TODO Auto-generated method stub
    	mdaefsm.output.Store_Pin();
    	mdaefsm.output.Store_ID();
    	mdaefsm.output.Store_Balance();
    	mdaefsm.setState(mdaefsm.getIdleState());
		
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

	public void BelowMinBalance() {
		// TODO Auto-generated method stub
		
	}

	public void AboveMinBalance() {
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

