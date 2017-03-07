package data_store;

/* 
 * CONCRETE CLASS : DataStore -1
 */
public class DataStore1 extends DataStore 
{
	
	/* Temporary Storage variables */
	public String temp_PIN;
	public String temp_ID;
	public float temp_balance;
	public float temp_deposit;
	public float temp_withdraw;
	
	
	/* Permanent Storage Variables ******/
	public String PIN;  // PIN String p
	public String ID;  // ID String y
	public float balance;     // a is the Balance
	public float deposit;   // Deposit variable
	public float withdraw;   // Withdraw variable
	
	public float getbalance()
	{
		return this.balance;
	}
	
	public String getPIN()
	{
		return this.PIN;
	}
	
	public String getID()
	{
		return this.ID;
	}
	
	public float setbalance()
	{
		return this.balance = this.temp_balance;
	}
	
	public String setPIN()
	{
		return this.PIN = this.temp_PIN;
	}
	public String setID()
	{
		return this.ID = this.temp_ID;
	}
	
	public float setPenalty()
	{
		this.balance = this.balance - 20;
		this.temp_balance = balance;
		return this.balance;
	}
	
	public void Compute_Balance_deposit()
	{
		this.balance = this.balance + this.deposit;
		this.temp_balance = this.balance;
	}
	public void Compute_Balance_withdraw()
	{
		this.balance = this.balance - this.withdraw;
		this.temp_balance = this.balance;
	}
	
	public void Set_Deposit()
	{
		this.deposit = this.temp_deposit;
	}
	
	public void Set_Withdraw()
	{
	    this.withdraw = this.temp_withdraw;
	}
	public float Get_Deposit()
	{
		return this.deposit;
	}
	
	public float Get_Withdraw()
	{
		return this.withdraw;
	}
}