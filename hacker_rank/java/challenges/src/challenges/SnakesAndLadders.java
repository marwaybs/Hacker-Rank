package challenges;

import java.io.*;
import java.util.*;

public class SnakesAndLadders {

    public static void main(String[] args) {
        int currentSquare = 1;
        Scanner scan = new Scanner(System.in);
        int numOfTestCases = scan.nextInt();
        int numOfLadders;
        int numOfsnakes;
        for (int testCase = 0; testCase < numOfTestCases; testCase++){ 
        	numOfLadders = scan.nextInt();
        	Map<Integer, Integer> ladders = new HashMap<Integer, Integer>();
        	for (int newLadder = 0; newLadder < numOfLadders; newLadder++){//Collecting all ladders into a list
        		ladders[newLadder] = scan.nextLine();
        	}
        	int numOfSnakes = scan.nextInt();
        	Map<Integer, Integer> snakes = new HashMap<Integer, Integer>();
        	for (int newSnake = 0; newSnake < numOfLadders; newSnake++){//Collecting all snakes into a list
        		snakes[newSnake] = scan.nextInt();
        	}
        }
    }
}