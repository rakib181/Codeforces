import java.util.*;

public class FoodForAnimals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt(),b= sc.nextInt(),c=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
            x-=a;y-=b;
            if(Math.max(0,x)+Math.max(0,y)>c){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
