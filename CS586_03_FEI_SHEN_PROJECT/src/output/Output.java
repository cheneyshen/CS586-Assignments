package output;
import data_store.DataStore;
import abstract_factory.*;
import strategy.Display_Balance;
import strategy.Display_Menu;
import strategy.Incorrect_Pin_Msg;
import strategy.Incorrect_ID_Msg;
import strategy.Incorrect_Lock_Msg;
import strategy.Incorrect_Unlock_Msg;
import strategy.No_Funds_Msg;
import strategy.Make_Deposit;
import strategy.Make_Withdraw;
import strategy.Penalty;
import strategy.Prompt_For_PIN;
import strategy.Store_Balance;
import strategy.Store_Pin;
import strategy.Store_ID;
import strategy.Too_Many_Attempts_Msg;



/* 
 *  CLASS : Output
 */
public class Output 
{
	AbstractFactory factory =null;
	DataStore dataStore = null;
	
	public Output(AbstractFactory factory,DataStore dataStore) 
	{
        this.factory = factory;
        this.dataStore = dataStore;
    }
	
	public void Incorrect_ID_Msg()
	{
		System.out.println("\n OUTPUT:: Action Incorrect_ID_Msg");
		Incorrect_ID_Msg incorrect_id = factory.CreateIncorrect_ID_Msg();
		incorrect_id.Incorrect_ID_Msg();
	}
	
	public void Incorrect_Pin_Msg()
	{
		System.out.println("\n OUTPUT:: Action Incorrect_Pin_Msg");
		Incorrect_Pin_Msg incorrect_pin = factory.CreateIncorrect_Pin_Msg();
		incorrect_pin.Incorrect_Pin_Msg();
	}
	
	public void Too_Many_Attempts_Msg()
	{
		System.out.println("\n OUTPUT:: Action Too_Many_Attempts_Msg");
		Too_Many_Attempts_Msg too_many_attempts = factory.CreateToo_Many_Attempts_Msg();
		too_many_attempts.Too_Many_Attempts_Msg();
	}
	
	public void Display_Menu()
	{
		System.out.println("\n OUTPUT:: Action Display_Menu");
		Display_Menu disp_menu = factory.CreateDisplay_Menu();
		disp_menu.Display_Menu();
	}
	
	public void Make_Deposit()
	{
		System.out.println("\n OUTPUT:: Action Make_Deposit ");
		Make_Deposit make_deposit = factory.CreateMake_Deposit();
		make_deposit.Make_Deposit(dataStore);
	}
	
	public void Display_Balance()
	{
		System.out.println("\n OUTPUT:: Action Display_Balance ");
		Display_Balance disp_bal = factory.CreateDisplay_Balance();
		disp_bal.Display_Balance(dataStore);
	}
	
	public void Prompt_For_Pin()
	{
		System.out.println("\n OUTPUT:: Action Prompt_For_Pin ");
		Prompt_For_PIN prompt_pin = factory.CreatePrompt_For_PIN();
		prompt_pin.Prompt_For_PIN();
	}
	
	public void Make_Withdraw()
	{
		System.out.println("\n OUTPUT:: Action Make_Withdraw ");
		Make_Withdraw make_withdraw = factory.CreateMake_Withdraw();
		make_withdraw.Make_Withdraw(dataStore);
	}
	
	public void Penalty()
	{
		System.out.println("\n OUTPUT:: Action Penalty  ");
		Penalty penalty = factory.CreatePenalty();
		penalty.Penalty(dataStore);
	}

	public void Incorrect_Lock_Msg()
	{
		System.out.println("\n OUTPUT:: Action Incorrect_Lock_Msg");
		Incorrect_Lock_Msg incorrect_lock = factory.CreateIncorrect_Lock_Msg();
		incorrect_lock.Incorrect_Lock_Msg();
	}

	public void Incorrect_Unlock_Msg()
	{
		System.out.println("\n OUTPUT:: Action Incorrect_Unlock_Msg");
		Incorrect_Unlock_Msg incorrect_unlock = factory.CreateIncorrect_Unlock_Msg();
		incorrect_unlock.Incorrect_Unlock_Msg();
	}
	
	public void No_Funds_Msg()
	{
		System.out.println("\n OUTPUT:: Action No_Funds_Msg");
		No_Funds_Msg no_funds_msg = factory.CreateNo_Funds_Msg();
		no_funds_msg.No_Funds_Msg();
	}
	
	public void Store_Pin()
	{
		System.out.println("\n OUTPUT:: Action Store_Pin");
		Store_Pin store_pin = factory.CreateStore_Pin();
		store_pin.Store_Pin(dataStore);
	}
	
	public void Store_ID()
	{
		System.out.println("\n OUTPUT:: Action Store_ID");
		Store_ID store_id = factory.CreateStore_ID();
		store_id.Store_ID(dataStore);
	}
	
	public void Store_Balance()
	{
		System.out.println("\n OUTPUT:: Action Store_Balance");
		Store_Balance store_bal = factory.CreateStore_Balance();
		store_bal.Store_Balance(dataStore);
	}
	

}
