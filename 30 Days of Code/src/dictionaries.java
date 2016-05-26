
import java.util.*;
import java.io.*;

class dictionaries{
    public static void main(String []argh){
    	Scanner scan = new Scanner(System.in);
    	int numNames = scan.nextInt();
    	scan.nextLine();
    	Map<String, String> phoneBook = new HashMap<String, String>();
    	for(int i = 0; i<numNames; i++){
    		String name = scan.next();
    		String number = scan.next();
    		phoneBook.put(name, number);
    	}
    	while(scan.hasNext() == true){
    		String name = scan.next();
    		if(phoneBook.containsKey(name)==true){
    			System.out.println(name +"="+ phoneBook.get(name));
    		}
    		else{
    			System.out.println("Not found");
    		}
    	}
    }
}
