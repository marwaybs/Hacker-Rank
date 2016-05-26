import java.io.*;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String isPalindrome = "Yes";
        for(int i=0; i<A.length();i++){
        	if (A.substring(i,i+1).compareTo(A.substring(A.length()-i-1,A.length()-i))>0){
        		isPalindrome="No";
        	}
        }
        System.out.println(isPalindrome);
    }
}
