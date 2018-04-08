//NEW IMPORT
import javax.swing.*; //Personally I like JOptionPane because its better than the Scanner

public class Login
{
	public static void main(String[] args)
	{
		System.out.println("Hello! Welcome to Anonyserver!\nPlease register now.");
		String user = JOptionPane.showInputDialog("What will be your username?");
		String pass = JOptionPane.showInputDialog("What will be your password?\nWARNING (NOT ENCRYPTED)!");
		System.out.println("So your username is: " + user + "\nAnd your password is: " + pass);
		String correct = JOptionPane.showInputDialog("Is this correct?\n[y/n]");
		if (correct.equals("y") || correct.equals("Y"))
		{
			System.out.println("Great! Thanks for registering!");
		}
		else if (correct.equals("n") || correct.equals("N"))
		{
			System.out.println("Thanks then. Come back later!");
		}
		else //So that people cant put anything other than y or n to get an acceptance
		{
			System.exit(0);
		}
		System.exit(0);
	}
}
