import java.util.Scanner;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++){
            int n=sc.nextInt(),flag=0;
            String s=sc.next();
            for (int i=0;i<n-1;i++){
                for (int j=i+1;j<n;j++){
                    if (s.charAt(i)==s.charAt(j) && s.charAt(j)==s.charAt(j-1)){
                        break;
                    }else if(s.charAt(i)==s.charAt(j) && s.charAt(j)!=s.charAt(j-1)){
                        flag=1;
                        break;
                    }
                }
                if (flag==1){
                    break;
                }
            }
            if (flag==1){
                System.out.println("NO");
            }else
                System.out.println("YES");
        }
    }
}
