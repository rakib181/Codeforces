import java.util.Scanner;

public class GCDProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),x,y,z,w;
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            if (n%2==0){
                x=n-3;
                System.out.println(x+" "+"2"+" "+"1");
            }else
            {
                x=n-1;
                y=x/2;
                z=y+1;
                w=y-1;
                if (z%2==0 && w%2==0){
                    z+=3;
                    w-=3;
                    if (w==1 || z==1){
                        z-=2;
                        w+=2;
                        System.out.println(w+" "+z+" "+"1");
                    }else
                    System.out.println(z+" "+w+" "+"1");
                }else
                System.out.println(z+" "+w+" "+"1");

            }
        }
    }
}
