import java.util.HashMap;
import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            String s = sc.next();
            System.out.print(s.charAt(0));
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 1; i < s.length() - 1; i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), 1);
                } else {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
                if (map.get(s.charAt(i)) % 2 != 0) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.print(s.charAt(s.length() - 1));
        }
    }
}
