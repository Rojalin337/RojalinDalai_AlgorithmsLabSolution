package balancingbracket;
import java.util.*;
public class BalancedBracket 
{
	

		static boolean balancingBracket(String expr)
		{
			// Using ArrayDeque is faster than using Stack class
			Deque<Character> stack= new ArrayDeque<Character>();

			// Traversing the Expression
			for (int i = 0; i < expr.length(); i++)
			{
				char x = expr.charAt(i);

				if (x == '(' || x == '[' || x == '{')
				{
					// Push the element in the stack
					stack.push(x);
					continue;
				}

				// If current character is not opening
				// bracket, then it must be closing. So stack
				// cannot be empty at this point.
				if (stack.isEmpty())
					return false;
				char check;
				switch (x) {
				case ')':
					check = stack.pop();
					if (check == '{' || check == '[')
						return false;
					break;

				case '}':
					check = stack.pop();
					if (check == '(' || check == '[')
						return false;
					break;

				case ']':
					check = stack.pop();
					if (check == '(' || check == '{')
						return false;
					break;
				default:
					return (stack.isEmpty());
				}
			}

			// Check Empty Stack
			return (stack.isEmpty());
		}

		// Driver code
		public static void main(String[] args)
		{
			String expr="( [ [ { } ] ] )";

			// Function call
			if (balancingBracket(expr))
				System.out.println("The entered String has Balanced Brackets ");
			else
				System.out.println("The entered Strings do not contain Balanced Brackets ");
		}
	}


