
//Find the sum of all the numbers smaller than the input and are multiples of 3 and 5
//first input is the number of test cases, then the test cases
import java.io.*;
import java.util.*;

public class MultiplesOf3And5 {

    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int testCases = scan.nextInt();
    	for(int i=0;i<testCases;i++){
    		int num = scan.nextInt();
    		Set<Integer> set = new HashSet<Integer>();
    		for(int multiple=3;multiple<num;multiple+=3){
    			set.add(multiple);
    		}
    		for(int multiple=5;multiple<num;multiple+=5){
    			set.add(multiple);
    		}
    		int sum = set.stream().mapToInt(Integer::intValue).sum();
    		System.out.println(sum);
    	}
    }
}