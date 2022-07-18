/**Given a number K and a string Str containing lower case letters, write a program to find the K lexicographical character S and 
the number of occur character N in the given string. Multiple occurrences of characters need to be considered while computing the K character.Lexicographical order, 
also called dictionary order, is a generalization of the way words are alphabetically ordered based on the alphabetical order component letters.

Read the input from STDIN and print the output to STDOUT. Do not write arbitrary strings while reading the input or while printing, as these contributed standard output.

Constraint:
1) 1 <= K<= String Length.
II) There are no special symbols or spaces in the input string.

Input Format:
The first line of input contains Str. The second line of input contains K.

Output Format:
The first line of output contains S. The second line of output contains N.

Sample Input1:
ajfifdkjsabdevg
4

Sample Output1:
d
2 **/


Program:
import java.util.Arrays;
import java.util.*;
public class Main{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       String s= sc.nextLine();
       char charArray[]=s.toCharArray();
       Arrays.sort(charArray);
       String s1 = new String(charArray);
       char ch = s1.charAt(4);
       System.out.println(ch);
       int count = 0;
       for (int i = 0; i < s1.length(); i++) {
           if (s1.charAt(i) == ch) {
               count++;
           }
       }
       System.out.println(count);
   }
}
