import java.util.Scanner;
class atmOperation 
{
	public static void main(String[] args) 
	{
		int original_pin = 1711;
		double balance = 5679.92;

		Scanner user_entry = new Scanner(System.in);

		System.out.println("Enter 1 for forgot password ");
		System.out.println("Enter 2 for using ATM ");
		System.out.print("Enter a number : ");
		int selection_number = user_entry.nextInt();

		if(selection_number == 1){
			System.out.print("Enter new password: ");
			int new_password = user_entry.nextInt();
			System.out.print("Confirm password : ");
			int confirm_password = user_entry.nextInt();
			
			   if(new_password == confirm_password){
				  
				  System.out.println("Password changed SUCCESSFULLY !");
			   }
				else{
					System.out.println("new password and confirm password should be same ");
				}

		}

		else if(selection_number == 2){
		System.out.println("Your available amount is : "+balance);
		System.out.print("Enter your password : ");
		int password = user_entry.nextInt();
		

		if(password == original_pin){
			System.out.print("Enter the amount you want to withdraw : ");
			int amount = user_entry.nextInt();
			if(amount <= balance)
			{
				if (amount%500==0)
				{
					System.out.println("Withdrawal Succesfull !");
				    System.out.println("Thank you visit again !");
					double remaining_balance = balance-amount;
					System.out.println("Remaining balance :"+remaining_balance);
				}
				else
				{
					System.out.println("Amount should be multiple of 500 only");
				}
			}
			else{
				System.out.println("Insufficient funds...");
			}
		}
		else{
			System.out.println("You have entered wrong pin ");
			System.out.print("Re-enter your password : ");
			int password2 = user_entry.nextInt();
			if(password2 == original_pin)
			{
			   System.out.print("Enter the amount you want to withdraw : ");
			   int amount = user_entry.nextInt();
			    if(amount <= balance)
				{
				    if (amount%500==0)
				{
					System.out.println("Withdrawal Succesfull !");
				    System.out.println("Thank you visit again !");
					double remaining_balance = balance-amount;
					System.out.println("Remaining balance :"+remaining_balance);
				}
				else
				{
					System.out.println("Amount should be multiple of 500 only");
				}
			    }
			    else
				{
				    System.out.println("Insufficient funds...");
			    }
		   }
		   else
		   {
			   System.out.println("Your card is blocked !");
		   }
		}
		}
		else{
			System.out.println("Enter only 1 or 2");
		}
	}
}
