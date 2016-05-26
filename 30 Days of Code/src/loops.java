import java.io.*;
import java.util.*;

public class loops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}