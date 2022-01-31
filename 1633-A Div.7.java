import java.util.Scanner;

public class DivSeven {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                for (int i = 0; i < t; i++) {
                    String s = sc.next();
                    int number = Integer.parseInt(s);
                    int flag = 0;
                    if (number % 7 == 0) {
                        System.out.println(number);
                    } else {
                        for (int index = 0; index < s.length(); index++) {
                            for (int k = 1; k <= 9; k++) {
                                s = s.substring(0, index) + ("" + k) + s.substring(index + 1);
                                if (Integer.parseInt(s) % 7 == 0) {
                                    System.out.println(s);
                                    flag = 1;
                                    break;
                                }
                            }
                            if (flag == 1) {
                                break;
                            }
                        }
                    }
                }
            }
        }
 
