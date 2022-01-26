import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			double l = sc.nextDouble(), r = sc.nextDouble();
			double	b = Math.max(l, ((r / 2) + 1));
			System.out.println((int)r % (int)b);
		}
	}
}
