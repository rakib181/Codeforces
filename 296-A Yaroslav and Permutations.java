import java.util.*;

public class YoroslavPermutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<n;i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int max=(Collections.max(map.values()));
        /*System.out.println(max);
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
            }*/
        if ((arr.length+1)/2 >= max){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        }
    }

