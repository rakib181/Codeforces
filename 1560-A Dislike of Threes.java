import java.util.Scanner;
public class DislikeOfTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,c=0;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            for (int j=1;j<=1666;j++){
                if (j%3==0 || j%10==3){
                    continue;
                }else {
                    c++;
                    s = j;
                    if (c == k) {
                        System.out.println(s);
                        break;
                    }
                }
          }
            c=0;
        }
    }
}
