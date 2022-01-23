import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			long x = (1 * a) + (2 * b) + (3 * c);
			long y = x / 2;
			long z =(x - y)-y;
			System.out.println(z);
		}
	}
}
