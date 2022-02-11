import java.util.Scanner;

public class NauuoAndVotes {
    void solve(int a,int b,int c) {
if (a>b){
    if (a<=b+c){
        System.out.println("?");
    }else{
        System.out.println("+");
    }
}else if (b>a){
    if (b<=a+c){
        System.out.println("?");
    }else{
        System.out.println("-");
    }
}else{
    if(c==0){
        System.out.println("0");
    }else{
        System.out.println("?");
    }
}
    }
    public static void main(String[] args) {
        NauuoAndVotes obj=new NauuoAndVotes();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
        obj.solve(x,y,z);
    }
}
