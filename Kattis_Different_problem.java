import java.util.Scanner;

public class Kattis_Different_problem {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNextLong()) {
	    long a = sc.nextLong();
	    long b = sc.nextLong();
	    System.out.println(Math.abs(a-b));
	}
   }
    
}