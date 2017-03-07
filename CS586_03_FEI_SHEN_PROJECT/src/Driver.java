
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import mda_efsm.MDAEFSM;
import output.Output;
import abstract_factory.ConcreteFactory1;
import abstract_factory.ConcreteFactory2;
import account.Account1;
import account.Account2;


/*
 * CLASS : Driver ( Main function Program)
 */
public class Driver
{
    public static void main( String[] args) throws IOException
    {
    	
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	String input = null;
    	
		System.out.println(" ******** Select Account *******" );
		System.out.println("          1. Account - 1" );
		System.out.println("          2. Account - 2" );
		 
		input = bufferedReader.readLine();
		if(input.equalsIgnoreCase("1"))
		{
	    	ConcreteFactory1 factory = new ConcreteFactory1();
	    	Output output = new Output(factory,factory.GetDataStore());
	    	MDAEFSM mdaefsm = new MDAEFSM(factory,output);
	    	Account1 a1 = new Account1(mdaefsm,factory.GetDataStore());
	    	
	    	float balance,deposit,withdraw;
	    	String PIN, ID;
	    	
	    	System.out.println("*************************************");
	        System.out.println("          Account-1" );	
	        System.out.println("          MENU of Operations" );
	        System.out.println("          0. open(string,string,float)" );
	        System.out.println("          1. pin(string)" );
	        System.out.println("          2. deposit(float)" );
	        System.out.println("          3. withdraw(float)" );
	        System.out.println("          4. balance()" );
	        System.out.println("          5. login(string)" );
	        System.out.println("          6. logout()" );
	        System.out.println("          7. lock(string)" );
	        System.out.println("          8. unlock(string)" );	
	        System.out.println("          q. Quit the demo program" );	
	        System.out.println("  Please make a note of these operations" );	  	    	
	        System.out.println("           Account-1 Execution" );
	          
	        while (true) {
	        	
	        	System.out.println("  Select Operation: ");
	        	System.out.println("0-open,1-pin,2-deposit,3-withdraw,4-balance,5-login,6-logout,7-lock,8-unlock,q-Quit");
	             
				input = bufferedReader.readLine();
	
	            if(input.isEmpty()) continue;
	            if(input.charAt(0) == 'q')
	            	break;
	            
	            switch(input.charAt(0))
	            {
		      	    case '0':   //open
		      			System.out.println("\n  Operation:  open (string p, string y, float a)");
		      			System.out.println("   Enter value of the parameter PIN:");
		      			input = bufferedReader.readLine();
		      			PIN = input;
		      			System.out.println("   Enter value of the parameter ID:");
		      			input = bufferedReader.readLine();
		      			ID = input;
		      			System.out.println("   Enter value of the parameter balance:");
		      			input = bufferedReader.readLine();
		      			balance = Float.parseFloat(input);
		      			a1.open(PIN, ID, balance);
		      			break;
		      	   case '1':  //pin
		      			System.out.println("  Operation:  pin(string x)");
		      			System.out.println("  Enter value of the parameter PIN:");
		      			input = bufferedReader.readLine();
		      			PIN = input;
		      			a1.pin(PIN);
		      			break;
		      	    case '2':  //deposit
		      			System.out.println("  Operation:  deposit(float d)");
		      			System.out.println("  Enter value of the parameter Deposit:");
		      			input = bufferedReader.readLine();
		      			deposit = Float.parseFloat(input);
		      			a1.deposit(deposit);
		      			break;
		      	    case '3':  // withdraw
		      			System.out.println("  Operation:  withdraw(Float w)");
		      			System.out.println("  Enter value of the parameter Withdraw:");
		      			input = bufferedReader.readLine();
		      			withdraw = Float.parseFloat(input);
		      			a1.withdraw(withdraw);
		      			break;
		      	    case '4':  // balance
		      			System.out.println("  Operation:  balance()");
		      			a1.balance();
		      			break;
		      	    case '5':  // login
		      			System.out.println("  Operation:  login(string x)");
		      			System.out.println("  Enter value of the parameter ID:");
		      			input = bufferedReader.readLine();
		      			ID = input;
		      			a1.login(ID);
		      			break;
		      	    case '6':  // logout
		      			System.out.println("  Operation:  logout");
		      			a1.logout();
		      			break;
		      	    case '7':  // lock(string x)
		      			System.out.println("  Operation:  lock");
		      			System.out.println("  Enter value of the parameter PIN:");
		      			input = bufferedReader.readLine();
		      			PIN = input;
		      			a1.lock(PIN);
		      			break;
		      	    case '8':  // unlock(string x)
		      			System.out.println("  Operation:  unlock");
		      			System.out.println("  Enter value of the parameter PIN:");
		      			input = bufferedReader.readLine();
		      			PIN = input;
		      			a1.unlock(PIN);
		      			break;
		      	  default:
		      			System.out.println("Invalid Choice");
		      			break;
	            }
	        }
	        System.out.println("Thanks for using Account - 1" );
		}
		else if(input.equalsIgnoreCase("2"))
		{
	    	ConcreteFactory2 factory = new ConcreteFactory2();
	    	Output output = new Output(factory,factory.GetDataStore());
	    	MDAEFSM mdaefsm = new MDAEFSM(factory,output);
	    	Account2 atm = new Account2(mdaefsm,factory.GetDataStore());

	    	int balance,deposit,withdraw;
	    	int PIN, ID;
	    	
	    	System.out.println("*************************************");
	        System.out.println("          Account-2" );	
	        System.out.println("          MENU of Operations" );
	        System.out.println("          0. OPEN(int,int,int)" );
	        System.out.println("          1. PIN(string)" );
	        System.out.println("          2. DEPOSIT(float)" );
	        System.out.println("          3. WITHDRAW(float)" );
	        System.out.println("          4. BALANCE()" );
	        System.out.println("          5. LOGIN(string)" );
	        System.out.println("          6. LOGOUT()" );
	        System.out.println("          7. suspend()" );
	        System.out.println("          8. activate()" );	
	        System.out.println("          9. close()" );	
	        System.out.println("          q. Quit the demo program" );	
	        System.out.println("  Please make a note of these operations" );	  	    	
	        System.out.println("           Account-2 Execution" );
	        while (true)
	        {

	        	System.out.println("  Select Operation: ");
	        	System.out.println("0-OPEN,1-LOGIN,2-PIN,3-DEPOSIT,4-WITHDRAW,5-BALANCE,6-LOGOUT,7-suspend,8-activate,9-close,q-Quit");
	             
				input = bufferedReader.readLine();
	
	            if(input.isEmpty()) continue;
	            if(input.charAt(0) == 'q')
	            	break;
	            
	            switch(input.charAt(0))
	            {
	      			
		      	    case '0':   //OPEN
		      			System.out.println("\n  Operation:  OPEN(int p, int y, int a)");
		      			System.out.println("   Enter value of the parameter p:");
		      			input = bufferedReader.readLine();
		      			PIN = Integer.parseInt(input);
		      			System.out.println("   Enter value of the parameter y:");
		      			input = bufferedReader.readLine();
		      			ID = Integer.parseInt(input);
		      			System.out.println("   Enter value of the parameter a:");
		      			input = bufferedReader.readLine();
		      			balance = Integer.parseInt(input);
		      			atm.OPEN(PIN, ID, balance);
		      			break;
	      	    	case '1':	//LOGIN
						System.out.println("  Operation:  LOGIN(int y)");
						System.out.println("  Enter value of the parameter y:");
						input = bufferedReader.readLine();
						ID = Integer.parseInt(input);
						atm.LOGIN(ID);
						break;
	      	    	case '2':	//PIN
						System.out.println("  Operation:  PIN(String x)");
						System.out.println("  Enter value of the parameter x:");
						input = bufferedReader.readLine();
		      			PIN = Integer.parseInt(input);
						atm.PIN(PIN);
						break;
					case '3':  // DEPOSIT
						System.out.println("  Operation:  DEPOSIT(int d)");
						System.out.println("  Enter value of the parameter d:");
						input = bufferedReader.readLine();
						deposit = Integer.parseInt(input);
						atm.DEPOSIT(deposit);
						break;
		      	    case '4':  // WITHDRAW
		      			System.out.println("  Operation:  WITHDRAW(int w)");
		      			System.out.println("  Enter value of the parameter w:");
		      			input = bufferedReader.readLine();
		      			withdraw = Integer.parseInt(input);
		      			atm.WITHDRAW(withdraw);
		      			break;
		      	    case '5':  // BALANCE
		      			System.out.println("  Operation:  BALANCE()");
		      			atm.BALANCE();
		      			break;
		      	    case '6':  // LOGOUT
		      			System.out.println("  Operation:  LOGOUT()");
		      			atm.LOGOUT();
		      			break;
		      	    case '7':  // suspend
		      			System.out.println("  Operation:  suspend()");
		      			atm.suspend();
		      			break;
		      	    case '8':  // activate
		      			System.out.println("  Operation:  activate()");
		      			atm.activate();
		      			break;
		      	    case '9':  // close
		      			System.out.println("  Operation:  close()");
		      			atm.close();
		      			break;
		      		default:
		      			System.out.println("Invalid Choice");
		      			break;
	            }
	        }
		}
    }
}
	       
