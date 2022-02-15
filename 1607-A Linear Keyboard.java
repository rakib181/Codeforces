import java.util.*;
import java.util.ArrayList;

public class LinearKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            String s = sc.next(), s1 = sc.next();
            int y = 0, k = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < s1.length(); j++) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == s1.charAt(j)) {
                        list.add(i+1);
                        break;
                    }
                }
            }
            for (int i = 0; i < list.size()-1; i++) {
                k = list.get(i) - list.get(i + 1);
                y += Math.abs(k);
            }
            System.out.println(y);
        }
    }
}
