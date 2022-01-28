import java.util.HashSet;
import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character>set=new HashSet<>();
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                set.add(sc.next().charAt(0));
            }
        }
        if (set.contains('C') || set.contains('M') || set.contains('Y')){
            System.out.println("#Color");
        }else
            System.out.println("#Black&White");

        }
    }
