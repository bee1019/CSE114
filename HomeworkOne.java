//
// Fall 2017, Stony Brook University
//
// Name: Bansri Shah
// SBU ID #: 110335850
import java.util.*; // needed for the Scanner class
public class HomeworkOne
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        // Test the getFees() method
        System.out.print("Enter the starting account balance: ");
        double bal = sc.nextDouble();
        sc.nextLine(); // consume the extra newline character
        System.out.print("Enter the number of checks that were written: ");
        int checks = sc.nextInt();
        sc.nextLine(); // consume extra newline
        double fee = getFees(bal, checks);
        System.out.println("You paid $" + fee + " in fees.\n");
        // Test the addDivisors() method
        System.out.print("Enter an integer to process: ");
        int val = sc.nextInt();
        sc.nextLine(); // consume any leftover newline characters
        int sum = addDivisors(val);
        System.out.println("Sum of proper divisors: " + sum + "\n");
        // Test the getGender() method
        System.out.print("Please enter the name of the Bynar you are speaking to: ");
        String bName = sc.nextLine();
        String gender = getGender(bName);
        System.out.println("This Bynar is " + gender + "\n");
        // Test the "index of coincidence" method
        System.out.print("Enter a string to examine: ");
        String s1 = sc.nextLine();
        System.out.print("Enter another string to examine: ");
        String s2 = sc.nextLine();
        double index = coincidence(s1, s2);
        System.out.println("These strings have an index of coincidence of " + index + "\n");
}
    // COMPLETE THE METHODS BELOW FOR HOMEWORK 1
    public static double getFees (double balance, int checks)
    {
        // Fill in this method for the homework
    	double fees = 0, checkBalance;
    	
    	if (balance < 400) {
    		balance -= 25;
    		fees += 25;
    	}
    	
    	else if (balance > 400) {
    		balance -=10;
    		fees += 10;
    	}
    	
    	if (checks >= 1 && checks <= 19) {
    		checkBalance = checks * 0.10;
    		fees += checkBalance;
    	}
    	
    	else if (checks >= 20 && checks <= 39) {
    		checkBalance = checks * 0.08;
    		fees += checkBalance;
    	}
    	
    	else if (checks >= 40 && checks <= 59) {
    		checkBalance = checks * 0.06;
    		fees += checkBalance;
    	}
    	
    	else if (checks >= 60) {
    		checkBalance = checks * 0.04;
    		fees += checkBalance;
    	}
    	
        return fees; // CHANGE THIS LINE
    }
    public static int addDivisors (int input)
    {
        // Fill in this method for the homework
    	int sum = 0;
    	
    	for (int i = 1; i < input; i++) {
    		if (input % i == 0) {
    			sum += i;
    		}
    		
    		else {sum = sum;}
    	}
        return sum; // CHANGE THIS LINE
    }
public static String getGender (String name)
    {
        // Fill in this method for the homework
	int divided;
	String gender = " ";
	
	Integer codeName = Integer.parseInt(name);
	divided = codeName / 2;
	
	if (divided % 2 == 0) {
		gender = "male";
	}
	
	else if (divided % 2 != 0) {
		gender = "female";
	}
        return gender; // CHANGE THIS LINE
    }
    public static double coincidence (String first, String second)
    {
        // Fill in this method for the homework
    	int count = 0;
    	double coinIndex;
    	
    	for (int i = 0; i < first.length(); i++) {
    		if (first.charAt(i) == second.charAt(i)) {
    			count++;
    		}
    		
    		else {count  = count;}
    	}
    	
    	coinIndex = (double) count / (double) first.length();
    	
        return (coinIndex * 100); // CHANGE THIS LINE
    }
}