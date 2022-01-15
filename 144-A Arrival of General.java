import java.util.*;

public class ArrivalOfGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        int max = arr1[n-1], min = arr1[0];
        int left = 0, right = n-1;
        while(left < n || right >= 0){
            if(arr[left] != max)
                left++;
            if(arr[right]  != min)
                right--;
            if(arr[left] == max && arr[right]  == min)
                break;
        }
        if(left > right)

            System.out.println(left - 0 + n-right-2);
        else
            System.out.println(left - 0 + n-right-1);
    }
}
