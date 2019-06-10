/*
 * Write a program to check  the  PAN card no is valid or not. 
 * Generally a PAN no is a mix of both numbers and alphabets. 
 * It should have exactly 10 characters, in which, the first 5 
 * characters should be upper case, the next 4 should be numbers, 
 * and last one should be an upper case character. 
 * If the PAN no doesn't match the pattern print "Invalid PAN no".
 */
import java.util.*;
public class PanCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PAN no:");
			String str = sc.next();
		getValues(str);
	}
	public static void getValues(String str) {
		if(str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Valid PAN no");
		}
		else 
			System.out.println("Invalid PAN no");
	}
}
