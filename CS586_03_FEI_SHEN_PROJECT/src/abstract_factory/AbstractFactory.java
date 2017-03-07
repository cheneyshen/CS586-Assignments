package abstract_factory;
import data_store.*;
import strategy.*;

/*
 * INTERFACE:: Abstract Factory PATTERN starts here
 */
public interface AbstractFactory 
{
	public DataStore CreateDataStore();
	public Store_Pin CreateStore_Pin();
	public Store_ID CreateStore_ID();
	public Store_Balance CreateStore_Balance();
	public Incorrect_ID_Msg CreateIncorrect_ID_Msg();
	public Incorrect_Pin_Msg CreateIncorrect_Pin_Msg();
	public Too_Many_Attempts_Msg CreateToo_Many_Attempts_Msg();
	public Display_Menu CreateDisplay_Menu();
	public Make_Deposit CreateMake_Deposit();
	public Display_Balance CreateDisplay_Balance();
	public Prompt_For_PIN CreatePrompt_For_PIN();
	public Make_Withdraw CreateMake_Withdraw();
	public Penalty CreatePenalty();
	public Incorrect_Lock_Msg CreateIncorrect_Lock_Msg();
	public Incorrect_Unlock_Msg CreateIncorrect_Unlock_Msg();
	public No_Funds_Msg CreateNo_Funds_Msg();
}
