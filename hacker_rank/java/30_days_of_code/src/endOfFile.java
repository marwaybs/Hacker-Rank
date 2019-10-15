import java.util.Scanner;

public class endOfFile {
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNext() == true){
            System.out.println(i +" "+ scan.nextLine());
            i++;
        }
	}
}
