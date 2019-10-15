import java.util.Scanner;
//Little Bob loves chocolate, and he goes to a store with  in his pocket. The price of each chocolate is . The store offers a discount: for every  wrappers he gives to the store, he gets one chocolate for free. How many chocolates does Bob get to eat?

//Input Format: 
//The first line contains the number of test cases. 
//lines follow, each of which contains three integers: starting money, cost, wrapper cost.

//Output Format: 
//Print the total number of chocolates Bob eats.
public class chocolateFeast {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputTestCases = scan.nextLine();
        int testCases = Integer.parseInt(inputTestCases);        
        int[][] input;
        input = new int[testCases][3];
        for (int numOfTestCase=0;numOfTestCase < input.length; numOfTestCase++){
        	String testCase = (scan.nextLine());
        	String[] parts = testCase.split(" ");
        	for (int i = 0; i<3; i++){
        		input [numOfTestCase][i] = Integer.parseInt(parts[i]);
        	}
        }
        scan.close();
        for (int numOfTestCase=0;numOfTestCase < input.length; numOfTestCase++){
        	int chocolates = input[numOfTestCase][0] / input[numOfTestCase][1];
        	int wrappers = chocolates;
        	int newChocolates = 0;
        	while (wrappers / input[numOfTestCase][2] !=0){
        		newChocolates = wrappers / input[numOfTestCase][2];
        		chocolates += newChocolates;
        		wrappers = wrappers % input[numOfTestCase][2];
        		wrappers += newChocolates;
        	}
        	System.out.println(chocolates);
        }
    }
}

