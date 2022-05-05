import java.util.*;

public class CaninePoetry {
   static int[] used;
    static int letsTry(char[] ch,int n){
        used=new int[n+1];
        Arrays.fill(used,0);int ans=0;
        for (int i=1;i<=n;i++){
            int used_need=0;
            if(ch[i]==ch[i-1] && used[i-1]==0){
                used_need=1;
            }
            if(i>1){
                if( ch[i]==ch[i-2] && used[i-2]==0){
                    used_need = 1;
                }
            }
            used[i]=used_need;
            ans+=used[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char[] ch=s.toCharArray();int n=ch.length;
            System.out.println(letsTry(ch,n-1));
        }
    }
}
