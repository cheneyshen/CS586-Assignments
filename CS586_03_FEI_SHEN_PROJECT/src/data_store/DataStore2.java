package data_store;

/* 
 * CONCRETE CLASS : DataStore -2
 */
public class DataStore2 extends DataStore {

	/* Temporary Storage variables */
	public int temp_PIN;
	public int temp_ID;
	public int temp_balance;
	public int temp_deposit;
	public int temp_withdraw;
	
	
	/* Permanent Storage Variables ******/
	public int PIN;  // PIN String p
	public int ID;  // ID String y
	public int balance;     // a is the Balance
	public int deposit;   // Deposit variable
	public int withdraw;   // Withdraw variable
	
	public int getbalance()
	{
		return balance;
	}
	
	public int getPIN()
	{
		return PIN;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public int setbalance()
	{
		return this.balance = this.temp_balance;
	}
	
	public int setPIN()
	{
		return this.PIN = this.temp_PIN;
	}
	
	public int setID()
	{
		return this.ID = this.temp_ID;
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