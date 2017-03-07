package abstract_factory;
import data_store.DataStore;
import data_store.DataStore2;
import strategy.*;


/***
 * 
 * @author fshen4
 * For Account 2
 *
 */

public class ConcreteFactory2 implements AbstractFactory
{

	DataStore dataStore = new DataStore2();
	Store_Pin store_pin  = new Store_Pin_A2();
	Store_ID store_id = new Store_ID_A2();
	Store_Balance store_bal = new Store_Balance_A2();
	Incorrect_ID_Msg incorrect_id = new Incorrect_ID_Msg_A2();
	Incorrect_Pin_Msg incorrect_pin = new Incorrect_Pin_Msg_A2();
	Too_Many_Attempts_Msg too_many_attempts_msg = new Too_Many_Attempts_Msg_A2();
	Display_Menu disp_menu = new Display_Menu_A2();
	Make_Deposit make_deposit = new Make_Deposit_A2();
	Display_Balance disp_bal = new Display_Balance_A2();
	Prompt_For_PIN prompt_pin = new Prompt_For_PIN_A2();
	Make_Withdraw make_withdraw = new Make_Withdraw_A2();
	Penalty penalty = new Penalty_A2();
	Incorrect_Lock_Msg incorrect_lock = new Incorrect_Lock_Msg_A2();
	Incorrect_Unlock_Msg incorrect_unlock = new Incorrect_Unlock_Msg_A2();
	No_Funds_Msg no_funds = new No_Funds_Msg_A2();
	
	public void ConcreteFactory()
	{
		
	}
	public DataStore CreateDataStore()
	{
		return(this.dataStore);
	}
	public DataStore GetDataStore()
	{
		return this.dataStore;
	}
	public Incorrect_Pin_Msg CreateIncorrect_Pin_Msg()
	{
		return this.incorrect_pin;
	}
	public Too_Many_Attempts_Msg CreateToo_Many_Attempts_Msg()
	{
		return this.too_many_attempts_msg;
	}
	public Display_Menu CreateDisplay_Menu()
	{
		return this.disp_menu;
	}
	public Store_Pin CreateStore_Pin()
	{
		return this.store_pin;
	}
	public Store_Balance CreateStore_Balance()
	{
		return this.store_bal;
	}
	public Prompt_For_PIN CreatePrompt_For_PIN()
	{
		return this.prompt_pin;
	}
	public Display_Balance CreateDisplay_Balance()
	{
		return this.disp_bal;
	}
	public Make_Deposit CreateMake_Deposit()
	{
		return this.make_deposit;
	}
	public Make_Withdraw CreateMake_Withdraw()
	{
		return this.make_withdraw;
	}
	public Penalty CreatePenalty()
	{
		return this.penalty;
	}
	public Store_ID CreateStore_ID() {
		return this.store_id;
	}
	public Incorrect_ID_Msg CreateIncorrect_ID_Msg() {
		return this.incorrect_id;
	}
	public Incorrect_Lock_Msg CreateIncorrect_Lock_Msg() {
		return this.incorrect_lock;
	}
	public Incorrect_Unlock_Msg CreateIncorrect_Unlock_Msg() {
		return this.incorrect_unlock;
	}
	public No_Funds_Msg CreateNo_Funds_Msg() {
		return this.no_funds;
	}
}
