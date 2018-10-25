import java.util.Scanner;

public class StringManipulation 
{

	public static void main(String[] args) 
	{
		Scanner manip = new Scanner(System.in);
		System.out.print("Please enter a string:  ");
		String str = manip.nextLine();
		int strLength = str.length();
		char firstChar = str.charAt(0);
		char finalchar = str.charAt(strLength - 1);
		System.out.print("First letter:  " + firstChar + "\nLast letter:  " + finalchar);
	}

}
