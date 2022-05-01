import java.util.*;

public class APerfectlyBalancedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			boolean ok = false;
			Set<Character> set = new TreeSet<>();
			for (int i = 0; i < s.length(); i++) {
				set.add(s.charAt(i));
			}
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != s.charAt((i % set.size()))) {
					ok = true;
				}
			}
			System.out.println(ok ? "NO" : "YES");
		}
	}
}
