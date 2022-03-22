import java.util.*;

public class SushiForTwo {
	public static int letsGo(int[] arr) {
		int n=arr.length,prevCnt=0,curCnt=1,maxLen=0;
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[i-1]) {
				curCnt++;
			}else {
				prevCnt=curCnt;
				curCnt=1;
			}
			maxLen=Math.max(maxLen, Math.min(prevCnt, curCnt));
		}
		return 2*maxLen;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println(letsGo(arr));
	}
}
