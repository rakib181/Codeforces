import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
            }
        String s = sc.next();
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '1') {
                sum += arr[0];
            } else if (s.charAt(j) == '2') {
                sum += arr[1];
            } else if (s.charAt(j) == '3') {
                sum += arr[2];
            } else {
                sum += arr[3];
            }
        }
        System.out.println(sum);
    }
}
