import java.util.*;

public class IntegerDiversity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=0;
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer>mp=new HashMap<>();
            for(int i=0;i<n;i++){
                if (mp.containsValue(arr[i])){
                    if(arr[i]!=0 && !mp.containsValue(-arr[i])) {
                        k++;
                        mp.put(k, -arr[i]);
                    }
                }else{
                    k++;
                    mp.put(k,arr[i]);    
                }
            }
            System.out.println(mp.size());
        }
    }
}
