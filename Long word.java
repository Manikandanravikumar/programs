/*Long Word: Consider a string input1. If length of input1 exceeds 10 characters, return a special abbreviation else, return input1. Forming special
abbreviation:
  consider 1st and last characters from input1
  Count the remaining characters in between
  
Example 1:
input1 = Localization
Expected output = L10n

Explanation: The length of the input string is 12. Since the length is greater than 10, the output should be the special abbreviation formed by concatenating
-the first character of the input string (L'),
the count of all characters in between the first and last character of the input string (10), and
- the last character of the input string ('n').

Example2:
input1: internationalization
Expected output: i18n

Explanation: Length of the input string is 20. As it is greater than 10, output should be special abbreviation
- 1st character ('i')
- Count of all characters in between 1st and last character (18)
- Last character of input string ('n')

Example3:
input1: word
Expected output: word

Explanation: Length of the input string is 4, which is less than 10. So the
output will be same as input.*/

//CODE:
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
		String input1="Localization";
		int b=input1.length();
		int m=b-2;
		if(b>10)
		{
		    System.out.println(input1.charAt(0)+""+m+""+input1.charAt(b-1));
		}
	}
}

//OUTPUT:
L10n
