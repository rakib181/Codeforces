import java.util.*;
public class PointsOnTheLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt(),c=0,flag=0;
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
           arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr.length==1){
            System.out.println("0");
        }else {
            List<Integer>list=new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] - arr[i] <= d) {
                        c++;
                    } else {
                     list.add(c+1);
                     c=0;
                        break;
                    }
                }
                if(c>0){
                	list.add(c+1);
                	c=0;
                }
            }
            if (list.isEmpty()){
                System.out.println("0");
            }else {
                int max=Collections.max(list);
                System.out.println(n-max);
            }
        }
    }
}
