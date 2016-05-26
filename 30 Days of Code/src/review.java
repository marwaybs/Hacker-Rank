import java.io.*;
import java.util.*;

public class review {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<cases;i++){
        	String word = scan.nextLine();
        	String twos = "";
        	String odd = "";
        	String[] letters = new String[word.length()];
        	for(int j =0; j< word.length(); j++){
        		letters[j] = word.substring(j,j+1);
        	}
        	for(int j=0; j<word.length();j+=2){
        		twos += letters[j];
        	}
        	for(int j=1; j<word.length();j+=2){
        		odd += letters[j];
        	}
        	String ans = twos + " " + odd;
        	System.out.println(ans);
        }
    }
}