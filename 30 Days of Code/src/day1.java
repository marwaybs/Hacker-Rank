import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int num;
        double bigNum;
        String word;
        /* Read and save an integer, double, and String to your variables.*/
        num = scan.nextInt();
        bigNum = scan.nextDouble();
        scan.nextLine();
        word = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+num);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d+bigNum);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
		System.out.println(s + word);
        scan.close();
    }
}