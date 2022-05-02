import java.util.*;
public class InfiniteReplacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next(),p=sc.next();
            Map<Character,Integer>mp=new HashMap<>();
            for(int i=0;i<p.length();i++){
                if(!mp.containsKey(p.charAt(i))){
                    mp.put(p.charAt(i),1);
                }else{
                    mp.put(p.charAt(i),mp.get(p.charAt(i))+1);
                }
               }
               if(p.equals("a")){
                   System.out.println("1");
               }else if(!mp.containsKey('a')){
                   System.out.println((long)1<<s.length());
               }else{
                   System.out.println("-1");
               }
        }
    }
}
