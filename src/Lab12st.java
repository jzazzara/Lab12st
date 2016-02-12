// Lab12st.java
// The "Palindrome" Program
// This is the student, starting version of Lab 12.


public class Lab12st
{
	public static void main (String args[])
	{
		System.out.println("\nLab12\n");
		boolean finished = false;
		do
		{
			System.out.print("Enter a string  ===>>  ");
			String str = Expo.enterString();
			System.out.println();
			System.out.println("Entered String:     " + str);
			System.out.println("Palindrome:         " + Palindrome.isPal(str));
			System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));	  // used only for the 100 and 110 point versions
			System.out.println("Least Palindrome:   " + Palindrome.leastPal(str));	  // used only for the 110 point versions
			System.out.println();
			System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
			char repeat = Expo.enterChar();
			finished = (repeat != 'Y' && repeat != 'y');
			System.out.println();
		}
		while (!finished);
	}
}


class Palindrome
{
	public static boolean isPal(String s)
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
	 */
	{
		String s1 = "";
		int n = s.length() - 1;
		
		for (int k = n; k >= 0; k--)
			s1 += s.charAt(k);
				
		if(s.equalsIgnoreCase(s1))
				return true;
		
		else
			return false;
	}

	public static String purge(String s)
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: All non-letter characters are removed from s, and this new "purged" String is returned.
	 */
	{

		return s;
	}

	public static boolean almostPal(String s)
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: After purging all non-letter characters from s,
	 *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
	 */
	{
		return isPal(purge(s));   // Do not alter this method!
	}

	public static String leastPal(String s)
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: A new String is returned which is created by adding the minimum number of characters
	 *                necessary to S to make it a Palindrome.
	 */
	{


		return "";
	}
}

