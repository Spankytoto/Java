import java.util.*;

public class Calculator
{
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int first = getInt();
		int second = getInt();
		char action = getOperation();
		int result = calc (first, second, action);
		System.out.print("Result is: " + result);
		}
	//In main class i write basic methods and variables
	

		public static int getInt() {
			System.out.print("Enter the number: ");
			int number;
			if(scn.hasNextInt()) {
				number = scn.nextInt();
			}
			else {
				System.out.print("Error. Please try again");
				scn.next();
				number = getInt();
			}
			return number;
		}
		//That code needs for get numbers from user
		
		
		public static char getOperation() {
			System.out.print("Choose an action: ");
			char action;
				if(scn.hasNext()) {
					action = scn.next().charAt(0);
				}
				else {System.out.print("Error. Please enter correct action");
					scn.next();
					action = getOperation();
				}
				return action;
		}
		//That code intended for get operation from user
		
		
		public static int calc (int first, int second, char action) {
			int result;
			switch (action) {
				case '/':
					result = first / second;
					break;
				case '+':
					result = first + second;
					break;
				case '-':
					result = first - second;
					break;
				case '*':
					result = first * second;
					break;
				default:
					System.out.print("Invalid operation!");
					result = calc(first,second,getOperation());		
			}
			return result;
		}
		//Last method used for complete operation with all variables
		
		
		
		
		
	}


