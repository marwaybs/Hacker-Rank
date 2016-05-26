import java.io.*;
import java.util.*;


public class arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        String output = "";
        for(int i = 1; i<n; i++){
            output += Integer.toString(arr[n-i]) + " ";
        }
        output+=Integer.toString(arr[0]);
        System.out.println(output);
    }
}
